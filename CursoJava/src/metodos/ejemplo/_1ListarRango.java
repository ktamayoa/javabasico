package metodos.ejemplo;

public class _1ListarRango {

	// int crearRango(int inferior, int superior)[]{
	// También se puede definir con los corchetes correspondientes al array al
	// final del método, por convención colocar al inicio
	int[] crearRango(int inferior, int superior) {
		int[] rango = new int[(superior - inferior) + 1];

		for (int i = 0; i < rango.length; i++) {
			rango[i] = inferior++;
		}

		// Devuelve un array con valores del inferior al superior
		return rango;
	}

	public static void main(String[] args) {
		int[] rango;

		_1ListarRango listar = new _1ListarRango();
		rango = listar.crearRango(5, 15);

		System.out.print("El array: [ ");

		for (int i = 0; i < rango.length; i++) {
			System.out.print(rango[i] + " ");
		}

		System.out.print("]");

	}

}
