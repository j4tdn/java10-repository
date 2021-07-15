package ex;

import dao.CategoryDao;

public class Ex07 {
	private static CategoryDao categoryDao = new CategoryDao();

	public static void main(String[] args) {
		
		System.out.println("7. insert data từ file loaihang.txt vào bảng LoaiHang");
		boolean save = categoryDao.insertData();
		System.out.println("Insert success: " +save);
	}

}