package bai1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex02 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(5, 7, 9 ,10, 20 ,9 ,7, 11 );
	numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
    .collect(Collectors.toSet()).forEach(System.out::println);
	System.out.println(numbers);
}
}
