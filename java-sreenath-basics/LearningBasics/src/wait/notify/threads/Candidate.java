package wait.notify.threads;

public class Candidate  extends Thread{
	
	private ChatRoom room;
	
	public Candidate(ChatRoom room){
		this.room = room;
	}
	public void run(){
		 String[] answers = {"Vignan", "Youtube" ,
		                       "India", "No"};
		 for (String a: answers){
			 try {
				room.answer(a);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 } 
	}
}
