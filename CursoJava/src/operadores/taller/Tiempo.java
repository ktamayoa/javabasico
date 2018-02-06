package operadores.taller;

public class Tiempo {
	public static void main(String[] args) {
		float fah = 86;
		System.out.println( fah + " grados Fahrenheit son . . .");
		// Para convertir de Fahrenheit a Celsius se resta 32
		fah = fah - 32;
		// Divir el resultado para 9
		fah = fah / 9;
		// Multiplicar el resultado por 5
		fah = fah * 5;
		System.out.println(fah + " grados Celsius\n");  // fah = 30
		
		float cel = 33;
		System.out.println( cel + " grados Celsius son . . .");
		// Para convertir de Celsius a Fahrenheit se empieza por multiplicar por 9
		cel = cel * 9;
		// Divir el resultado para 5
		cel = cel / 5;
		// Sumar 32 al resultado
		cel = cel + 32;
		System.out.println(cel + " grados Fahrenheit");  // cel = 91.4
	}
}
