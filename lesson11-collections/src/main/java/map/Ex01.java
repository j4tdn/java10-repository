package map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		// TreeMap: key not null, sort follow key
		// HashMap: key null, not sort, not ensure the order put in 
		//LinkedHashMap: ensure the order put in 
		// K: model id
		// V: city: hashing
		// put: same key override value
		// putIfAbsent: same key not override value
		Comparator<Integer> comp = Comparator.comparing((Integer i) -> i).reversed();
		

		//Map<Integer, String> model = new TreeMap<>() {
		//	@Override
		//	public int compare(Integer o1, Integer o2) {
		//		return o2.compareTo(o1);
		//	}
		//});
		//Map<Integer, String> model = new TreeMap<>(comp);
		Map<Integer, String> model = new LinkedHashMap<>();
		model.put(43, "Da Nang");
		model.put(92, "Quang Nam");
		model.put(76, "Quang Ngai");
		model.put(75, "Thua Thien Hue");
		// model.put(null,"EMPTY");
		model.putIfAbsent(43, "Viet Nam");
		model.remove(75);

		System.out.println("size: " + model.size());
		printf(model);
		System.out.println("K92: " + model.get(92));
	}

	// Entry
	private static void printf(Map<Integer, String> model) {
		// entrySet empty List<> but key not same
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
