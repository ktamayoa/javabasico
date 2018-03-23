package excepcion;

public class _4Division {

	public static void main(String[] args) { //throws FileNotFoundException {
//		if(true) {
//			throw new FileNotFoundException("no existe archivo");
//		}
		if (args.length == 2) {
			int resultado = 0;
			try {
				resultado = Integer.parseInt(args[0]) / Integer.parseInt(args[1]); // No existe division entera para cero
				System.out.println(args[0] + " dividido por " + args[1] + " igual a " + resultado);
			} catch (NumberFormatException e) {
				System.out.println("Ambos argumentos deben ser números.");
				// throw e;
			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage()); // Obtiene el mensaje de error de la excepción
				throw e;
			} finally {
				System.out.println("El bloque try/catch/finally ha finalizado. Se ejecuta siempre finally");
			}
		}
	}
}
