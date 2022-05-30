package frameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listss {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); // adding / removing items at the end or near the end of the list.
		List<String> list2 = new LinkedList<>();// adding / removing items at the beginning or middle of the list.
		testList(list1);
		
	}
	public static void testList(List<String> list) {
		list.add("Allan");
		list.add("Alonso");
		list.add("Alphonso");
		list.add("Masha");
		
		String value = list.get(0);
		System.out.println(value);
		for(String text : list) {
			System.out.println(text);
		}
		list.remove(0);
	}

}
