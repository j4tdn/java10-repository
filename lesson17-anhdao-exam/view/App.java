package view;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Properties;

import connection.DbConnection;
import connection.DbProvider;
import dao.BillDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.BillService;
import service.ItemGroupService;
import service.ItemService;
import service.OrderService;

public class App {

	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupService();
	}
	
	private static ItemService itemService;
	static {
		itemService = new ItemService();
	}
	
	private static BillService billService;
	static {
		billService = new BillService();
	}
	private static OrderService orderService;
	static {
		orderService = new OrderService();
	}
	
	public static void main(String[] args) {

		Connection connection = DbConnection.getConnection();
		System.out.println(connection);

		List<ItemGroup> itemGrpAll = itemGroupService.getAll();
		show(itemGrpAll);
		System.out.println("=============");
		
		// liet ke theo ma loai
		List<ItemGroup> itgsById = itemGroupService.getItemGroups(3);
		show(itgsById);
		System.out.println("=============");
		// liet ke theo ten loai
		List<ItemGroup> itgsByName = itemGroupService.getItemGroups("Áo");
		show(itgsByName);
		System.out.println("=============");
		//insert loại hàng
		//itemGroupService.save(new ItemGroup(6, "Item Group 6"));

		System.out.println("=============");
		
		//2. Liệt kê các mặt hàng theo mã loại và giá bán trung bình từ 100 đến 500 trong hệ thống
		List<Item> itemByIDPrice = itemService.getItem(2);
		show(itemByIDPrice);
		System.out.println("=============");
		//3. Thống kê số lượng hàng tồn kho của mỗi loại hàng
		 //  Thông tin hiển thị: MaLoai, TenLoai, DS[MH:SoLuong], TongSoLuong
	
		List<ItemGroupDto> itemByAmount = itemGroupService.getItemGroups();
		show(itemByAmount);
	
		//4. Tạo hóa đơn cho đơn hàng bất kì.
		//Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
		
		System.out.println("=============");
		Double totalOfMoney = billService.getToTalOfMoney(1);
		System.out.println("totalOfMoney = " + totalOfMoney);
		//billService.insertBill(1, 1, totalOfMoney);
		System.out.println("=============");
		
	    //5. Liệt kê các mặt hàng được bán trong ngày bất kì
		List<Item> itemByDate = itemService.getItemByDate(Date.valueOf("2020-12-18"));
		show(itemByDate);
		System.out.println("=============");
		
		// 6. Cập nhật tổng tiền cho đơn hàng bất kì thành 999
		orderService.UpDateMoney(999,1);

		//		7. Cho dữ liệu các loại hàng từ file loaihang.txt
		//		* loaihang.txt
		//		* 6, Nón
		//		* 7, Bao tay
		//		  Viết chương trình insert data từ file loaihang.txt vào bảng LoaiHang
		//     itemGroupService.insertFile();
		
		//10. Liệt kê các mặt hàng theo mã loại. Sử dụng procedure đã tạo trong Lesson16
		List<Item> itemPro = itemService.getItemsProcedure(2);
		show(itemPro);
	}

	private static <E> void show(List<E> es) {
		for (E e : es) {
			System.out.println(e);
		}
	}
}
