
class Thing {
	// constants, the final keyword declares a variable as a constant.
	public static final int LUCKY_NUMBER = 7;

	// static methods can only access static instances while non static methods can
	// access both static and non static instances.
	private String name;
	private static String description;
	private static int count = 0;
	private int id;
	
	

	public int getId() {
		return id;
	}
	public static int getCount() {
		return count;
	}
	public Thing() {
		id = count;
		count++;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static String getDescription() {
		return description;
	}

	public static void setDescription(String description) {
		Thing.description = description;
	}
	public void information() {
		System.out.println("This objects id is: " + id);
	}

}

public class Statically {

	public static void main(String[] args) {
		System.out.println(Thing.LUCKY_NUMBER);
		Thing.setDescription("This thing works very smartly");
		System.out.println(Thing.getDescription());
		System.out.println("Before starting to count the object the objects are "+ Thing.getCount() + " in no.");
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("After counting the objects are "+ Thing.getCount()+ " in no");
		thing1.setName("Bob");
		System.out.println(thing1.getName());
		thing2.setName("Andy");
		System.out.println(thing2.getName());
		System.out.println(Math.PI); // pi is a constant.
		thing1.information();
		thing2.information();
		

	}

}
