package file;

import java.io.File;
import java.io.IOException;

public class Create {

	public static void main(String[] args) {
		File file = new File("Text.file");
		try {
			if(file.createNewFile()) {
				System.out.println("The new file name is " + file.getName());
			}else {
				System.out.println("The file already exist. ");
			}
		} catch (IOException e) {
			System.out.println("An error was found while trying to create a new file.");
			e.printStackTrace();
		}

	}

}
