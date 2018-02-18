package loop.ejemplo;

/**
 * Ejemplo tomado del libro: Java cómo programar de Deitel & Deitel, 
 * Quinta Edición. Capítulo 5, Pag 166.
 */
public class _9ContinueEtiquetado {

	public static void main(String[] args) {
		String salida = "";
		siguienteFila: // etiqueta de destino de la instrucción continue
		// contar 5 filas
		for (int fila = 1; fila <= 5; fila++) {
			salida += "\n";
			// contar 10 columnas por fila
			for (int columna = 1; columna <= 10; columna++) {
				// Si la columna es mayor que la fila, empezar en la siguiente fila
				if (columna > fila)
					continue siguienteFila; // siguiente iteración del ciclo etiquetado
				salida += "* ";
			} // fin de instrución for interior
		} // fin de instrucción for exterior
		System.out.println(salida);
	}
}
