package MultithreadingExample;

public class SynchronizeTest{

	public static void  main(String[] args) {
		
		SharedBankAccount sba = new SharedBankAccount(10000f);
		AccountHolder husband = new AccountHolder(sba);
		AccountHolder wife = new AccountHolder(sba);
		
			husband.start();
			
			wife.start();
	}
}
 