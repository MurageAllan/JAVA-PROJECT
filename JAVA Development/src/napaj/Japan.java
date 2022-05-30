package napaj;

public class Japan {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Andy");
		Machine machine3 = new Machine("Alonso", 9);
		System.out.println(machine3);
		System.out.println(machine2);
	}
	

}
class Machine{
	int age;
	String name;
	public Machine() {
		
	}
	public Machine(String name) {
		this("Allan" , 6);
		this.name = name;
	}
	public Machine(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return String.format("%s , %d ", name, age);
	}
}

