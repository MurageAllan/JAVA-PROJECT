package cast;
class Machine{
	public void brain() {
		System.out.println("This machine thinks. ");
	}

}
class Camera extends Machine{

	@Override
	public void brain() {
		
		System.out.println("This camera thinks. ");
	}
	public void snap() {
		System.out.println("This camera takes snaps. ");
	}
	
}



public class Casting {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera cam1 = new Camera();
		
		//up cast.
		Machine machine2 = cam1;
		machine2.brain();
		
		// down cast.
		Machine machine3 = new Camera();
		Camera cam2 = (Camera)machine3;
		cam2.brain();
		cam2.snap();

	}

}

