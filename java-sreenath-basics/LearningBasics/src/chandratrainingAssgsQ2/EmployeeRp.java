package chandratrainingAssgsQ2;

import java.util.Scanner;

public class EmployeeRp extends Recruitment {
	Scanner emrp=new Scanner(System.in);
	 int submission;static String submittedstatus;
	void procedure(){
		System.out.println("Submit your Personal and Professional Information for Given Position");
		System.out.println("Submission Status"+"\n"+"1.Submitted"+"\n"+"2.Not Submitted");
		submission=emrp.nextInt();
		if(submission==1){submittedstatus="Submitted";
			System.out.println("Submitted");
			System.out.println("Interview");
			System.out.println(RecruitmentProcess.RecruitmentProcess+"\n"+EmployeeRp.submittedstatus);
		}else if(submission==2){submittedstatus="Submitted";
			System.out.println("Not Submitted");
		}
	}
}
