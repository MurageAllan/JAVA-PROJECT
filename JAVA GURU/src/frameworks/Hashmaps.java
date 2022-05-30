package frameworks;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		// retrieving the value of the key entered.
		String text = map.get(2);
		//System.out.println(text);
		
		// loop Through.
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}
	

}
