package frameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistss {
	// adding or removing items at the end / near end of a list use an ArrayList.
	// adding or removing items at the start or middle of a list use a LinkedList.

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> lists = new LinkedList<Integer>();
		doTimings("Arraylist", list);
		doTimings("LinkedList", lists);

	}
	public static void doTimings(String type, List<Integer> list) {
		
	}

}
