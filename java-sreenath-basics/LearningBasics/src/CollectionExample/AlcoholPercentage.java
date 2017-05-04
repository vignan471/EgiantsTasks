package CollectionExample;		// MY BAD --- THIS IS EXCEPTION try catch example ___ wrongly named as collection example package
import java.util.Scanner;
import java.io.InputStream;
public class AlcoholPercentage {

	static int age;
	
	public static void main(String args[]){
		System.out.println("Only Above 21 allowed");
		Scanner a = new Scanner(System.in);
		int b = Integer.parseInt(a.next());
		boolean check = legalLimitChecker(b);
		if (check){
			System.out.println("Welcome to the wine shop");}
		else{ System.out.println("This is not for you kiddo");}
	}

	public static boolean legalLimitChecker(int abcd){
		try{
			if(abcd > 21){
				return true;} 
			else if ( abcd < 1){
				throw new Exception ("Invalid age entered");}
			else if (abcd < 21){
				return false;}
			
			}
		catch(Exception a){
			System.err.println(a.getMessage());}
		
		return false;
		}
}