package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		// K: model id
		// V: city
		Map<Integer, String> model = new HashMap<>();
		model.put(43, "Da Nang");
		model.put(92, "Quang Nam");
		model.put(75, "Hue");
		model.put(76, "Quang Ngai");
		model.put(null, "EMPTY");
		
		model.remove(76);
		
		System.out.println("size: " + model.size());
		printf(model);
		
		System.out.println("K92: " + model.get(92));
		System.out.println("K76: " + model.getOrDefault(76, "ko co"));
	}
	
	private static void printf(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
