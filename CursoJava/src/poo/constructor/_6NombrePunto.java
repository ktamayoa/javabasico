package poo.constructor;

import java.awt.Point;

public class _6NombrePunto extends Point {

	private static final long serialVersionUID = 1L;
	String nombre;

	public _6NombrePunto(int x, int y, String nombre) {
		super(x, y); // Si se invoca al constructor mediante super, siempre debe hacerse en la primera línea
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		_6NombrePunto np = new _6NombrePunto(5, 5, "PuntoEncuentro");
		System.out.println("x es " + np.x);
		System.out.println("y es " + np.y);
		System.out.println("Nombre es " + np.nombre);
	}
}
