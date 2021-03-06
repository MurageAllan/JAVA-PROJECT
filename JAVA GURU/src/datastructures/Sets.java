package datastructures;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		Set<Cars> set1 = new HashSet<>(); // Does not maintained order
		Set<Cars> set2 = new LinkedHashSet<>(); // Remembers the order that you put your items in
		Set<Cars> set3 = new TreeSet<>(); // sorts a set in a natural order.
		setMethod(set1);
		System.out.println("\n");
		setMethod(set2);
		System.out.println("\n");
		setMethod(set3); // for a user defined class like a car you have to specify the natural order by
							// implementing the comparable interface.

	}

	public static void setMethod(Collection<Cars> col) {
		Cars cr1 = new Cars("Audi", 20);
		Cars cr2 = new Cars("Benz", 10);
		Cars cr3 = new Cars("BMW", 15);
		Cars cr4 = new Cars("Volkswagen", 20);
		Cars cr5 = new Cars("Porshe", 5);
		col.add(cr1);
		col.add(cr2);
		col.add(cr3);
		col.add(cr4);
		col.add(cr5);
		for (Cars car : col) {
			System.out.println(car);
		}
		
	}

}

class Cars implements Comparable<Cars> { // The comparable interface brings about natural ordering in the said class
											// objects
	protected int age;
	protected String name;

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public Cars(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return String.format("%s  , %d", name, age);
	}

	@Override
	public int compareTo(Cars car) { // provided the natural order using the name field.
		
		return this.name.compareTo(car.name);
	}
}
