package frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return 0;
		}

	}

}

class AphabeticallyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);
	}

}

public class Sorting {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();

		animals.add("Elephant");
		animals.add("gazalle");
		animals.add("Antelope");
		animals.add("zebra");
		animals.add("Lion");
		animals.add("Tiger");

		for (String value : animals) {
			System.out.println(value);
		}

		Collections.sort(animals, new StringLengthComparator()); // sorts by string length
		Collections.sort(animals, new AphabeticallyCompare()); // sorts alphabetically.
		System.out.println("\n");

		for (String value : animals) {
			System.out.println(value);
		}
		List<Integer> num = new ArrayList<>();
		num.add(4);
		num.add(6);
		num.add(7);
		num.add(9);
		num.add(2);
		Collections.sort(num, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {

				return num1.compareTo(num2);
			}

		});
		for (int value : num) {
			System.out.println(value);
		}
	}

}
