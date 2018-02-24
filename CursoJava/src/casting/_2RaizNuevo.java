package casting;

public class _2RaizNuevo {

	public static void main(String[] args) {

		int numero = 100;
		if (args.length > 0) {
			numero = Integer.parseInt(args[0]);
		}

		System.out.println("La raíz cuadrada de " 
				+ numero 
				+ " es " 
				+ Math.sqrt(numero));
	}
}
