package chandratrainingAssgs;

import java.util.Scanner;

public class ProductCounters {
	
	static int product;
	static String productno;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our Market"+"\n"+"Enter your Choice");
		System.out.println("1.ProductOne"+"\n"+"2.ProductTwo"+"\n"+"3.ProductThree");
		 product = sc.nextInt();
		if (product == 1) {
			Pcounter c1 = new Counterone();
			productno="ProductOne";
			c1.process();
		} else if (product == 2) {        					//here inheritance is used we can say that as same object is used to call all the sub classes
			Pcounter c1 = new Countertwo();
			productno="ProductTwo";
			c1.process();
		} else if (product == 3) {
			Pcounter c1 = new Counterthree();
			productno="ProductThree";
			c1.process();
		}
	}

	}
