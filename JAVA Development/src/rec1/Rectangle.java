package rec1;

import java.util.Scanner;

public class Rectangle {
	int data;
	int value;
	private int width;
	private int length;
 
	private int area() {
		int areaa;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width. ");
		width = input.nextInt();
		System.out.println("Enter the length. ");
		length = input.nextInt();
		areaa = width * length;
		
		return areaa;
		
	}
	public int getAreaa() {
		data = area();
		return data;
	}
	public void setPerimeter(int width, int length) {
		this.width = width;
		this.length = length;
		int perimeter;
		perimeter = 2 * (width + length);
		perimeter = value;
	}
	public int getPerimeter() {
		return value;
	}

}
