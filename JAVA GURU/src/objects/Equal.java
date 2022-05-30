package objects;

import java.util.Objects;

class Machine{
	private int age;
	private String name;
	
	public Machine(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return String.format("%s : %d", name, age);
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
		Machine other = (Machine) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}

public class Equal {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine("Andy", 7);
		Machine machine2 = new Machine("Andy", 7);
		System.out.println(machine1.equals(machine2));
		
		Double num = 7.2;
		Double value = 7.2;
		System.out.println(value.equals(num));
		
		String text1 = "Hello";
		String text2 = "Helloooo".substring(0, 5);
		System.out.println(text1.equals(text2));
		
	}

}
