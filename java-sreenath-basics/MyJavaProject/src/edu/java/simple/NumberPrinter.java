package edu.java.simple;		// Package Declaration, path for the file

import java.util.Date;
import java.lang.String;		// import statements 

public class NumberPrinter {	// class declaration	

	public int viggi = 471;			// Data member declaration
 
	final String newyear = "January 1st";		// Assigning new year as constant
	
	public static void main(String[] args) {	// main method declaration - later about static
		
		System.out.println("Today's date is " + new Date());	//object creation because of new
		
	//	System.out.println(viggi); 		// ERROR LINE - because data member viggi has scope in the total class, but static method doesn't belong to the class
		
		for (int i=0; i < 10; i++){			// for syntax
			System.out.println(i);			// understanding of stack and heap with this example
		} 
		String name = "Vignan";			// variable/object named as name declared using String class and assigned with Vignan
		System.out.println(name);		// scope of variable (name) is within its scope (limited to main method)
	}	
	
	public int printViggiRoll(){		// member function
		return viggi;				// scope of data member (viggi) is within the class
	}
	
	public void printSunday(){
		System.out.println(DAYS.SUNDAY);
	}
	
	public enum DAYS {SUNDAY, MONDAY, TUESDAY, SATURDAY} // Assigning set of related constants using Enumeration 

	public void UsdToInr(){
		float usd = 68.5f;			// declaring float variable, without f, usd will become double
		boolean usdequalsinr = false;	// declaring boolean variable
		{
		int inr = 1;			// declaring integer variable 
		}						// inr scope has only custom scope which is within its braces 
	}
	
	public void boxingAndCastingDemo(){
		Integer viggiobject = viggi;		// boxing or auto boxing - converting primitive (viggi) to class
		viggi = viggiobject.intValue();		// unboxing - bringing value from its class
		
		float y = 1.5f;
		Float yobject = y;			// boxing
		
		double z = y;  			// implicit casting because double is greater than float - so java automatically casts it
		y = (float) z;			// we need to explicitly say to convert z  
	}

}