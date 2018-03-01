package pasoparametros.ejemplo;

public class _1Convertidor {

	void aMayusculas(String[] texto) {
		for (int i = 0; i < texto.length; i++)
			texto[i] = texto[i].toUpperCase();
	}

	// args pasa por referencia al método, por lo que al cambiar a mayúsculas, los cambios se ven reflejados en args
	// static que puede acceder a otros miembros de clase no puede hacerlo al método aMayusculas directamente sino a través de una instancia
	public static void main(String[] args) {
		_1Convertidor convertidor = new _1Convertidor();
		convertidor.aMayusculas(args);

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		//aMayusculas(new String[3]);
	}

}
