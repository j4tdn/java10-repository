package manager;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;

public class WhAllocatedAmountManager {
	public static void main(String[] args) {
		final List<Store> data = getItems();
		final Integer allocationAmount = 300;

		Map<Long, BigDecimal> interpolated = expectedSalesInterpolated(data);
		printMap(interpolated);
		System.out.println("=================");
		Map<Long, BigDecimal> allocationKey = allocationKeyMap(interpolated, sumExpectedSales(interpolated));
		printMap(allocationKey);
		System.out.println("=================");
		Map<Long, BigDecimal> stockPreviousDayMap = stockPreviousDayMap(data);
		BigDecimal sumStockPreviousDay = sumGetValue(stockPreviousDayMap);
		Map<Long, BigDecimal> amountAllocatedmap = amountAllocatedMap(allocationKey, stockPreviousDayMap,
				sumStockPreviousDay, allocationAmount);
		printMap(amountAllocatedmap);
		System.out.println("=================");
		Map<Long, BigDecimal> demandMap = demandMap(interpolated, stockPreviousDayMap);
		demandMap.put(1L, new BigDecimal(22));
		demandMap.put(6L, new BigDecimal(6));
		printMap(demandMap);
		System.out.println("=================");

		Map<Long, BigDecimal> differenceMap = new HashMap<Long, BigDecimal>();

		Set<Entry<Long, BigDecimal>> entrySet = demandMap.entrySet();
		BigDecimal difference = new BigDecimal(0);
		for (Entry<Long, BigDecimal> entry : entrySet) {
			difference = amountAllocatedmap.get(entry.getKey()).subtract(entry.getValue());
			differenceMap.put(entry.getKey(), difference);
		}
		printMap(differenceMap);
		System.out.println("=================");
		System.out.println(sumGetValue(amountAllocatedmap));
		System.out.println("=================");

		BigDecimal newAllocationAmount = new BigDecimal(allocationAmount);

//		List<BigDecimal> differenceArrayList = differenceMap.values().stream()
//				.collect(Collectors.toCollection(ArrayList::new));
//		for (int i = 0; i < differenceArrayList.size(); i++) {
//			System.out.print(differenceArrayList.get(i) + " ");
//		}
//		System.out.println("\n=================");
//		differenceArrayList.sort(new Comparator<BigDecimal>() {
//			@Override
//			public int compare(BigDecimal o1, BigDecimal o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		});
//		System.out.println(differenceArrayList.toString());
		
		
//		BigDecimal tempValue = new BigDecimal(0);
//		for (int i = 0; i < differenceArrayList.size() - 1; i++) {
//			for (int j = i + 1; j < differenceArrayList.size(); j++) {
//				if (differenceArrayList.get(i).equals(differenceArrayList.get(j))) {
//					System.out.print("the first " + differenceArrayList.get(i) + " ,the second " + differenceArrayList.get(j));
//				}
//			}
//		}
//		System.out.println("\n=================");
		Optional<Entry<Long, BigDecimal>> maxEntry = differenceMap.entrySet().stream()
				.max(Comparator.comparing(new Function<Entry<Long, BigDecimal>, BigDecimal>() {
					@Override
					public BigDecimal apply(Entry<Long, BigDecimal> t) {
						return t.getValue();
					}
				}));
		System.out.println(maxEntry.get().getValue());
		
	}

	private static List<Store> getItems() {
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

	/**
	 * Do Allocation. Key: storeId with Long type Value: storeAllocatedAmount after
	 * calculation with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private Map<Long, Integer> doAllocation(List<Store> data, Integer allocationAmount) {
		return null;
	}

	// Wrong
	private static Map<Long, BigDecimal> expectedSalesInterpolated(List<Store> data) {
		Map<Long, BigDecimal> interpolated = new HashMap<Long, BigDecimal>();

		Long referenceId = 0L;
		for (Store eachStore : data) {
			// Case 1: missing expected values
			// have reference and this reference have their own expected sales
			//
			// Case 2: missing expected values
			// have reference and this reference does not have expected sale

			// 1. Check missing expected values

			referenceId = eachStore.getReferenceStoreId();
			interpolated.put(eachStore.getStoreId(), eachStore.getExpectedSales());

			if (eachStore.getExpectedSales() == null && !hasExpectedSaleOfReference(data, referenceId)) {
				// true
				interpolated.put(eachStore.getStoreId(), meanExpectedSale(data));
			} else if (eachStore.getExpectedSales() == null) {
				// false
				interpolated.put(eachStore.getStoreId(), referenceExpectedValues(data, referenceId));
			}
		}
		return interpolated;
	}

	// true
	private static boolean hasExpectedSaleOfReference(List<Store> data, Long referenceId) {
		for (Store eachStore : data) {
			// whether expected sale of reference null or not
			// if true --> reference does not have expected values --> take it
			// if false --> reference has expected values --> calculate mean of
			// expected sales
			if (eachStore.getStoreId() == referenceId && eachStore.getExpectedSales() == null) {
				return false;
			}
		}
		return true;
	}

	// true
	private static BigDecimal referenceExpectedValues(List<Store> data, Long referenceID) {
		for (Store eachStore : data) {
			if (eachStore.getStoreId() == referenceID) {
				return eachStore.getExpectedSales();
			}
		}
		return null;
	}

	// True
	private static BigDecimal meanExpectedSale(List<Store> data) {
		int count = 0;
		MathContext mc = new MathContext(3);
		BigDecimal sum = new BigDecimal(0.0);
		for (Store eachStore : data) {
			if (eachStore.getExpectedSales() != null) {
				count++;
				sum = eachStore.getExpectedSales().add(sum);
			}
		}
		return (sum.divide(new BigDecimal(count)).round(mc));
	}

	private static BigDecimal sumExpectedSales(Map<Long, BigDecimal> expectedSalesInterpolated) {
		BigDecimal sum = new BigDecimal(0);
		Set<Entry<Long, BigDecimal>> entrySet = expectedSalesInterpolated.entrySet();
		for (Entry<Long, BigDecimal> entry : entrySet) {
			sum = sum.add(entry.getValue());
		}
		return sum;
	}

	private static Map<Long, BigDecimal> allocationKeyMap(Map<Long, BigDecimal> expectedSalesInterpolated,
			BigDecimal sumExpectedSales) {
		Map<Long, BigDecimal> allocationKeyMap = new HashMap<Long, BigDecimal>();

		Set<Entry<Long, BigDecimal>> entrySet = expectedSalesInterpolated.entrySet();
		for (Entry<Long, BigDecimal> entry : entrySet) {
			allocationKeyMap.put(entry.getKey(), entry.getValue().divide(sumExpectedSales, 10, RoundingMode.HALF_UP));
		}

		return allocationKeyMap;
	}

	private static void printMap(Map<Long, BigDecimal> map) {
		Set<Entry<Long, BigDecimal>> entrySet = map.entrySet();

		for (Entry<Long, BigDecimal> entry : entrySet) {
			System.out.println(entry);
		}
	}

	private static Map<Long, BigDecimal> stockPreviousDayMap(List<Store> data) {
		Map<Long, BigDecimal> stockPreviousDayMap = new HashMap<Long, BigDecimal>();

		for (Store eachStore : data) {
			stockPreviousDayMap.put(eachStore.getStoreId(), eachStore.getStorePreviousDay());
		}
		return stockPreviousDayMap;
	}

	private static BigDecimal sumGetValue(Map<Long, BigDecimal> stockPreviousDayMap) {
		BigDecimal sum = new BigDecimal(0);

		Set<Entry<Long, BigDecimal>> entrySet = stockPreviousDayMap.entrySet();
		for (Entry<Long, BigDecimal> entry : entrySet) {
			sum = sum.add(entry.getValue());
		}
		return sum;
	}

	private static Map<Long, BigDecimal> amountAllocatedMap(Map<Long, BigDecimal> allocationKeyMap,
			Map<Long, BigDecimal> stockPreviousDayMap, BigDecimal sumStockPreviousDay, Integer allocationAmount) {
		Map<Long, BigDecimal> amountAllocatedMap = new HashMap<Long, BigDecimal>();

		Set<Entry<Long, BigDecimal>> entrySet = allocationKeyMap.entrySet();
		BigDecimal value;
		for (Entry<Long, BigDecimal> entry : entrySet) {
			value = entry.getValue().multiply(sumStockPreviousDay.add(new BigDecimal(allocationAmount)))
					.subtract(stockPreviousDayMap.get(entry.getKey())).setScale(0, RoundingMode.HALF_UP);
			amountAllocatedMap.put(entry.getKey(), value);
		}
		return amountAllocatedMap;
	}

	private static Map<Long, BigDecimal> demandMap(Map<Long, BigDecimal> interpolated,
			Map<Long, BigDecimal> stockPreviousDayMap) {
		Map<Long, BigDecimal> demandMap = new HashMap<Long, BigDecimal>();

		Set<Entry<Long, BigDecimal>> entrySet = interpolated.entrySet();
		BigDecimal value = new BigDecimal(0);
		for (Entry<Long, BigDecimal> entry : entrySet) {
			value = interpolated.get(entry.getKey()).subtract(stockPreviousDayMap.get(entry.getKey())).setScale(0,
					RoundingMode.HALF_UP);
			if (value.signum() == 1) {
				demandMap.put(entry.getKey(), value);
			} else {
				demandMap.put(entry.getKey(), BigDecimal.ZERO);
			}
		}
		return demandMap;
	}
}
