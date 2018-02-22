package poo.objetos;

import java.util.StringTokenizer;

/**
 * Prueba de la clase StringTokenizer, en la practica, para la version de Java 8
 * no se recomienda el uso de esta clase. Ver la documentación en
 * https://docs.oracle.com/javase/8/docs/api/java/util/StringTokenizer.html
 * 
 * StringTokenizer is a legacy class that is retained for compatibility reasons
 * although its use is discouraged in new code. It is recommended that anyone
 * seeking this functionality use the split method of String or the
 * java.util.regex package instead
 */
public class _1PruebaToken {

	public static void main(String[] args) {

		// declaración de un conjunto de variables del mismo tipo, en la misma línea
		StringTokenizer st1, st2;
		String cita = " DSGR@9 32/ 25@2/17";

		// Invocación al constructor con un argumento
		st1 = new StringTokenizer(cita);
		System.out.println("Token 1: " + st1.nextToken());
		System.out.println("Token 2: " + st1.nextToken());
		System.out.println("Token 3: " + st1.nextToken());

		// Invocación al constructor con dos argumentos
		st2 = new StringTokenizer(cita, "@");
		System.out.println("\nToken 1: " + st2.nextToken());
		System.out.println("Token 2: " + st2.nextToken());
		System.out.println("Token 3: " + st2.nextToken());
	}
}
