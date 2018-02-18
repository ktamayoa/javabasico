package loop.ejemplo;

import static java.lang.System.out;

/**
 * Precaucion
 * Prohibido terminantemente dar formato al código !(CTRL + SHIFT + F)
 */
public class _2For {

	public static void main(String[] args) {
		for (
				int contador = 1; 	// inicialización (se ejecuta la primera vez q inicia el for); 
				contador <= 10; 		// expresión; (se realiza la evaluación en cada iteración)
				contador++			// actualización (se actualiza al final de cada iteración)
			) {
			out.print("El valor del contador es: ");
			out.print(contador);
			out.println(" . ");
		}
		out.println(" ¡Terminado! ");
	}
}
