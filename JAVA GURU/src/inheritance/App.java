package inheritance;

public class App {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setId(7);
		System.out.println(car1.getId());
		Camera cam1 = new Camera();
		cam1.setName("nikon");
		System.out.println(cam1.getName());
		Car car2 = new Car();
		car2.Info();
		Information info1 = new Car();
		info1.age();
		Information info2 = new Camera();
		info2.age();

	}

}
