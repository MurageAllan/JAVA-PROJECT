import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("Text.file");
		Scanner reader;
		try {
			reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}

	}

}
