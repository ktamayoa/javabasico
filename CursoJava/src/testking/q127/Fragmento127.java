package q127;

import java.util.ArrayList;
import java.util.List;

/*
 * Pregunta: Dado el fragmento de código, cuál es el resultado
 * Respuesta: A
 */

public class Fragmento127 {

	public static void main(String[] args) {
		List colors = new ArrayList();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);		
		colors.add(3, "cyan");
		System.out.println(colors); // imprime: [green, red, yellow, cyan]
	}
}
