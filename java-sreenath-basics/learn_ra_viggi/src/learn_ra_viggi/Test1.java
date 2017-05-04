package learn_ra_viggi;

public class Test1{

	Test1(){
		System.out.println("This is big parent's constructor");
	
	}
	
	public void display(){
		System.out.println("This is from big parent");
	}
	
    public static void main(String args[]){
		
		Test3 t3_obj = new Test3();
		
		t3_obj.display();
    }	
}

class Test2 extends Test1  {
	
	Test2(){
		System.out.println("This is parent's constructor");
	}
	
	public void display(){
		System.out.println("This is from parent");
	}
}

class Test3 extends Test2	{
	
	Test3(){
	    System.out.println("This is child's constructor");
	}
	
	public void display(){
		System.out.println("This is from child");
	}
}
