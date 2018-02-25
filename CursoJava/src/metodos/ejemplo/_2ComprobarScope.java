package metodos.ejemplo;

public class _2ComprobarScope {

	int test = 10;

	void imprimirTest() {
		int test = 20;
		System.out.println("Test variable local: " + test);
		System.out.println("Test variable de instancia: " + this.test);
	}

	public static void main(String[] args) {
		_2ComprobarScope st = new _2ComprobarScope();
		st.imprimirTest();
	}

}
