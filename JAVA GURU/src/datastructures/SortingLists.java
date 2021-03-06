package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthSortComparator implements Comparator<String>{ // sorts the animals strings in terms of their size.

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 > len2) {
			return 1;
		}else if(len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}
class AlphabetcalSortComparator implements Comparator<String>{ // sorts the animals strings alphabetically.

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}
	
}
public class SortingLists {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("cow");
		animals.add("goat");
		animals.add("sheep");
		animals.add("cat");
		animals.add("dog");
		Collections.sort(animals, new LengthSortComparator()); // sorted lengthwise.
		Collections.sort(animals, new AlphabetcalSortComparator()); // sorted alphabetically.
		for(String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("\n");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(8);
		numbers.add(6);
		numbers.add(11);
		numbers.add(19);
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				
				return num1.compareTo(num2); 
			}
			
		}); 
		for(Integer num : numbers) {
			System.out.println(num);
		}

	}

}

