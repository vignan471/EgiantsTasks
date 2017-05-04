package MulitiConstrcutorDemo;

public class B extends A{
		public B() {
			System.out.println("Default Constructor from B");
		}

		public B(int b) {
			super(10);
			System.out.println("Param Constructor from B");
		}
		
		public static void main(String[] args) {
			B bObject1 = new B();
			B bObject2 = new B(10);
			}

}
