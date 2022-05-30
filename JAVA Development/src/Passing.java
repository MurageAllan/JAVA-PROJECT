
public class Passing {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		int data = rectangle1.perimeter(8, 9);
		System.out.println(data);

	}

}
class Rectangle{
	public int perimeter(int width, int length) {
		int perimeter;
		perimeter = 2 * (length + width);
		return perimeter;
	}
}
