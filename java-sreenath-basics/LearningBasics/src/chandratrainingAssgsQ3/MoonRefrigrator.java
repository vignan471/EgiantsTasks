package chandratrainingAssgsQ3;

import java.util.Scanner;

public class MoonRefrigrator extends Refrigrator {

	public static void main(String[] args) {
		Scanner mr = new Scanner(System.in);
		System.out.println("Welcome to Moon Refrigrators");
		Mprocess mrf = new Refrigrator();
		Wiring mm = new Wiring();
		mm.setWiringType("Hidden");
		System.out.println(mm.getWiringType());
		mrf.door();
		mrf.colour();
		mrf.size();
		mrf.temperature();

	}

}
