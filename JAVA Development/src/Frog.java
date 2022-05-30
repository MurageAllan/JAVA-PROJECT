
public class Frog implements Info {
	
	private int id = 8;
	public void colour() {
		System.out.println("This frog is brown");
	}
	@Override
	public void showInfo() {
		System.out.println("This frog's id is: " + id);
		
	}

}
