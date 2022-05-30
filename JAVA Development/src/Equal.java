
public class Equal {

	public static void main(String[] args) {
		Person person1 = new Person(7, "Andy");
		Person person2 = new Person(4, "Alonso");
		

	}

}
class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String tostring() {
		StringBuilder sb = new StringBuilder();
		sb.append("My name is ").append(name).append("and my id is ").append(id);
		return sb.toString();
	}
}
