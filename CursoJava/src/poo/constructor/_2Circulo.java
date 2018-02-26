package poo.constructor;

public class _2Circulo {

	int x, y, radio;

	_2Circulo(int puntoX, int puntoY, int tamRadio) {
		this.x = puntoX;
		this.y = puntoY;
		this.radio = tamRadio;
	}

	public _2Circulo(int puntoX, int puntoY) {
		// Accede al otro constructor
		this(puntoX, puntoY, 1);
		resultado();
	}
	
	void resultado() {
		int resultado = x * y * radio;
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {
//		_2Circulo circulo = new  _2Circulo(2, 3, 1);
//		circulo.resultado();
		_2Circulo circulo = new  _2Circulo(2, 3);
		System.out.println(circulo);
	}
}
