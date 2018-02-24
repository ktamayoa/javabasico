package casting;

public class _1CastingVariables {

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
		
		
		// castear un entero a byte que su valor original sobrepase la capacidad máxima del destino 56324
		int valorGrande = 563;
		byte destino = (byte) valorGrande;
		System.out.println("Valor " + valorGrande + " convertido a byte es: " + destino);
				
		// convertir un boolean a un entero.
		// boolean verdadero = true;
		// int equivalente =  (int) verdadero; // ESTO NO SE PUEDE
	}
}
