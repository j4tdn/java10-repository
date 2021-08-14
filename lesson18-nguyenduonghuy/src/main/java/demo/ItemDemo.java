package demo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroup;
import persistence.OrderDetail;
import service.ItemService;
import service.impl.ItemServiceImpl;

public class ItemDemo {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		// 1
		List<Item> items = itemService.get(LocalDate.parse("2020-12-18"));
		for (Item item : items) {
			for (OrderDetail orderDetail : item.getOrderDetail()) {
				System.out.println(item.getId() + " - " + item.getName() + " - " 
												+ orderDetail.getOrder().getTimeOrder().toLocalTime());
			}
		}
		System.out.println("---------------");
		
		// 3
		List<String> list = itemService.getQuantity(2020, 3);
		list.forEach(System.out::println);
		System.out.println("---------------");
		
		// 4
		List<Item> listItems = itemService.getAll();
		List<ItemGroup> listItemGroups = listItems.stream()
												  .map(i -> i.getItemGroup())
												  .collect(Collectors.toList());
		List<Integer> quantities = listItems.stream()
											.map(i -> i.getItemSizes().stream().mapToInt(is -> is.getQuantity()).sum())
											.collect(Collectors.toList());
		for (int i = 0; i < listItems.size(); i++) {
			System.out.println(listItemGroups.get(i) + " " + listItems.get(i) + " " + quantities.get(i));
		}
	}
}
