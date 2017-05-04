package edu.java.exception;

public class MyCustomException extends Exception {

	public String getWhatIWrote() {
		return "Authentication process not started";
	}	 
}
