package ex;

import dao.CategoryDao;

public class Ex10 {
	private static CategoryDao categoryDao = new CategoryDao();

	public static void main(String[] args) {

		System.out.println("10. Liệt kê các mặt hàng theo mã loại. Sử dụng procedure đã tạo trong Lesson16");
		System.out.println("");
		System.out.println(categoryDao.getId(1));
	}

}