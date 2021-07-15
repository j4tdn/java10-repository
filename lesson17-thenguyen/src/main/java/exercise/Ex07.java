package exercise;

import java.io.IOException;

import service.ItemGroupService;

public class Ex07 {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupService();
	}

	public static void main(String[] args) {

		boolean save;
		try {
			save = itemGroupService.save();
			System.out.println(save);
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		}
	}

}
