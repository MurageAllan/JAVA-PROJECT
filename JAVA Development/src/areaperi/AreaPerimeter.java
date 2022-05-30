package areaperi;

import circ1.Circle;
import rec1.Rectangle;

public class AreaPerimeter {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		Circle circle1 = new Circle();
		rectangle1.setPerimeter(5,7);
		System.out.println(rectangle1.getPerimeter());
		System.out.println(rectangle1.getAreaa());
	}

}
