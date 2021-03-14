package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		// K:model id
		// V:city : hashing
		//Comparator<Integer> comp = Comparator.comparing((Integer i) -> i).reversed();

		Map<Integer, String> model = new LinkedHashMap<>();
		model.put(43, "Da Nang");

		model.put(92, "Quang Nam");
		// model.put(null, "EMPTY");
		model.put(76, "Quang Ngai");
		model.put(75, "Hue");
		model.putIfAbsent(43, "Viet Nam");
		model.remove(92);
		System.out.println("size: " + model.size());
		printf(model);
		System.out.println("K92: " + model.get(92));

	}

	// entry
	private static void printf(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
