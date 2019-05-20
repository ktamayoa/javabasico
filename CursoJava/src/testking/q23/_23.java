package testking.q23;

public class _23 {

	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		System.out.println("a:" + a);
		System.out.println("x++:" + x);
		int b = ++x;
		System.out.println("b:" + b);
		System.out.println("++x:" + x);
		int c = x++;
		System.out.println("c:" + c);
		System.out.println("x++:" + x);
		
		//int d = (a < b) ? (a < c) ? a : (b < c) ? b: c;
	}
}
