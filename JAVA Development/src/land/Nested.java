package land;

public class Nested {

	public static void main(String[] args) {
		Whale.SmallWhale sm = new Whale.SmallWhale();
		sm.fin();
	}

}
class Whale{
	public static void swim() {
		System.out.println("This whale swims quite fast.");
	}
	static class SmallWhale{
		public void fin() {
			System.out.println("This small whale is so pretty. ");
		}
	}
}
