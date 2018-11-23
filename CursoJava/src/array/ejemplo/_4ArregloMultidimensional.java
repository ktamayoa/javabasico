package array.ejemplo;

import java.util.Arrays;

/**
 * Objetivo:
 * Muestra las diferentes formas válidas y no válidas de crear un arreglo.
 * @author Christian Inapanta
 * @since 23/11/2018
 */
public class _4ArregloMultidimensional {

	public static void main(String[] args) {
		
		String[][] arreglo2D = new String[2][];
		// arreglo2D[0][0] = "hola"; // Aqui dará NullPointerException ya que la segunda dimensión del arreglo aún no se ha inicializado
		
		arreglo2D[0] = new String[2];
		arreglo2D[0][0] = "hola";
		
		System.out.println(Arrays.toString(arreglo2D)); // el método imprime un hash cuando uno de los elementos del arreglo es otro arreglo
		System.out.println(Arrays.toString(arreglo2D[0]));
		
		//Error: Variable must provide either dimension expressions or an array initializer
		// String[][] arreglo2D = new String[][];
		
		//Error: Cannot specify an array dimension after an empty dimension
		// String[][] arreglo2D = new String[][3];
		
		//Error: The local variable arreglo2D may not have been initialized
		// String[][] arreglo2D;
		// arreglo2D[0] = new String[1];
	}
}
