package inner;

public class Stats {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		Frog.leap();
	}

}

class Frog {
	public static void leap() {
		System.out.println("This frog leaps. ");

		class Tadpoal {
			public static void jump() {
				System.out.println("A tadpoal jumps. ");
			}
		}
		Tadpoal tadpoal = new Tadpoal();
		Tadpoal.jump();
	}
}
