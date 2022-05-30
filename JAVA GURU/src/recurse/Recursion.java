package recurse;

public class Recursion {

	public static void main(String[] args) {
		int value = 5;
		calculateAge(value);

	}
	public static void calculateAge(int value) {
		value = value - 3;
		System.out.println(value);
	}

}
