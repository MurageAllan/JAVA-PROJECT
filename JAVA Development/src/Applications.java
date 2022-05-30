
public class Applications {

	public static void main(String[] args) {
		Car car1 = new Car();
		Cameraa cam1 = new Cameraa();
		
		cam1.setID(6);
		System.out.println(cam1.getID());
		
		car1.running();
		cam1.running();
		
		
	}

}
