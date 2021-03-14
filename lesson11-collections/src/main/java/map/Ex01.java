package map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		// K: model id
		// V: city: hashing
		
		/*
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		
		//Comparator<Integer> comp = Comparator.comparing((Integer i) -> i).reversed();


		Map<Integer, String> model = new LinkedHashMap<>();
		
		// model.put(43, "Da Neng");
		model.put(43, "Da Nang");
		model.put(92, "Quang Nam");
		model.put(76, "Quang Ngai");
		model.put(null, "Empty");
		model.put(75, "Thua Thien Hue");
		model.putIfAbsent(43, "Viet Nam");
		model.remove(92);
		System.out.println("size: " + model.size());
		printf(model);
		System.out.println("K75: " + model.get(75));
		
	}
	
	// entry
	private static void printf(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println(entry);
		}
		
	}
}
