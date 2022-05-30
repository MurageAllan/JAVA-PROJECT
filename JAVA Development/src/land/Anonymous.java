package land;

public class Anonymous {

	public static void main(String[] args) {
		Machine machine1 = new Machine() {
			public void start() {
				System.out.println("This machine has been running. ");
			}
		};
		machine1.start();
		Info info1 = new Info() {
			public void Information() {
				System.out.println("This machine contains less info. ");
			}
		};
		info1.Information();

	}

}
class Machine implements Info{
	public void start() {
		System.out.println("The machine has started. ");
	}
	public void Information() {
		System.out.println("This machine contains a lot of information. ");
	}
}
interface Info{
	public void Information();
}
