package inner;

public class Methodically {

	public static void main(String[] args) {
		Robot rob1 = new Robot();
		rob1.nerve();

	}

}
class Robot{
	public void nerve() {
		System.out.println("All the robots have a nervers system");
		
		class Central{
			public void centrally() {
				System.out.println("All robots have a central nervous system. ");
			}
	
		}
		Central cr = new Central();
		cr.centrally();
	}
}
