import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file = new File("Text.file");
		try {
			if (file.createNewFile()) {
				System.out.println("The file name is " + file.getName());
			}else {
				System.out.println("File already exist. ");
			}
		} catch (IOException e) {
			System.out.println("An error occured. ");
		}

	}

}
