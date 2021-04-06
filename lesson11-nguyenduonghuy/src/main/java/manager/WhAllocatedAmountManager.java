package manager;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ToDoubleFunction;

public class WhAllocatedAmountManager {
	public static void main(String[] args) {
		final List<Store> data = getItems();
		final Integer allocationAmount = 300;

		Map<Long, BigDecimal> e = fillingMissingExpectedSales(data);
		for (Entry<Long, BigDecimal> entry : e.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		Map<Long, BigDecimal> e1 = calculateAllocationKey(e);
		for (Entry<Long, BigDecimal> entry : e1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		Map<Long, BigDecimal> e2 = calculateAmountAllocated(data, allocationAmount, e1);
		for (Entry<Long, BigDecimal> entry : e2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
	
	}

	private static List<Store> getItems() {
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), new Store(11L, null, bd(22), null, Boolean.FALSE));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value).setScale(1, RoundingMode.HALF_UP);
	}

	/**
	 * Do Allocation. Key: storeId with Long type Value: storeAllocatedAmount after
	 * calculation with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private static Map<Long, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
		return null;
	}

	private static Map<Long, BigDecimal> fillingMissingExpectedSales(List<Store> data) {
		Map<Long, BigDecimal> interpolated = new HashMap<>();

		for (Store store : data) {
			if (store.getSelected()) {
				interpolated.put(store.getStoreId(), store.getExpectedSales());

				if (store.getExpectedSales() == null) {
					for (Store store2 : data) {
						if (store.getReferenceStoreId() != null
								&& store.getReferenceStoreId().equals(store2.getStoreId())) {
							interpolated.put(store.getStoreId(), store2.getExpectedSales());
						}

						if (store.getReferenceStoreId() == null || (store.getReferenceStoreId() != null
								&& store.getReferenceStoreId().equals(store2.getStoreId())
								&& store2.getExpectedSales() == null)) {
							double sum = data.stream().mapToDouble(new ToDoubleFunction<Store>() {

								@Override
								public double applyAsDouble(Store s) {
									if (s.getExpectedSales() != null) {
										return s.getExpectedSales().doubleValue();
									}
									return 0;
								}
							}).sum();

							int size = 0;
							for (Store store3 : data) {
								if (store3.getExpectedSales() != null) {
									size++;
								}
							}
							BigDecimal avg = BigDecimal.valueOf(sum / size).setScale(1, RoundingMode.HALF_EVEN);
							interpolated.put(store.getStoreId(), avg);
						}
					}
				}
			}
		}
		return interpolated;
	}

	private static Map<Long, BigDecimal> calculateAllocationKey(Map<Long, BigDecimal> interpolated) {
		List<BigDecimal> expectedSales = new ArrayList<>();
		for (Entry<Long, BigDecimal> e : interpolated.entrySet()) {
			if (e.getValue() != null) {
				expectedSales.add(e.getValue());
			}
		}

		double sumExpectedSales = Math.round(expectedSales.stream().mapToDouble(e -> e.doubleValue()).sum() * 10) /10;

		Map<Long, BigDecimal> allocationKey = new HashMap<>();
		for (Entry<Long, BigDecimal> e : interpolated.entrySet()) {
			if (e.getValue() != null) {
				allocationKey.put(e.getKey(), BigDecimal.valueOf(e.getValue().doubleValue() / sumExpectedSales)
						.setScale(10, RoundingMode.HALF_UP));
			}
		}

		return allocationKey;
	}
	
	private static Map<Long, BigDecimal> calculateAmountAllocated(List<Store> data, Integer allocationAmount, Map<Long, BigDecimal> allocationKey) {
		double sumStorePreviousDay = 0;
		for (Store store : data) {
			if (store.getSelected()) {
				sumStorePreviousDay += store.getStorePreviousDay().doubleValue();
			}
		}
		
		Map<Long, BigDecimal> amountAllocatedMap = new HashMap<>();
		
		for (Store store : data) {
			for (Entry<Long, BigDecimal> entry : allocationKey.entrySet()) {
				if (store.getStoreId() == entry.getKey()) {
					BigDecimal amountAllocated = BigDecimal.valueOf(entry.getValue().doubleValue() * (allocationAmount + sumStorePreviousDay) - store.getStorePreviousDay().doubleValue()).setScale(0, RoundingMode.HALF_UP);
					
					if (amountAllocated.intValue() > 0) {
						amountAllocatedMap.put(entry.getKey(), amountAllocated);
					} else {
						amountAllocatedMap.put(entry.getKey(), bd(0));
					}
				}
			}
		}
			
		Integer checkAllocationAmount = 0;
		for (Entry<Long, BigDecimal> entry : amountAllocatedMap.entrySet()) {
			checkAllocationAmount += entry.getValue().intValue();
		}
		
		if (checkAllocationAmount == allocationAmount) {
			return amountAllocatedMap;
		} else {
//			return amountAllocatedMap;
			return fixRoundingIssues(data, allocationAmount, checkAllocationAmount, fillingMissingExpectedSales(data), amountAllocatedMap);
		}
	}
	
	private static Map<Long, BigDecimal> fixRoundingIssues(List<Store> data, Integer allocationAmount, Integer checkAllocationAmount, Map<Long, BigDecimal> interpolated, Map<Long, BigDecimal> amountAllocatedMap) {
		Map<Long, BigDecimal> demandMap = new HashMap<>();
		for (Store store : data) {
			for (Entry<Long, BigDecimal> store2 : interpolated.entrySet()) {
				if (store.getStoreId() == store2.getKey()) {
					Long demand = store2.getValue().longValue() - store.getStorePreviousDay().longValue();
					BigDecimal demandBd = (demand > 0) ? bd(demand) : bd(0);
					demandMap.put(store.getStoreId(), demandBd.setScale(0, RoundingMode.HALF_UP));
				}
			}
		}
		
		if (checkAllocationAmount > allocationAmount) {
			Map<Long, BigDecimal> differenceMap = new HashMap<>();
			for (Entry<Long, BigDecimal> store : amountAllocatedMap.entrySet()) {
				for (Entry<Long, BigDecimal> store2 : demandMap.entrySet()) {
					if (store.getKey() == store2.getKey()) {
						Long difference = store.getValue().longValue() - store2.getValue().longValue();
						differenceMap.put(store.getKey(), bd(difference).setScale(0, RoundingMode.HALF_UP));
					}
				}
			}
			Optional<Entry<Long, BigDecimal>> maxEntry = differenceMap.entrySet().stream()
														.max((Entry<Long, BigDecimal> e1, Entry<Long, BigDecimal> e2) -> e1.getValue().compareTo(e2.getValue()));
			
			for (Entry<Long, BigDecimal> store : amountAllocatedMap.entrySet()) {
				if (store.getKey() == maxEntry.get().getKey()) {
					long finalAmountAllocated = store.getValue().longValue() - 1;
					amountAllocatedMap.put(store.getKey(), bd(finalAmountAllocated).setScale(0, RoundingMode.HALF_UP));
				}
			}
			return amountAllocatedMap;
		}
		
		return null;
	}
}
