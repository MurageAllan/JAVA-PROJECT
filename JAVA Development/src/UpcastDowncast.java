
public class UpcastDowncast {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		// upcasting that is typecasting a child object to a parent object.
		Machine machine2 = camera1;
		machine2.start();
		// downcasting that is typecasting a parent obj to a child obj.
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.snap();
		camera2.start();

	}
}

class Machine {
	public void start() {
		System.out.println("The machine has started. ");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("The camera has started. ");
	}

	public void snap() {
		System.out.println("The camera has taken some few snaps. ");
	}
}