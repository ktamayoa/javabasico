package q132;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Pregunta: Dado el framento de código, cuál es el resultado
 * Respuesta: A (Falla la compilación)
 */

public class Fragmento {

	public static void main(String[] args) {
		String[] arr = { "Hi", "How", "Are", "You" };
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));

		/*
		 * El código comentado no compila por dos razones:
		 * 1. (return s.length <=2;) debería ser {return s.length <=2;}
		 * 2. En System.out.println(s + "removed");  s está fuera del alcance.
		 */
		// if(arrList.removeIf((String s) -> (return s.length <=2;))) {
		// System.out.println(s + "removed");
		// }

		// A continuación la lógica correcta de lo que se cree que se deseaba intentaba implementar
		arrList.removeIf((String s) -> {
			boolean condition = s.length() <= 2;
			if (condition) {
				System.out.println(s + " removed");
			}
			return condition;
		});
		System.out.println("Lista final: " + arrList);
	}
}
