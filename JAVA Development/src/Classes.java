
public class Classes {

	public static void main(String[] args) {
		Motor motor1 = new Motor();
		motor1.speak();
		Motor.Cycle br = new Motor().new Cycle();
		br.walk();
	}

}
class Motor{
	public void speak() {
		System.out.println("This motor speaks");
	}
	class Cycle{
		public void walk() {
			System.out.println("This motorcycle walks");
		}
	}
}
