package ConstructorDemo;

public class Student {
	static int id = 471;
	static String name = "Viggi";
	
	public static void main(String[] args) {
		
		System.out.println("Name of the student with ID " + id + " is " + name);
		NewAdmission admObject = new NewAdmission();
		admObject.addAdmit();
	}
	public Student(int a, String b){
		super();					// not needed, works even if we remove this line... JVM automatically adds this -- as [arent of all classes is an object class.
		this.id = a;
		this.name = b;
	}
	
	public void printHere(){
		System.out.println("Name of the student with ID " + id + " is " + name);
	}
}
