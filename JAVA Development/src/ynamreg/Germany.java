package ynamreg;

public class Germany {

	public static void main(String[] args) {
		Bmw bmw1 = new Bmw();
		Bmw bmw2 = new Bmw();

		// System.out.println(bmw1.calculatePerimeter(7 , 8));
		System.out.println("Before the counting of cars there are: " + Audi.count + " number of cars.");
		Audi audi1 = new Audi();
		Audi audi2 = new Audi();
		System.out.println("After the counting of cars there are: " + Audi.count + " number of cars.");
		// System.out.println(audi1.getArea());
		Benz benz1 = new Bmw();
		benz1.showInfo();
		Benz benz2 = audi1;
		benz2.showInfo();
		newInfo(bmw1);
		audi2.getData();

	}

	public static void newInfo(Benz benz3) {
		benz3.showInfo();
	}

}
