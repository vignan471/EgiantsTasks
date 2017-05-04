package SyncronizationExample;

import java.io.IOException;

class BankDemo {
	 double Balanceamount=10000;
	 double withdrawlamount=10000;
	public void printBalance() throws IOException{
	try{
		//System.out.print("\n Welcome to IOWA Bank:");
		if(withdrawlamount<=Balanceamount){
			 Balanceamount -= withdrawlamount;	
			 System.out.println("yay \n");
		}else{
			System.out.print("Damn \n");
			}
	}
	catch (NumberFormatException e){
		System.out.print("\n Error ="+e);
		return;
		}
	System.out.print("you entered ..."+withdrawlamount);
	}
	}