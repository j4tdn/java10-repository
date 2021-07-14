package view;

import dao.CategoryDAO;
import entities.Category;

public class Ex10 {
	public static void main(String[] args) {
		Category category = CategoryDAO.getById(3);
		System.out.println(category);
	}
}
