package enumm;

public class App {
	

	public static void main(String[] args) {
		
		Animals animal = Animals.Cat;
		
		switch(animal) {
		case Cat:
			System.out.println("This is a cat." + Animals.Cat);
			break;
		case Dog:
			System.out.println("This is a dog");
			break;
		case Mouse:
			System.out.println("This is a mouse.");
			break;
			default:
				
		}
		System.out.println("My dog name is called. " + Animals.Dog);
		System.out.println("The object name is " + Animals.Dog.name());
		Animals animal2 = Animals.Dog.valueOf("Dog");
		System.out.println(animal2);
	}

}
