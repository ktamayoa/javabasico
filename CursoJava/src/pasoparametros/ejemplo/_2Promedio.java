package pasoparametros.ejemplo;

public class _2Promedio {

	public static void main(String[] args) {
		int sum = 0;

		// Comprobar si existen argumentos
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				// parseInt método de clase de la clase integer
				// Para cada tipo primitivo existe una clase de envoltura
				System.out.println("Argumento recibido: " + args[i]);
				sum += Integer.parseInt(args[i]);
			}

			System.out.println("Suma es: " + sum);
			System.out.println("Promedio es: " + (float) sum / args.length);

		}

	}

}
