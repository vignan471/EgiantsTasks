package chandratrainingAssgs;

import java.util.Scanner;

public class Counterone extends Pcounter {
	Scanner p1 = new Scanner(System.in);
	 int Payment, Receipt;

	@Override
	void process() {
		System.out.println("Cost of the Product is $100");
		System.out.println("Enter Payment Status"+"\n"+"1.Done"+"\n"+"2.Not Done");
		
		Payment = p1.nextInt();
		
		if (Payment == 1) {
			System.out.println("Payment done");
			System.out.println("Enter Receipt Status"+"\n"+"1.Done"+"\n"+"2.Not Done");
			
			Receipt = p1.nextInt();
			if (Receipt == 1) {
				System.out.println("Receipt Given");
				System.out.println("Your produt is:"+ProductCounters.productno+"\n"+"Payment done"+"\n"+"Receipt Given");
			} else if (Receipt == 2) {
				System.out.println("Receipt Not Given");
			}
		} else if (Payment == 2) {
			System.out.println("Payment not done");
		}

	}

}
