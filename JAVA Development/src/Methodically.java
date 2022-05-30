
public class Methodically {
	public static void main(String[] args) {
		Whales wh = new Whales();
		wh.swim();
	}
}
class Whales{
	public void swim() {
		System.out.println("This whale swims very fast.");
		class BlueWhale{
			public void fins() {
				System.out.println("This whale has beautiful fins.");
			}
		}
		BlueWhale bw = new BlueWhale();
		bw.fins();
	}
}
