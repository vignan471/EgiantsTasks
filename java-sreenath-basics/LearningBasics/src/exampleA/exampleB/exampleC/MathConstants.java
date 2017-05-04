package exampleA.exampleB.exampleC;

public enum MathConstants {

	PI(3.14159f), c(300000000f);
	
	public final float constantValue;
	
	private MathConstants(float value){
		this.constantValue = value;
	}

}

