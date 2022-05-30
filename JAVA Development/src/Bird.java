
public class Bird implements Info {
	private String name;
	
	public Bird(String name) {
		this.name = name;
	}
	public void length() {
		System.out.println("This bird is long");
	}
	@Override
	public void showInfo() {
		System.out.println("This bird's name is " + name);
		
	}

}
