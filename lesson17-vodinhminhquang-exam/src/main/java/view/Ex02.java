package view;

import dao.ItemGroupDao;

public class Ex02 {
	public static void main(String[] args) {
		ItemGroupDao itemGroupDao = new ItemGroupDao();
		itemGroupDao.getItemsInStorage().forEach(System.out::println);
	}

}
