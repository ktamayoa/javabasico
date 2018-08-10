package chapter3.equality;

public class _2ComparisonOperator {

	public static void main(String[] args) {
		// Referencias x, y al mismo objeto (string pool)
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); // true, dado que es el mismo objeto en el pool
	}
}
