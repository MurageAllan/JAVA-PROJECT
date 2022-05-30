
public class Plant {
	String data;

	private String grow() {
		System.out.println("All plants grow");
		return data;
	}

	public String getGrow() {
		data = grow();
		return data;
	}
}
