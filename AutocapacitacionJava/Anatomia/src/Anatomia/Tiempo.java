package Anatomia;

public class Tiempo {

	public static void main(String[] args) {
		float fah = 86;
		System.out.println(fah + " grados Fahrenheit son ...");
		//Fahrenheit a Celsius
		//Restamos 32
		fah = fah -32;
		//Dividir para 9
		fah = fah/9;
		//Multiplicar el valor por 5
		fah = fah*5;
		System.out.println(fah + " grados Celsius\n");
		
		
		float cel = 33;
		System.out.println(fah + " grados Celsius son ...");
		//Celsius a Fahrenheit
		//Restamos 9
		cel = cel - 9;
		//Dividir para 5
		cel = cel/5;
		//Añadir 32 al resultado
		cel = cel + 32;
		System.out.println(cel + " grados Fahrenheit\n");

		
		

	}

}
