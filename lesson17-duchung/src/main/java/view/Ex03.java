package view;

import java.util.List;

import persistence.HangTonKho;
import service.HangTonKhoService;

public class Ex03 {
	private static HangTonKhoService hangTonKhoService;
	// khoi tao
	static {
		hangTonKhoService = new HangTonKhoService();
	}

	public static void main(String[] args) {
		System.out.println(
				"3. Thống kê số lượng hàng tồn kho của mỗi loại hàng \n Fomart: MaLoai, TenLoai, DS[MH:SoLuong], TongSoLuong");
		List<HangTonKho> e = hangTonKhoService.getAll();
		e.forEach(System.out::println);
	}

}
