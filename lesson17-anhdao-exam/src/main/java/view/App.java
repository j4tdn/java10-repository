package view;

import java.sql.Connection;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;

import connection.DbConnection;
import connection.DbProvider;
import persistence.Item;
import persistence.ItemDate;
import persistence.ItemDto;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemService;

public class App {

	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupService();
	}
	
	private static ItemService itemService;
	static {
		itemService = new ItemService();
	}
	
	public static void main(String[] args) {

		Connection connection = DbConnection.getConnection();
		System.out.println(connection);

		//1. Liệt kê các mặt hàng được bán trong ngày 23-11-2019. Với ngày bán là tham số truyền vào kiểu dữ liệu LocalDate.
				List<ItemDate> itemByDate = itemService.getItembyDate(LocalDate.of(2019, 11, 23));
				show(itemByDate);
				System.out.println("=============");
		//2. Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng Kết quả trả về có dạng như sau
		List<ItemGroupDto> itemGrp = itemGroupService.getItemsByGroup();
		show(itemGrp);
		System.out.println("=============");
		
		// 3.Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2020. Với năm là tham số truyền vào.
		List<String> itemBestSeller = itemService.getItemBestSeller(2020);
		show(itemBestSeller);
		System.out.println("=============");
		
		//4. Liệt kê danh sách các mặt hàng của mỗi loại hàng	
		List<ItemDto> itemByGr = itemService.getItemByGroup();
		show(itemByGr);
		System.out.println("=============");
	}

	private static <E> void show(List<E> es) {
		for (E e : es) {
			System.out.println(e);
		}
	}
}
