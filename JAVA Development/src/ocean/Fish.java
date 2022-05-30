package ocean;

public class Fish {
	public static void main(String[] args) {
		Tilapia.age = 20;
		Tilapia.name = "mackerel";
		System.out.println(Tilapia.info());
		SmallTilapia.age = 6;
		System.out.println(SmallTilapia.age);

		Tilapia tilapia1 = new Tilapia();
		Tilapia tilapia2 = new Tilapia();
		Tilapia tilapia3 = new Tilapia();
		SmallTilapia small1 = new SmallTilapia();
		SmallTilapia small2 = new SmallTilapia();
		small1.information();
		small2.colour();

		tilapia1.information();
	}

}
