package land;

public class Ostrich extends Birds implements Inter{
	String name;
	int age;
	protected static int count = 0;

	public Ostrich(String name) {
		count++;
		this.name = name;
		
	}

	public Ostrich(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" ").append(age);
		return sb.toString();
	}

	public void fly() {
		System.out.println("Ostrich walk most of the time though they can fly");
	}

	public void eat() {
		System.out.println("Ostrich feed by beaks");
	}
	public void showInfo() {
		System.out.println("Ostrich are beautiful creatures");
	}
}