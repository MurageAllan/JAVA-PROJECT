package datastructures;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Lists {

	public static void main(String[] args) {
		List<Camera> cam1 = new ArrayList<>();
		List<Camera> cam2 = new LinkedList<>();
		Collection<SmallCamera> cam4 = new ArrayList<>();
		Iterable<Camera> cam5 = new LinkedList<>();
		List<SmallCamera> cam6 = new Stack<>();
		AbstractList<Camera> cam3 = new Stack<>(); // An AbstractClass with methods implemented in the Stack class.

		cameraMethod(cam1); // an ArrayList
		System.out.println("\n");
		cameraMethod(cam2); // a LinkedList
		System.out.println("\n");
		smallCameraMethod(cam6); // a Stack
		System.out.println("\n");
	}

	public static void cameraMethod(List<Camera> col) {
		Camera cam9 = new Camera(2, "Redmi"); // Testing the equals();
		Camera cam7 = new Camera(2, "Redmi");

		col.add(new Camera(7, "Nikon")); // add() appends a specific element at the end of the list.
		col.add(new Camera(9, "Canon"));
		col.add(new Camera(5, "Sony"));
		col.add(new Camera(3, "Samsung"));
		col.add(cam7);
		Collections.sort(col, new AgeSortComparator()); // sorted by age.
		System.out.println(col.contains(cam7));// checks whether a list contains the specified element.
		System.out.println(col.indexOf(cam7));
		System.out.println(col.isEmpty()); // checks whether the list is empty.
		System.out.println(col.size()); // returns the size of the list

		for (Camera cam : col) {
			System.out.println(cam);
		}
		col.remove(new Camera(7, "Nikon")); // used to remove an object.
		System.out.println(cam9.equals(cam7)); // The equals() successfully tested.
	}

	public static void smallCameraMethod(List<SmallCamera> coll) {
		SmallCamera sc1 = new SmallCamera(1, "OnePlus");
		SmallCamera sc2 = new SmallCamera(2, "Vivo");
		SmallCamera sc3 = new SmallCamera(1, "OnePlus");
		Collections.sort(coll, new Comparator<SmallCamera>() {

			@Override
			public int compare(SmallCamera smallcam1, SmallCamera smallcam2) {
				int age3 = smallcam1.getAge();
				int age4 = smallcam2.getAge();
				if (age3 > age4) {
					return 1;
				} else if (age3 < age4) {
					return -1;
				}
				return 0;
			}

		});
		coll.add(sc1);
		coll.add(sc2);
		coll.add(sc3);
		SmallCamera element = coll.get(1);
		System.out.println(element);
		System.out.println(sc1.equals(sc3)); // Test the inheritance of equals();
		for (SmallCamera sc : coll) {
			System.out.println(sc);
		}
	}

}

class Camera {
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	public Camera(int age, String name) {
		this.name = name;
		this.age = age;
	}

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
		Camera other = (Camera) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(age).append(" , ").append(name);
		return sb.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class SmallCamera extends Camera { // Testing inheritance in a list.

	public SmallCamera(int age, String name) {
		super(age, name);

	}

}

class AgeSortComparator implements Comparator<Camera> {

	@Override
	public int compare(Camera cam1, Camera cam2) {
		int age1 = cam1.getAge();
		int age2 = cam2.getAge();
		if (age1 > age2) {
			return 1;
		} else if (age1 < age2) {
			return -1;
		}
		return 0;
	}

}
