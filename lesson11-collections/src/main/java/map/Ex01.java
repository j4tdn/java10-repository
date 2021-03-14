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
		// k: model id
		// v: city: Hashing
//		Map<Integer, String> model = new TreeMap<>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2.compareTo(o1);
//			}
//		});
		
//		Comparator<Integer> comp = (Integer o1, Integer o2) -> {
//			return o2.compareTo(o1);
//		};
//		
//		
//		Map<Integer, String> model = new TreeMap<>(comp);
		
		//Comparator<Integer> comp = Comparator.comparing((Integer i ) -> i).reversed();
		Map<Integer, String> model = new LinkedHashMap<>();
		
		model.put(43, "Da Nang");
		model.put(92, "Quang Nam");
		//model.put(null, "EMPTY");
		model.put(76, "Quang Ngai");
		model.put(75, "TTH");
		model.putIfAbsent(43, "Da Neng");
		model.remove(11);
		

		System.out.println("size :" + model.size());
		printf(model);
		System.out.println("K92: "+model.get(92));
	}

	// entry
	private static void printf(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
