package exampleA.exampleB.exampleC;

public class Calculator {

	static final String learnerName = "Vignan";
	
	static double operant1 = 100, operant2 = 200;
	
	public static void main(String[] args) {
		
		System.out.println("Learning Person is " +learnerName + ". He is making a Calculator");
		
		ArithematicOperations arithematicOperationsObject = new ArithematicOperations();
		
		System.out.println("Operant 1 = " + String.valueOf(operant1) +"\nOperant 2 = " + String.valueOf(operant2));
		
		arithematicOperationsObject.additionOperation(operant1, operant2);
		
		System.out.println("Area of the circle with radius " + String.valueOf(operant1) +" is "+ String.valueOf((MathConstants.PI.constantValue*operant1*operant1) + "")) ;
		
		Loops loopsObject = new Loops();
		
		loopsObject.loopsExamples();
	}

}