package demo;

import java.util.List;

import persistence.ListItemOfIGroupDto;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex04 {
private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("4. Liệt kê danh sách các mặt hàng của mỗi loại hàng");
		List<ListItemOfIGroupDto> List = itemService.getListItemOfIGroupDto();
		List.forEach(System.out::println);
	}
}
