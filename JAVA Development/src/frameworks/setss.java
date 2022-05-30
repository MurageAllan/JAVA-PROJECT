package frameworks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setss {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();// there is no standard order.
		Set<String> set2 = new LinkedHashSet<>();// no change in order
		Set<String> set3 = new TreeSet<>();// follows the natural order.
		
		set3.add("Dog");
		set3.add("Cow");
		set3.add("Goat");
		set3.add("hen");
		set3.add("cat");
		System.out.println(set3);
		
		Set<String> set4 = new TreeSet<>();
		set4.add("hyena");
		set4.add("zebra");
		set4.add("Goat");
		set4.add("hen");
		set4.add("cat");
		
		Set<String> intersection = new TreeSet<>(set3);
		intersection.retainAll(set4);
		System.out.println(intersection);
		
		Set<String> difference = new TreeSet<>(set3);
		difference.removeAll(set4);
		System.out.println(difference);
		
		
		
	}

}
