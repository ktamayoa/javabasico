package variables.constantes.ejemplo;

public class Constantes {

	// Constante de clase (static)
	final static double PI = 3.14;
	
	// Constante de instancia (global)
	final double IVA = 12;
	
	public static void main(String[] args) {
		
		// Constante de método (local)
		final String NEMONICO = "CC";
		
		//Accede a constante de método local
		System.out.println(NEMONICO);

		//Accede a constante de clase
		System.out.println(Constantes.PI);
		
		//Accede a constante de instancia (cuando instancia el objeto de la clase)
		Constantes instanciaConstantes = new Constantes();
		System.out.println(instanciaConstantes.IVA);
		
	}
}