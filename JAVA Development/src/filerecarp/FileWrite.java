package filerecarp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		File file = new File("Text.txt");
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("My name is Allan Nyamu and I live in Kenya.");
			br.newLine();
			br.write("I live in Kenya and I am an aspiring software developer.");
			br.newLine();
			br.write("I like creating new softwares.");
		} catch (IOException e) {
			System.out.println("The file is not witable.");
			e.printStackTrace();
		}

	}

}
