package variables.constantes.ejemplo;

public class Constantes {

	// Constante de clase
	final static double PI = 3.14;
	
	// Constante de instancia (global)
	final double iva = 12;
	
	public static void main(String[] args) {
		
		// Constante de método (local)
		final String NEMONICO = "CC";
		
		System.out.println(NEMONICO);
		
		// TODO Explicación a futuro
		System.out.println(Constantes.PI);
		Constantes instanciaConstantes = new Constantes();
		System.out.println(instanciaConstantes.iva);
	}
}