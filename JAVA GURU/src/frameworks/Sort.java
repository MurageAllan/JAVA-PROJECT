package frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<Person> p1 = new ArrayList<>();
		p1.add(new Person(5, "Allan"));
		p1.add(new Person(7, "Masha"));
		p1.add(new Person(3, "Kariuki"));
		p1.add(new Person(9, "Ian"));
		p1.add(new Person(2, "Kamau"));

		for (Person person : p1) {
			System.out.println(person);
		}
		Collections.sort(p1, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getID() > p2.getID()) {
					return 1;
				} else if (p1.getID() < p2.getID()) {
					return -1;
				}
				return 0;
			}

		});
		System.out.println("\n");

		for (Person person : p1) {
			System.out.println(person);
		}

	}

}

class Person {
	private int ID;
	private String name;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int ID, String name) {
		this.name = name;
		this.ID = ID;
	}

	public String toString() {
		return String.format("%d : %s", ID, name);
	}
}
