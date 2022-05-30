import java.util.ArrayList;

public class Wildcrads {

	public static void main(String[] args) {
		
		ArrayList<Cow> list1 = new ArrayList<>();
		list1.add(new Cow("Faggie", 6));
		list1.add(new Cow("Mbuku", 7));
		loopThrough(list1);
		ArrayList<Calf> list2 = new ArrayList<>();
		list2.add(new Calf("Andy", 4));
		list2.add(new Calf("Alonso", 3));
		loopThrough(list2);
		
		
	}
	public static void loopThrough(ArrayList<? super Calf > list) {
		for(Object value : list) {
			System.out.println(value);
		}
	}

}
class Cow{
	int age;
	String name;
	public Cow(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This cow's name is  ").append(name).append(" and it is. ").append(age).append(" year old");
		return sb.toString();
	}
}
class Calf extends Cow{
	public Calf(String name, int age) {
		super(name, age);
	}

	public String toString() {
		return String.format("name is %s and age is %d", name, age);
	}
}
