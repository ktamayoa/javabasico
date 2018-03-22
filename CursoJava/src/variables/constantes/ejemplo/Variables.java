package variables.constantes.ejemplo;

public class Variables {

	public static void main(String[] args) {

		int _altura = 165;
		System.out.println(_altura);
		boolean esFinalizado = false;
		System.out.println(esFinalizado);
		float $promedio;
		$promedio = 3.2F;
		System.out.println($promedio);
		int c = 4 * 3;
		System.out.println(c);
		char clave = 'C';
		System.out.println(clave);
		String nombre = "Katty";
		System.out.println(nombre);
		String apellido = "Tamayo";
		System.out.println(apellido);
		String otraVariable = nombre = apellido = "prueba";
		System.out.println(otraVariable);
		System.out.println(nombre);

		// Ejemplos que no cumplen con las reglas de nombrado si dan error
		// int 4share;
		// int _var 1;
		// int $var.2;
		
		// Ejemplos que no cumplen con las convenciones de nombrado no dan error
		// int asdlkasdjas;
		// int Hola;
		// float mivaRIaBLELocaCC;
	}
}
