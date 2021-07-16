package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import connection.DbConnection;
import entity.LoaiHang;

public class Ex07 {

	private static final String filePath = "loaihang.txt";

	public static void main(String[] args) throws FileNotFoundException {
		Path pathFile = Paths.get(filePath);
		List<LoaiHang> listOfProducts = readLines(pathFile, LoaiHang::transfer);
		listOfProducts.forEach(System.out::println);
		if(insertProductType(listOfProducts)) {
			System.out.println("Insert Successfully");
		}
	}

	public static boolean insertProductType(List<LoaiHang> listOfProducts) {
		String sql = "INSERT INTO loaihang (MaLoai, TenLoai) VALUES (?, ?)";
		Connection myConn;
		PreparedStatement stmt;

		myConn = DbConnection.getConnection();

		for (LoaiHang product : listOfProducts) {
			try {
				stmt = myConn.prepareStatement(sql);
				stmt.setInt(1, product.getMaLoai());
				stmt.setString(2, product.getTenLoai());

				if (stmt.executeUpdate() > 0) {
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public static <R> List<R> readLines(Path pathFile, Function<String, R> func) {
		List<R> result = new ArrayList<>();
		try {
			List<String> mathangAsString = Files.readAllLines(pathFile);
			for (String line : mathangAsString) {
				// transform from String type to R type
				Optional<R> opt = Optional.ofNullable(func.apply(line));
				if (opt.isPresent()) {
					result.add(opt.get());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	public static void close(AutoCloseable... closeables) {
		Arrays.stream(closeables).forEach(t -> {
			try {
				t.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}
