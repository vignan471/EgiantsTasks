package chandratrainingAssgsQ3;

import java.util.Scanner;

public class Refrigrator extends Mprocess {
	Scanner rf = new Scanner(System.in);

	void door() {
		System.out.println("Available Refrigrators with perticular Door");
		System.out.println("1.Single Door" + "\n" + "2.Double Door" + "\n"
				+ "Enter your Door Choice");
		int choice = rf.nextInt();
	}

	void colour() {
		System.out.println("Available Colours");
		System.out.println("1.White" + "\n" + "2.Red" + "\n"
				+ "Enter your Colour Choice");
		int colour = rf.nextInt();
	}

	void size() {
		System.out.println("Available Capacitys for Refrigrator");
		System.out.println("1.500Liters" + "\n" + "2.250Liters" + "\n"
				+ "Enter your Capacity Choice");
		int size = rf.nextInt();
	}

	void temperature() {
		System.out.println("Temperature");
		System.out.println("1.High" + "\n" + "2.Medium" + "\n " + "3.Low"
				+ "\n" + "Enter your Temperature Choice");
		int temp = rf.nextInt();
		System.out.println("You can change the temperature by adjusting temperature button");
	}

}
