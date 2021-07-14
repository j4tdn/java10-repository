package view;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import dao.ProductDAO;
import entities.Product;

public class Ex05 {
	public static void main(String[] args) {
		List<Product> product = ProductDAO.getByDate(LocalDate.of(2020, Month.DECEMBER, 18));
		product.forEach(System.out::println);
	}
}
