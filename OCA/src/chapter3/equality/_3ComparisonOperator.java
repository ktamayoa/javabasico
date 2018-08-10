package chapter3.equality;

public class _3ComparisonOperator {

	public static void main(String[] args) {
		String x = "Hello World";
		// Por el espacio inicial, y es otro literal diferente a x
		String y = " Hello World".trim();
		System.out.println(x == y); // false
	}
}