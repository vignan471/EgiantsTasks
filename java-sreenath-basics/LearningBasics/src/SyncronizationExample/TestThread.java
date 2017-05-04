package SyncronizationExample;

public class TestThread {
	 public static void main(String args[]) {
	      BankDemo PD = new BankDemo();

	      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
	      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );

	      T1.start();
	      T2.start();

//	      try {
//	         T1.join();
//	         T2.join();
//	      }catch( Exception e) {
//	         System.out.println("Interrupted");
//	      }
	   }
}
