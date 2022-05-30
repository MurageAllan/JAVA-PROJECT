
public class Tree extends Plant {
	String data;

	private String grow() {
		System.out.println("Trees do grow");
		return data;
	}

	public String getGrow() {
		data = grow();
		return data;
	}

}
