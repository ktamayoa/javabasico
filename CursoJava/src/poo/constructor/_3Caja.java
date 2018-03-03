package poo.constructor;

import java.awt.Point;

public class _3Caja {

	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	
	 _3Caja(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	_3Caja(Point supIzq, Point infDer) {
		this(supIzq.x, supIzq.y, infDer.x, infDer.y);
//		this(supIzq, infDer.x, infDer.y);  // Solo se puede llamar a un constructor
//		x1 = supIzq.x;
//		y1 = supIzq.y;
//		x2 = infDer.x;
//		y2 = infDer.y;
	}
	
	_3Caja(Point supIzq, int an, int al) {
		x1 = supIzq.x;
		y1 = supIzq.y;
		x2 = (x1 + an);
		y2 = (y1+ al);
	}
	
	void imprimirCaja() {
		System.out.print("Caja: < " +  x1 + ", " + y1);
		System.out.println(", " +  x2 + ", " + y2 + " >");
	}
	
	public static void main(String[] args) {
		_3Caja rect;
		System.out.println("Llamando a construir caja con coordenadas " 
				+ "(25, 25) y (20, 50) : ");
		rect = new _3Caja(25, 25, 50, 50);
		rect.imprimirCaja();
		
		System.out.println("\nLlamando a construir con puntos " 
				+ "(10, 10) y (20, 20) : ");
		rect = new _3Caja(new Point(10, 10), new Point(20, 20));
		rect.imprimirCaja();
		
		System.out.println("\nLlamando a construir con: punto " 
				+ "(10, 10), ancho 50 y alto 50 : ");
		rect = new _3Caja(new Point(10, 10), 50, 50);
		rect.imprimirCaja();
	}
}
