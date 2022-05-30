package ynamreg;

import java.util.Scanner;

public class Bmw implements Benz {
	private int area;
	private int perimeter;
	private int width;
	private int length;
	int areaa;
	int peri;

	public int getArea() {
		int areaa = calculateArea();
		return areaa;
	}

	private int calculateArea() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width: ");
		width = input.nextInt();
		System.out.println("Enter the length: ");
		length = input.nextInt();
		area = length * width;
		return area;
	}
	protected int calculatePerimeter(int length, int width) {
		perimeter = 2 *(length + width);
		return perimeter;
	
	}
	public void showInfo() {
		System.out.println("Bmw is a very beautiful car I would like to own one, one day ");
	}

}
