package operadores.ejemplo;

public class Operadores {
	public static void main(String[] args) {
		
		// Adicion
		int altura = 123;
		altura = altura + 10;
		System.out.println(altura);
		
		// Sustraccion
		altura = 123;
		altura = altura - 10;
		System.out.println(altura);

		// Multiplicacion
		altura = 123;
		altura = altura * 10;
		System.out.println(altura);
		
		// Division
		altura = 123;
		altura = altura / 10;
		System.out.println(altura);  // Dado que es una division entera, el resultado sera el entero mas cercano; para obtener el resultado exacto, se deberia cambiar el tipo de dato, por ejemplo a float.
		
		// Multiplicacion
		altura = 123;
		altura = altura % 10;
		System.out.println(altura);
		
		// Expresion compuesta, con varios operadores combinados
		int puntuacion = 12;
		int total = 325 + (puntuacion * 22);
		System.out.println(total);

		// Incremento (Sufijo)
		int x = 3;
		int valor = x++ * 10;
		System.out.println(valor);
		System.out.println(x);
		
		// Incremento (Prefijo)
		x = 3;
		valor = ++x * 10;
		System.out.println(valor);
		System.out.println(x);
	}
}
