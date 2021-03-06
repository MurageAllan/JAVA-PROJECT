package datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Fox");
		list.add("Gazelle");
		list.add("Elephant");
		list.add("Antelope");
		list.add("lion");
		// Ancient iIterator
		Iterator<String> It = list.iterator(); // Because all List implement Iterator Interface.
		while(It.hasNext()) {
		String animal = It.next();
		
		if(animal.equals("Gazelle")) {
			It.remove();
		}
		System.out.println(animal);
		}
		System.out.println("\n");
		// modern Iteration.
		for(String animals : list) {
			System.out.println(list);
		}

	}

}
