import ocean.SmallTilapia;
import ocean.Tilapia;

public class Application {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine();

		machine1.start();
		machine1.stop();

		Car car1 = new Car();
		Car car2 = new Car();

		car1.start();
		car1.stop();
		// car1.info();
		// car1.information();

		Tilapia tilapia4 = new Tilapia();
		Tilapia tilapia5 = new Tilapia();
		tilapia4.age = 5;
		tilapia4.information();

		SmallTilapia small4 = new SmallTilapia();
		SmallTilapia small7 = new SmallTilapia();
		small4.colour();
		small7.age = 9;
		small7.information();

	}

}
