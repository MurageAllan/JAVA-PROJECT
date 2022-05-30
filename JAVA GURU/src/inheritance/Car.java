package inheritance;

public class Car extends Machine implements Information{

	@Override
	void start() {
		System.out.println("This car has started");
		
	}

	@Override
	void stop() {
		System.out.println("This car has stopped");
		
	}

	@Override
	void run() {
		System.out.println("This car is running");
		
	}

	@Override
	public void age() {
		System.out.println("This car is quite young");
		
	}

}
