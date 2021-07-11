package view;

import dao.CategoryDAO;
import model.Category;

public class Ex01 {
	public static void main(String[] args) {
		Category c1 = CategoryDAO.getById(5);
		Category c2 = CategoryDAO.getByName("Áo");
		System.out.println(c1);
		System.out.println(c2);
	}
}
