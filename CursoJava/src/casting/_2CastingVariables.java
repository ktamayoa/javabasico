package casting;

public class _2CastingVariables {

	public static void main(String[] args) {
		double x = 56.01;
		System.out.println("double x = " + x);
		
		// Casting explícito, float tiene menor capacidad de almacenamiento que double
		float y = (float) (2 * x);
		System.out.println("float y = (float)(2 * x) = " + y);
		
		// Casting implícito, double tiene mayor capacidad de almacenamiento que float
		double temp1 = 3.4 * y;
		System.out.println("double temp1 = 3.4 * y = " + temp1);
		
		// Casting explícito, int tiene menor capacidad de almacenamiento que double
		int temp2 = (int) (temp1);
		System.out.println("int temp2 = (int) temp1 = " + temp2);
	}
}
