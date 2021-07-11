package view;

import java.util.List;

import dao.ProductDAO;
import model.Product;

public class Ex02 {
	public static void main(String[] args) {
		List<Product> list = ProductDAO.getByCategoryIdAndSaleOut(Integer.valueOf(1), Double.valueOf(100), Double.valueOf(500));
		list.forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		List<Product> list2 = ProductDAO.getByCategoryName("Quần");
		list2.forEach(System.out::println);
	}
}
