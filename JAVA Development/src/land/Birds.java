package land;

public class Birds extends Animals implements Inter {
	public void locomote() {
		System.out.println("Birds move by flying");
	}

	public void skin() {
		System.out.println("Birds are covered by feathers");
	}

	public void feed() {
		System.out.println("Birds feed by beaks");
	}
	public void showInfo() {
		System.out.println("Birds are beautiful creatures");
	}
}
