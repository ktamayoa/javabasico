package modificadores;

public class _2ContadorInstancias {

	static private int numInstancias = 0;

	protected static int getCuenta() {
		return numInstancias;
	}

	private static void addInstancia() {
		numInstancias++;
	}

	public _2ContadorInstancias() {
		_2ContadorInstancias.addInstancia();
	}

	public static void main(String[] args) {
		System.out.println("Empezamos con " 
				+ _2ContadorInstancias.getCuenta() + " instancias");
		for (int i=0; i<500; ++i) {
			new _2ContadorInstancias();
		}
		System.out.println("Creadas " 
				+ _2ContadorInstancias.getCuenta() + " instancias");
	}
}
