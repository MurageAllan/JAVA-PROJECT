
public class Statss {

	public static void main(String[] args) {
		Dolphin doll = new Dolphin();
		Dolphin.swim();

	}

}
class Dolphin{
	public static void swim() {
		System.out.println("This dolphin swims very fast.");
		 class BlueDolphin{
			public static void fin() {
				System.out.println("This fin is quite huge.");
			}
		}
		 BlueDolphin dol = new BlueDolphin();
		 BlueDolphin.fin();
	}
}