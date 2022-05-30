package except;

class Temp implements AutoCloseable{
	public void close()throws Exception {
		System.out.println("The temperature is closing. ");
	}
}



public class TryResource {

	public static void main(String[] args) {
		try(Temp temp = new Temp()){
			

		} catch (Exception e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}

}
