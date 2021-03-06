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
	
	//??? a qué hora llamó a este método
	public String toString() {
		System.out.println(super.toString());
		return "Valores de mi circulo: x=" + x + ", y=" + y + ", radio=" + radio;
	}
	
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	public static void main(String[] args) {
		_2Circulo circulo = new  _2Circulo(2, 3, 4);
		circulo.resultado();
		
		_2Circulo circulo2 = new  _2Circulo(2, 3);
		System.out.println(circulo2);
	}
}
