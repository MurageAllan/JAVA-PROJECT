package land;

public class Animals {
	public String Type = "warmblooded";

	public void locomote() {
		System.out.println("All animals move.");
	}

	public void feed() {
		System.out.println("All animals eat.");
	}

	public void blooded() {
		if (Type == "warmblooded") {
			System.out.println("This is a bird");
		} else {
			System.out.println("This is not a bird");
		}
	}
}
