package frameworks;

import java.util.ArrayList;
import java.util.List;

public class Arraylistss {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//Adding components to my arraylist.
		list.add(2);
		list.add(3);
		list.add(4);
		
		// retrieving components from my arraylist
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//loop through my arraylist. size() gets the dimensions of the array.
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		//Removing items from my arraylist
		list.remove(list.size()-1);
		list.remove(0);
		
		System.out.println("\n another way to loop.");
		for(Integer value : list) {
			System.out.println(value);
		}
		// list is implemented by the ArrayList collection.
		List<String> lists = new ArrayList<String>();
		
		
		
		
		

	}

}
