package operadores.taller;

/**
 * Programa que convierte de Celsius a Fahrenheit y viceversa
 * Aplica la siguientes formulas: 
 * C = 5/9 (F - 32) 
 * F = 9/5 * C + 32
 * @author csi
 *
 */
public class Tiempo {
	public static void main(String[] args) {
		float fah = 70;
		System.out.println( fah + " grados Fahrenheit son . . .");
		// Para convertir de Fahrenheit a Celsius se resta 32
		fah = fah - 32;
		// Divir el resultado para 9
		fah = fah / 9;
		// Multiplicar el resultado por 5
		fah = fah * 5;
		System.out.println(fah + " grados Celsius\n");
		
		float cel = 21;
		System.out.println( cel + " grados Celsius son . . .");
		// Para convertir de Celsius a Fahrenheit se empieza por multiplicar por 9
		cel = cel * 9;
		// Divir el resultado para 5
		cel = cel / 5;
		// Sumar 32 al resultado
		cel = cel + 32;
		System.out.println(cel + " grados Fahrenheit");
	}
}
