package poo.objetos;

import java.awt.Point;

public class _4ReferenciaObjeto {

	public static void main(String[] args) {
		Point pt1, pt2;
		pt1 = new Point(100, 100);
		pt2 = pt1; // new Point(100, 100); //pt2 sería un objeto distinto de pt1
		// Modifica las coordenadas de Point pt1
		pt1.x = 200;
		pt1.y = 200;
		System.out.println("Point1: " + pt1.x + ", " + pt1.y);
		System.out.println("Point2: " + pt2.x + ", " + pt2.y);
		
		int entero = 5;
		Point p3 = new Point(7, 8);
		miMetodo(entero, p3);
		System.out.println("------------------------------");
		System.out.println("Datos luego de invocacion, fuera del método:");
		imprimir(entero, p3);
	}
	
	private static void miMetodo(int numero, Point p) {
		System.out.println("\n------------------------------");
		System.out.println("Datos originales dentro del método:");
		imprimir(numero, p);
		// cambios
		numero++;
		p.x = 0;
		p.y = 1;
		System.out.println("Datos modificados dentro del método:");
		imprimir(numero, p);
	}
	
	public static void imprimir(int numero, Point p) {
		System.out.println("numero=" 
				+ numero
				+ "\nPunto ("
				+ p.x
				+ ","
				+ p.y
				+ ")");
	}
}
