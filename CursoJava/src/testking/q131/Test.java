package q131;

/*
 * Pregunta: Dado, cuál es el resultado?
 * Respuesta: A 
 */

public class Test {

	int a1;

	public static void doProduct(int a) {
		a = a * a; // los cambios no afectan al argumento recibido
	}

	public static void doString(StringBuilder s) {
		s.append(" " + s); // Los cambios si afectan al objeto referenciado por s
	}

	public static void main(String[] args) {
		Test item = new Test();
		item.a1 = 11;
		StringBuilder sb = new StringBuilder("Hello");
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i + " " + sb + " " + item.a1); // Imprime: 10 Hello Hello 11
	}
}
