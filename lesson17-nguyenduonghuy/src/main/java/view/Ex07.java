package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import dao.CategoryDAO;
import entities.Category;

public class Ex07 {
	private static final String PATH = "loaihang.txt";
	
	public static void main(String[] args) {
		File file = createFile(PATH);
		List<Category> listCategories = readFile(file, s -> transfer(s));
		listCategories.forEach(System.out::println);
		
		System.out.println("----------------");
		
//		listCategories.forEach(c -> CategoryDAO.save(c));
		CategoryDAO.getAll().forEach(System.out::println);
	}
	
	private static File createFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				Files.createFile(file.toPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
	
	private static List<Category> readFile(File file, Function<String, Category> func) {
		List<Category> list = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			for (String line : lines) {
				Optional<Category> opt = Optional.ofNullable(func.apply(line));
				if (opt.isPresent()) {
					list.add(opt.get());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private static Category transfer(String line) {
		String[] tmps = line.split(", ");
		if (tmps.length != 2) {
			return null;
		}
		return new Category(Integer.parseInt(tmps[0]), tmps[1]);
	}
}
