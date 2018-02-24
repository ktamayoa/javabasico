package poo.objetos;

import java.awt.Point;

public class _2ConfigurarPunto {

	public static void main(String[] args) {
		
		Point localizacion = new Point(4,13);
		System.out.println("Empezar localización:");
		System.out.println("X igual a " + localizacion.x);
		System.out.println("Y igual a " + localizacion.y);
		
		System.out.println("\nMoviéndolo a (7, 6)");
		localizacion.x = 7;
		localizacion.y = 6;
		
		System.out.println("\nLocalización final:");
		System.out.println("X igual a " + localizacion.x);
		System.out.println("Y igual a " + localizacion.y);
	}
}
