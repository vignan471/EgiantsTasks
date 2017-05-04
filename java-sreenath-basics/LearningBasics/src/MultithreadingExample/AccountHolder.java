package MultithreadingExample;

public class AccountHolder extends Thread {
	
	public SharedBankAccount balance;				// data members

	public AccountHolder(SharedBankAccount b){		//constructor
		this.balance = b;
	}
	
	public void start(){
			System.out.println("Welcome to withdrawls");
			try {
				balance.debitAmount(10000.00f);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}