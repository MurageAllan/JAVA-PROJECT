package inner;

public class Anonymous {

	public static void main(String[] args) {
		Person person1 = new Person() {

			@Override
			public void speak() {
				System.out.println("This person does not speak");
			}

		};
		person1.speak();

		Info info1 = new Info() {
			public void information() {
				System.out.println("Not every person has got a name");
			}

		};
		info1.information();
	}
}
	class Person implements Info {
		public void speak() {
			System.out.println("Every person speaks. ");
		}

		@Override
		public void information() {
			System.out.println("Every person has got a name");

		}

	}

interface Info{
	public void information();
}
