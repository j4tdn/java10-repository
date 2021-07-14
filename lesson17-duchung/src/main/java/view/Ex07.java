package view;

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
		} catch (NumberFormatException | IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

}
