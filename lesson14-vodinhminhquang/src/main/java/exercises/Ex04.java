package exercises;

import java.util.Map;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {
		mostOccurenceCharacter("aaaababbbddc");
		System.out.println("============");
		mostOccurenceCharacter("aaaccdcee");
	}

	private static void mostOccurenceCharacter(String word) {
		Stream<Character> characterStream = word.chars().mapToObj(new IntFunction<Character>() {
			@Override
			public Character apply(int value) {
				// TODO Auto-generated method stub
				return (char) value;
			}
		});

		// accumulate the number of occurrence of a character
		Map<Character, Integer> map = characterStream.collect(Collectors.toMap(new Function<Character, Character>() {
			// key of map is a character
			@Override
			public Character apply(Character t) {
				return t;
			}
		}, new Function<Character, Integer>() {
			// value of map is 1 which stands for one occurrence of the character
			@Override
			public Integer apply(Character t) {
				return 1;
			}
		}, new BinaryOperator<Integer>() {
			// merge function, if two keys (in two maps) are the same, the values we are
			// going to choose is the the sum of old value and new value
			@Override
			public Integer apply(Integer t, Integer u) {
				return Integer.sum(t, u);
			}
		}));
		// get max value in new map
		OptionalInt maxOccurrences = map.values().stream().mapToInt(o -> o).max();
		// get characters have the most occurrence in the map
		map.entrySet().stream().filter(o -> maxOccurrences.getAsInt() == o.getValue()).map(x -> x.getKey())
				.forEach(System.out::println);
	}
}
