package Ex01;

import java.util.Arrays;
import java.util.*;

public class Ex01 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);

		System.out.println("Phan tu xuat hien 1 lan :");

		list.stream().distinct().forEach(System.out::println);
		System.out.println();
	}

}
