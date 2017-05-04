package wait.notify.threads;

public class ChatRoom {
	
	boolean isQuestionTime = true;
	
	
	public synchronized void question(String q) throws InterruptedException {
		if (isQuestionTime){
			System.out.println(q+"? Please reply ");
			notify();											// placement of notify, wait are v v important and they decides the flow.
		}
		isQuestionTime = false;
		wait();
		} 
	
	public synchronized void answer(String a) throws InterruptedException{
		if (!isQuestionTime){
			System.out.println(a+". I'm done");
			notify();							// notify and notifyAll are same in this case -- as we only have 2 threads running.
		
		}
		isQuestionTime = true;
		try {
			wait();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
