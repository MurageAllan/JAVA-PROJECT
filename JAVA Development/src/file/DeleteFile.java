package file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File("T.file");
		if(file.delete()) {
			System.out.println("file deletion succesfull");
		}else {
			System.out.println("The file did not exist");
		}

	}

}
