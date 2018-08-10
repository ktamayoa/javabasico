package chapter3.equality;

public class _1ComparisonOperator {

	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a"); // Devuelve una referencia al StringBuffer actual; es decir a one
		System.out.println(one == two); // false
		System.out.println(one == three); // true
	}
}
