package land;

public class Mainn {

	public static void main(String[] args) {
		Birds bird1 = new Birds();
		Ostrich ostrich2 = new Ostrich("Andy");
		Ostrich ostrich1 = new Ostrich("Alonso", 10);
		System.out.println(ostrich1);
		bird1.locomote();
		bird1.Type = "coldblooded";
		bird1.blooded();
		Inter inter1 = new Birds();
		inter1.showInfo();
		Inter inter2 = ostrich1;
		inter2.showInfo();
		newInter(ostrich1);
	}

	public static void newInter(Inter inter3) {
		inter3.showInfo();
	}
}
