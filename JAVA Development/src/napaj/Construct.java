package napaj;

public class Construct {

	public static void main(String[] args) {
		new Area();
		new SmallArea();
	}
	
}
class Area{
	int a = 10;
	int b = 20;
	String name;
	
	public Area() {
		this(5);
		System.out.println("default");
	}
	public Area(int a) { 
		this(5,8);
		System.out.println("good");
	}
	public Area(int a, int b) {
		System.out.println(a * b);
	}
}
class SmallArea extends Area{
	public SmallArea() {
		this("allan");
		System.out.println("no argument constructor.");
	}
	public SmallArea(String name) {
		super(8);
	}
}
