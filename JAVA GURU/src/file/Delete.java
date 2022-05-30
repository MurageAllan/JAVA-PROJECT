package file;

import java.io.File;

public class Delete {

	public static void main(String[] args) {
		File file = new File("Text.file");
		if(file.delete()) {
			System.out.println("File has been succesfully deleted");
		}else {
			System.out.println("File cannot be deleted");
		}

	}

}
