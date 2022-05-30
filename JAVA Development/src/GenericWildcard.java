import java.util.ArrayList;

public class GenericWildcard {

	public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>();
			list.add("Benz");
			list.add("BMW");
			list.add("Audi");
			list.add("volkswagen");
			
			loop(list);
	}

	public static void loop(ArrayList<String> list) {
		for(String value : list) {
			System.out.println(value);
		}
	}
}

class Machine{
	
}
class Camera extends Machine{
	
}