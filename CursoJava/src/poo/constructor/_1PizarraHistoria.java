package poo.constructor;

public class _1PizarraHistoria {

	String estatus;
	int numeroPregunta;
	int puntuacion;
	
	_1PizarraHistoria(String entrada1, int entrada2, int entrada3) {
		estatus = entrada1;
		numeroPregunta = entrada2;
		puntuacion = entrada3;
	}
	
	public static void main(String[] args) {
		
		_1PizarraHistoria grecia = new _1PizarraHistoria("activa", 3, 6);
		System.out.println(grecia.estatus);
		System.out.println(grecia.numeroPregunta);
		System.out.println(grecia.puntuacion);
	}
}
