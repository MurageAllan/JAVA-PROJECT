
public class Applicationss {

	public static void main(String[] args) {
		Cars car = Cars.Audi;
		switch(car) {
		case Audi:
			System.out.println("This car is fast and " + Cars.Audi);
			break;
		case Benz:
			System.out.println("This car is durable");
			break;
		case BMW:
			System.out.println("This car has a beautiful body shape");
			break;
		case RollsRoyce:
			System.out.println("This car has a beautiful interior.");
			break;
			default:
				break;
		
		}

	}

}
