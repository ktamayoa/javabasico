package testking.q95;

class A {
	public void test(){
		System.out.println("A");
	}
}

class B extends A{
	public void test(){
		System.out.println("B");
	}
}


public class _95C extends A{

	public void test(){
		System.out.println("C");
	}
	public static void main(String[] args) {
		A b1 = new A();
		A b2 = new _95C();
		
		b1 = (A)b2;
		A b3 = (B)b2; //testking.q95._95C cannot be cast to testking.q95.B
		
		b1.test();
		b3.test();
	}
}
