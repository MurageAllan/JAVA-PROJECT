package frameworks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setss {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<String> texts = new TreeSet<>();
		Set<String> textss = new LinkedHashSet<>();
		
		set1.add("Dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("hen");
		set1.add("goat");
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<>();
		set2.add("Dog");
		set2.add("cat");
		set2.add("cow");
		set2.add("rat");
		set2.add("snake");
		
		Set<String> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		Set<String> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
