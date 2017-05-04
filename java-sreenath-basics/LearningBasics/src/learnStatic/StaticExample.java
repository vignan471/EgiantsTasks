package learnStatic;

public class StaticExample {
	
	private int a = 10;
	private static float b = 20f;
	
	static {
		System.out.println("Im more important than main yoo");
	}
	
	public static void main(String args[]){
		
		StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		StaticExample obj3 = new StaticExample();
		
		System.out.println(Configuration.getObject());
		
		obj1.a = 50;
		obj1.b = 200;

		obj2.a = 500;
		obj2.b = 2000;

		obj3.a = 5000;
		obj3.b = 20000;

		
		System.out.println( obj1.a + "     " + obj1.b);
		System.out.println( obj2.a + "     " + obj2.b);
		System.out.println( obj3.a + "     " + obj3.b);
		
	}

}
