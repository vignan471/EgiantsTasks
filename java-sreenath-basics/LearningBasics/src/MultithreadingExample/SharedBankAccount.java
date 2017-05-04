package MultithreadingExample;

public class SharedBankAccount {
	
	private float sharedBalance;					// data members
	
	public SharedBankAccount(float b){				//constructor
		this.sharedBalance = b;
	}
	
	public void debitAmount (float withdrawAmount) throws Exception {
		if ( withdrawAmount == 0){
			throw new Exception ("Invalid amount requested");
			}
		else if (withdrawAmount > sharedBalance){
			System.err.println("INSUFFICIENT sharedBalance");
			System.out.println("Withdrawal of " + withdrawAmount +" is unsuccesfull and Remaining sharedBalance is "+ sharedBalance);
		}
		else if (withdrawAmount <= sharedBalance){
			sharedBalance -= withdrawAmount;
			System.out.println("Withdrawal of " + withdrawAmount +" is succesfull and Remaining sharedBalance is "+ sharedBalance);
			System.out.println("======================================================");
		}
	}
}	
