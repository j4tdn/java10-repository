package demo;

import java.util.List;

import service.ItemService;
import service.ItemServiceImpl;

public class Ex03 {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		System.out.println("3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020.");
		List<String> list = itemService.getTopItem(2020, 3);
		show(list);
		
		
	}
	
	private static <E> void show(List<E> elements) {
        elements.forEach(System.out::println);
    }
	
	
}
