package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Reading {

	public static void main(String[] args) {
		try (FileInputStream fi = new FileInputStream("Person.bin")) {
			ObjectInputStream os = new ObjectInputStream(fi);
			Person[] people = (Person[]) os.readObject();
			for (Person personn : people) {
				System.out.println(personn);
			}
			System.out.println("\n");
			@SuppressWarnings("unchecked")
			ArrayList<Person> list = (ArrayList<Person>) os.readObject();
			for (Person peoplee : list) {
				System.out.println(peoplee);
			}
			int num = os.readInt();
			for(int i = 0; i < num; i++) {
				Person peeps = (Person)os.readObject();
				System.out.println(peeps);
			}
			os.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File was not readable.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

		}

	}

}
