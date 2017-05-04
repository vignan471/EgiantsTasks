package edu.java.exception;

public class LoginTest{

	public static void main(String args[]){
	try{														 // Put everything in try block when we might have an exception
		if (args.length < 2){
			throw new Exception("Need exactly 2 arguments");	 // Manually throw an exception using pre-defined Exception class 
		}
		Authenticator Aobj = new Authenticator();
		Aobj.startAuthentication();								// if this line is commented then, custom exception works
		String username = args[0];
		String password = args[1];
		
		System.out.println("Login status : " + Aobj.authenticate(username, password));
		}
	catch(Exception exceptionName){								// To handle an exception using catch
			System.err.println(exceptionName.getMessage());
		}
}
}
