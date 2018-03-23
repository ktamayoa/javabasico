package excepcion;

public class _3Sumador {

	public static void main(String[] argumentos) {
		float sum = 0;
		for (int i = 0; i < argumentos.length; i++) {
			try {
				sum = sum + Float.parseFloat(argumentos[i]);
			} catch (NumberFormatException e) {
				System.out.println(argumentos[i] + " no es un número.");
			}
		}
		System.out.println("Esos números suman un total de: " + sum);
	}
}
