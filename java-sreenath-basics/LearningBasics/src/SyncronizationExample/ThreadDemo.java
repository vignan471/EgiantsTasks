package SyncronizationExample;

import java.io.IOException;

class ThreadDemo extends Thread {
	   //private Thread t;
	   private String threadName;
	   BankDemo  PD;

	   ThreadDemo( String name,  BankDemo pd) {
	      threadName = name;
	      PD = pd;
	   }
	   public synchronized void run() {
	         try {
				PD.printBalance();
			} catch (IOException e) {
				e.printStackTrace();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

//	   public void start () {
//	      System.out.println("Starting " +  threadName );
//	    //  if (t == null) {
//	         t = new Thread (this, threadName);
//	         t.start ();
//	      //}
//	   }
	}