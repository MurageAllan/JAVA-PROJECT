package datastructures;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class SortingMaps {

	public static void main(String[] args) {
		Person pr1 = new Person("Vivi", 7);
		Person pr2 = new Person("Shiro" ,8);
		Person pr3 = new Person("Idris", 9);
		Person pr4 = new Person("Hilda", 10);
		Person pr5 = new Person("Hilda", 10);
		Map<Person, Integer> map1 = new LinkedHashMap<>(); // keys in a map are unique hence can never be duplicated.
		
		map1.put(pr1, 2002);
		map1.put(pr2, 2003);
		map1.put(pr3, 2005);
		map1.put(pr4, 2000);
		map1.put(pr5, 2007);

		for (Map.Entry<Person, Integer> entry : map1.entrySet()) {
			Person key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + " ," + value);
		}
		System.out.println("\n");
		Set<Person> set1 = new LinkedHashSet<>();
		set1.add(pr5);
		set1.add(pr4);
		set1.add(pr3);
		set1.add(pr2);
		set1.add(pr1);
		for(Person pr : set1) {
			System.out.println(pr);
		}

	}

}

class Person {
	private int ID;
	private String name;

	@Override
	public int hashCode() {
		return Objects.hash(ID, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return ID == other.ID && Objects.equals(name, other.name);
	}
	public Person(String name, int ID) {
		this.ID = ID;
		this.name = name;
	}
	public String toString() {
		return String.format("%s , %d", name , ID);
	}
}
