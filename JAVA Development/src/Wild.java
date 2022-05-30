import java.util.ArrayList;

public class Wild {

	public static void main(String[] args) {
		ArrayList<Machine> list1 = new ArrayList<>();
		list1.add(new Machine());
		list1.add(new Machine());
		iterate(list1);
		
		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		list2.add(new Camera());
		iterate(list2);

	}
	public static void iterate(ArrayList<? extends Machine> list) {
		for(Object value : list) {
			System.out.println(value);
			((Machine) value).start();
		}
	}

}
class Machine{
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This machine").append("is working correctly");
		return sb.toString();
	}
	public void start() {
		System.out.println("The machine has started. ");
	}
}
class Camera extends Machine{
	public String toString() {
		//StringBuilder sb = new StringBuilder();
		//sb.append("This camera").append("is working correctly");
		return "this camera is nice";
	}
}
