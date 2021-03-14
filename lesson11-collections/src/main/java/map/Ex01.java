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
		// tạo map K: model id; V: city: hashing
		// HashMap: vẩn cho chạy key null
		// TreeMap: ko cho chạy phần tử key có null

		//Comparator<Integer> comp = Comparator.comparing((Integer i) -> i).reversed();

		Map<Integer, String> model = new LinkedHashMap<>();
		model.put(43, "Da Nang");
		model.put(null, "Da Neng");
		model.put(92, "Quang Nam");
		model.put(76, "Quang Ngai");
		model.put(75, "Thua Thien Hue");
		// PutIfAbsent: ko put đè lên key có sẳn
		model.putIfAbsent(43, "Viet Nam");
		// xóa 1 key dc xác định
		model.remove(92);

		System.out.println("size: " + model.size());
		printf(model);
		System.out.println("K92: " + model.get(92));
	}

	// entry
	private static void printf(Map<Integer, String> model) {
		// lay het phan tu trong map
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
