package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
//		Map<Integer, String> model = new TreeMap<Integer, String>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2.compareTo(o1);
//			}
//		});
		
		Map<Integer, String> model = new LinkedHashMap<>();
		
		model.put(43, "Da Nang");
		model.put(92, "Quang Nam");
		model.put(null, null);
		model.put(75, "Hue");
		model.put(76, "Quang Ngai");
		
		printf(model);
	}
	
	private static void printf(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
