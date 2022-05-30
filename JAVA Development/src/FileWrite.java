import java.io.FileWriter;
import java.io.IOException;


public class FileWrite {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("Text.file");
			writer.write("Files in JAVA are seriously good ");
			writer.close();
			System.out.println("successfully written. ");
		} catch (IOException e) {
			System.out.println("An error has occured. ");
		}
		

	}

}
