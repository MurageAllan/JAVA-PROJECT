
public class Plantt {

	public static void main(String[] args) {
		// In polymorphism what matters is the object being pointed at.
		Plant plant2 = new Plant();
		Tree tree2 = new Tree();
		Plant plant1 = tree2;
		plant1.getGrow();
		Plant tree = new Plant();
		tree.getGrow();
		tree2.getGrow();
		// pass a Tree type variable because where the parent class is used a child
		// class can be used(polymorphism)
		doGrow(tree2);

	}

// create A method and has a Plant type argument
	public static void doGrow(Plant plant3) {
		// Because plant3 is of plant type, you can call plant methods
		plant3.getGrow();
	}

}
