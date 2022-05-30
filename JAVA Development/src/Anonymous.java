public class Anonymous {
	public static void main(String[] args) {
		Robot robot1 = new Robot() {
			public void speak() {
				System.out.println("The robot is not working well");
			}
		};
		robot1.speak();
		Machine machine1 = new Machine() {
			public void work() {
				System.out.println("The machine is not working well");
			}
		};
		machine1.work();
	}

	class Robot{
		public void speak() {
			System.out.println("The robot does speak");
		}
	}

interface Machine{
	public void work();
}