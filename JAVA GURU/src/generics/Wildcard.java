package generics;

import java.util.ArrayList;

public class Wildcard {

	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());
		loop(list1);
	}
	public static void loop(ArrayList<?> list) {
		for(Object value : list) {
			System.out.println(value);
		}
	}

}
class Machine{
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This machine ").append("works very efficiently.");
		return sb.toString();
	}
}
class Camera extends Machine{
	public String toString() {
		return "This camera is very efficient";
	}
}
