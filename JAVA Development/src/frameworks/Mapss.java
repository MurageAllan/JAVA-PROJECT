package frameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapss {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>(); // does not follow any order.
		Map<Integer, String> map2 = new LinkedHashMap<>(); // follows the standard order.
		Map<Integer, String> map3 = new TreeMap<>();// follows a natural order.
		testMap(map3);
		

	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(90, "Masha");
		map.put(80, "Allan");
		map.put(40, "karey");
		map.put(60, "ndithi");
		String textt = map.get(60);
		System.out.println(textt);
		for(Integer key : map.keySet()) {
			String text = map.get(key);
			System.out.println(key + "," + text);
		}
	}

}
