package handling;

public class Exceptionss {
	
	public static int divide(int a, int b) { 
		int value;
		value = a | b;
		return value;
		
	}
	public static int calculate(int a , int b) {
		int num = divide(a,b);
		return num;
	}
	
	

	public static void main(String[] args) {
	try {
		divide(6,8);
		System.out.println(divide(6,8));
	}
	catch(Exception e) {
		System.out.println("An error has occured");
	}
	finally {
		System.out.println("This code does run efficiently");
	}
	}

}
