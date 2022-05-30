
public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		Bird bird1 = new Bird("pigeon");

		frog1.colour();
		bird1.length();

		Info info1 = new Frog();
		info1.showInfo();
		Info info2 = bird1;
		info2.showInfo();
		newInfo(bird1);
	}

	public static void newInfo(Info info3) {
		info3.showInfo();
	}

}
