package view;

import java.util.List;

import dao.CategoryDAO;
import entities.CategoryDto;

public class Ex03 {
	public static void main(String[] args) {
		List<CategoryDto> list = CategoryDAO.getDetail();
		list.forEach(System.out::println);
	}
}
