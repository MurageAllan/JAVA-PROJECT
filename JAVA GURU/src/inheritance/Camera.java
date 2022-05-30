package inheritance;

public class Camera extends Machine implements Information{

	@Override
	void start() {
		System.out.println("This camera has started");
		
	}

	@Override
	void stop() {
		System.out.println("This camera has Stopped");
		
	}

	@Override
	void run() {
		System.out.println("This camera is running");
		
	}

	@Override
	public void age() {
		System.out.println("This camera is very old. ");
		
	}

}
