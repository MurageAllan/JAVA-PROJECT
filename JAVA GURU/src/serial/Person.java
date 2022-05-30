package serial;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 2136351586479194665L;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return String.format("%s  %d", name , age);
	}
}
