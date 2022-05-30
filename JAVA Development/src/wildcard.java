import java.util.ArrayList;

public class wildcard {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(50);
		list1.add(70);
		list1.add(90);
		list1.add(80);
		
		ArrayList<Double> list2 = new ArrayList<>();
		list2.add(30.22);
		list2.add(90.67);
		list2.add(48.88);
		list2.add(76.89);
		loop(list1);
		loop(list2);
	}
	public static void loop(ArrayList<? extends Number> list) {
		for(Number value : list) {
			System.out.println(value);
		}
	}

}
