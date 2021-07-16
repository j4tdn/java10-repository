package view;

import service.ItemGroupService;

public class Ex07 {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {
		System.out.println("7. Cho dữ liệu các loại hàng từ file loaihang.txt");
		boolean isSaved = itemGroupService.saveFile();
		System.out.println(isSaved);
	}
}
