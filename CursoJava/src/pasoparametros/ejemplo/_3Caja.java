package pasoparametros.ejemplo;

import java.awt.Point;

public class _3Caja {
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;

	_3Caja construirCaja(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;

		// retorno del objeto
		return this;

	}

	// Sobrecarga, con número distinto de argumentos
	_3Caja construirCaja(Point supIzq, Point infDer) {
		x1 = supIzq.x;
		y1 = supIzq.y;
		x2 = infDer.x;
		y2 = infDer.y;

		return this;
	}

	_3Caja construirCaja(Point supIzq, int ancho, int alto) {
		x1 = supIzq.x;
		y1 = supIzq.y;
		x2 = (x1 + ancho);
		y2 = (y1 + alto);

		return this;
	}

	void imprimirCaja() {
		System.out.print("Caja: <" + x1 + " , " + y1);
		System.out.println(", " + x2 + " , " + y2 + " >");
	}

	public static void main(String[] args) {

		_3Caja rect = new _3Caja();

		System.out.println("Construir caja con 1er método - coordenadas" + "(25, 25) y (50, 50)");
		rect.construirCaja(25, 25, 50, 50);
		rect.imprimirCaja();

		System.out.println("Construir caja con 2do método - coordenadas" + "(10, 10) y (20, 20)");
		rect.construirCaja(new Point(10, 10), new Point(20, 20));
		rect.imprimirCaja();

		System.out.println("Construir caja con 3er método - coordenadas" + "(10, 10) y (50, 50)");
		rect.construirCaja(new Point(10, 10), 50, 50);
		rect.imprimirCaja();

	}

}
