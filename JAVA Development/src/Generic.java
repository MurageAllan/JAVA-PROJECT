import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Generic {
	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<>();
		lists.add("frog");
		lists.add("fish");
		lists.add("zebra");
		lists.add("lion");
		lists.add("gazelle");

		String animal = lists.get(2);
		System.out.println(animal);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		Integer values = list.get(3);
		System.out.println(values);

		HashMap<String, Integer> map = new HashMap<>();
		((List<String>) map).add(6, "frog");
		((List<String>) map).add(7, "fish");
		map.replace("antelope", 4);
		
		

	}
}
