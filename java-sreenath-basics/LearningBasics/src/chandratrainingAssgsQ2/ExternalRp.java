package chandratrainingAssgsQ2;

import java.util.Scanner;

public class ExternalRp extends Recruitment{
	Scanner erp=new Scanner(System.in);
	static String submissionstatus,shortlistedstatus;
	int submission,passed;
	void procedure(){
		System.out.println("Submit your Personal and Professional Information for Desired Position ");
		System.out.println("Submission Status"+"\n"+"1.Submitted"+"\n"+"2.Not Submitted");
				
		submission=erp.nextInt();
		if(submission==1){submissionstatus="Submitted";
			System.out.println("Submitted");
			System.out.println("Shortlisted?");
			passed=erp.nextInt();
			if(passed==1){
				shortlistedstatus="Shortlisted";
				//System.out.println("You are Shortlisted for interview");
				System.out.println("Results of interview are recorded");
				System.out.println(RecruitmentProcess.RecruitmentProcess+"\n"+ExternalRp.submissionstatus+"\n"+ExternalRp.shortlistedstatus);
			}
			else {
				try {
					System.out.println(10/0);
				} catch (Exception e) {
					
					System.out.println(e.getMessage());					//e.printStackTrace();
					System.out.println("Better luck next time");
				}
				//throw new NotSelectedExdeption("You are not Shortlisted");
			}
		}else if(submission==2){submissionstatus="Not Submitted";
			System.out.println("Not Submitted");
			System.out.println(RecruitmentProcess.RecruitmentProcess+"\n"+ExternalRp.submissionstatus);
		}
		
	}

}
