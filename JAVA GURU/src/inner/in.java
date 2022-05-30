package inner;

public class in {

	public static void main(String[] args) {
	Machine.Brain br = new Machine().new Brain();
	br.brain();
	Machine machine1 = new Machine();
	machine1.legs();

	}

}
class Machine{
	public void legs() {
		System.out.println("All the machines in this company walk. ");
	}
	class Brain{
		public void brain() {
			System.out.println("All the machines in this company think. ");
		}
	}
}
