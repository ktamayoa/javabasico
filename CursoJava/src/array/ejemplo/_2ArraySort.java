package array.ejemplo;

import java.util.Arrays;

public class _2ArraySort {

	public static void main(String[] args) {
		String[] nombres = { "Katty", "Gloria", "Natalia", "Estefy", "Christian", "Maria", "Juan", "Ruben", "Eduardo",
				"Marcelo", "Lucy", "Adriana", "Esthefany", "Salome", "Odrey", "Dayli", "Vivi", "Isac", "Alicia",
				"Daniela", "Karen", "Alex", "Edgar", "Carlos", "Kevin", "Génesis" };
		System.out.println("Arreglo original");
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(i + ": " + nombres[i] + " ");
		}
		Arrays.sort(nombres);
		System.out.println("\nArreglo ordenado");
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(i + ": " + nombres[i] + " ");
		}
	}
}
