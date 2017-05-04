package wait.notify.threads;

public class InterviewProcess {

	public static void main(String[] args) {
		
		ChatRoom r = new ChatRoom();
		Interviewer A = new Interviewer(r);
		Candidate B = new Candidate(r);
		A.start();
		B.start();		
	}
}
