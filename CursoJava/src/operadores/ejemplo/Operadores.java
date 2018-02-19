package operadores.ejemplo;

public class Operadores {
	public static void main(String[] args) {
		
		// Adición
		int altura = 123;
		altura = altura + 10;
		System.out.println("Suma=" + altura);
		
		// Sustracción
		altura = 123;
		altura = altura - 10;
		System.out.println("Resta=" + altura);

		// Multiplicación
		altura = 123;
		altura = altura * 10;
		System.out.println("Multiplicación=" + altura);
		
		// División
		altura = 18;
		altura = altura / 10;
		// Dado que es una división entera, el resultado sera el entero más cercano; para obtener el resultado exacto, se deberia cambiar el tipo de dato, por ejemplo a float.
		System.out.println("División=" + altura); 
		
		// Módulo
		altura = 123;
		altura = altura % 10;
		System.out.println("Modulo=" + altura);
		
		// Expresión compuesta, con varios operadores combinados
		int puntuacion = 12;
		int total = 325 + (puntuacion * 22);
		System.out.println("Total=" + total);

		// Incremento (Sufijo)
		int x = 3;
		int valor = x++ * 10;
		System.out.print("Valor=" + valor);
		System.out.println("; Incremento sufijo=" + x);
		
		// Incremento (Prefijo)
		x = 3;
		valor = ++x * 10;
		System.out.print("Valor=" + valor);
		System.out.println("; Incremento prefijo=" + x);
	}
}
