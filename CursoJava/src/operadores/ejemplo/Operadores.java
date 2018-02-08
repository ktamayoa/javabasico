package operadores.ejemplo;

public class Operadores {
	public static void main(String[] args) {
		
		// Adicion
		int altura = 123;
		altura = altura + 10;
		System.out.println("Suma=" + altura);
		
		// Sustraccion
		altura = 123;
		altura = altura - 10;
		System.out.println("Resta=" + altura);

		// Multiplicacion
		altura = 123;
		altura = altura * 10;
		System.out.println("Multiplicacion=" + altura);
		
		// Division
		altura = 18;
		altura = altura / 10;
		// Dado que es una division entera, el resultado sera el entero mas cercano; para obtener el resultado exacto, se deberia cambiar el tipo de dato, por ejemplo a float.
		System.out.println("Division=" + altura); 
		
		// Modulo
		altura = 123;
		altura = altura % 10;
		System.out.println("Modulo=" + altura);
		
		// Expresion compuesta, con varios operadores combinados
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
