package wait.notify.threads;

public class Interviewer extends Thread{
	
	private ChatRoom room;
	 
	public Interviewer(ChatRoom room){
		this.room = room;
	}
	public void run(){
		 String[] questions = {"What is your name", "What are your hobbies" ,
		                       "What is your favourite team", "Any questions"};
		 for (String q: questions){
			 try {
				room.question(q);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 } 
	}
}
