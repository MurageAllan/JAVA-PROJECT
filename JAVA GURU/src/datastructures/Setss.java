package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setss {

	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("Allan");
		set1.add("Ley");
		set1.add("Brayo");
		set1.add("Joseph");
		set1.add("Jama");
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("Allan");
		set2.add("Kamau");
		set2.add("Ley");
		set2.add("Ian");
		set2.add("Idris");
		System.out.println("\n");
		Set<String> intersection = new HashSet<>(set1); // Making a copy of set1 and assigning it to the intersection
														// variable.
		intersection.retainAll(set2);
		System.out.println(intersection);

		Set<String> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);

	}

}
