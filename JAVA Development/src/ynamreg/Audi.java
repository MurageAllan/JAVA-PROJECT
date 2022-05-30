package ynamreg;

import java.util.Scanner;

public class Audi extends Bmw implements Benz {
	protected static int count = 0;
	String data;

	public void showInfo() {
		System.out.println("Audi is a very pretty car I would love to own it one day ");
	}

	private String showStatus() {

	String description;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the status: ");
	description = input.nextLine();
	switch(description)
	{
    	case "good" :
    		System.out.println("The machine is in a good condition");
    		break;
    	case "better" :
    		System.out.println("The machine is in a better condition");
    		break;
    	case "best" :
    		System.out.println("The machine is in an excellent condition");
    		break;
    		default :
    			System.out.println("The machine is not working well");
    	}
		return description;
	}

	public String getData() {
    		String data = showStatus();
    		return data;
    	}


	public Audi() {
		count++;
	}

}
