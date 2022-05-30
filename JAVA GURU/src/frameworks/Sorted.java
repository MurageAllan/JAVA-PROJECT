package frameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sorted {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		testMap(hmap);

	}
	public static void testMap(Map<Integer,String> map) {
		
	map.put(90, "Allan");
	map.put(80, "masha");
	map.put(70, "JOhn");
	String text = map.get(80);
	System.out.println(text);
	
	for(Integer key : map.keySet()) {
		String value = map.get(key);
		System.out.println(key + " : " + value );
	
		
	}
	
	}
}
