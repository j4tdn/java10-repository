package view;

import java.sql.Connection;
import java.util.List;
import java.util.Properties;

import connection.DbConnection;
import connection.DbProvider;
import dao.Ex01;
import dao.Ex02;
import persistence.Item;
import persistence.ItemGroup;

public class App {

	private static Ex01 itemGroupDao;
	static {
		itemGroupDao = new Ex01();
	}
	private static Ex02 itemDao;
	static {
		itemDao = new Ex02();
	}

	public static void main(String[] args) {

		Connection connection = DbConnection.getConnection();
		System.out.println(connection);

		List<ItemGroup> itemGrpAll = itemGroupDao.getAll01();
		show(itemGrpAll);
		System.out.println("=============");
		List<Item> itemAll = itemDao.getItem02(1, 100, 500);
		show(itemAll);

	}

	private static <E> void show(List<E> es) {
		for (E e : es) {
			System.out.println(e);
		}
	}
}
