package multipleIntefaceSameMethod;

public class RunIt {
	
	public static void main(String[] args) {
		System.out.println("This is main");
		boolean a = true;
		boolean b = false;
		
		boolean c = a || b;
		
		System.out.println(c);
		TestIt a2 = new TestIt();
		a2.jaffa();
	}

}
