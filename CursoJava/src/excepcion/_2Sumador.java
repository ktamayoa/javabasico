package excepcion;

public class _2Sumador {

	public static void main(String[] argumentos) {
		float sum = 0;
		for (int i = 0; i < argumentos.length; i++) {
			sum = sum + Float.parseFloat(argumentos[i]);
		}
		System.out.println("Esos números suman un total de: " + sum);
	}
}
