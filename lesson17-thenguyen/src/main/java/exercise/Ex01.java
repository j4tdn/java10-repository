package exercise;

import java.util.List;

import persistence.ItemGroup;
import persistence.Items;
import service.ItemGroupService;

public class Ex01 {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService=new ItemGroupService();
	}
	public static void main(String[] args) {
		System.out.println("1. Liệt kê toàn bộ thông tin các loại hàng trong hệ thống \r\n"
				+ "   + Liệt kê theo MaLoai\r\n"
				+ "   + Liệt kê theo TenLoai\r\n"
				+ "   + Thêm loại hàng vào trong hệ thống");
		System.out.println("-------------------------------");
		List<ItemGroup> itemGroupAll = itemGroupService.getAll();
		itemGroupAll.forEach(System.out::println);
		System.out.println("==============");
		List<ItemGroup> itgsById = itemGroupService.getItemGroups(3);
		itgsById.forEach(System.out::println);
		System.out.println("==============");
		List<ItemGroup> itgsByName = itemGroupService.getItemGroups("Áo");
		itgsByName.forEach(System.out::println);
		System.out.println("==============");
		boolean save = itemGroupService.save(new ItemGroup(12, "Dép"));
		System.out.println(save);
		

	}
	
}
