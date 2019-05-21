package q078;

public class _078 {

	public static void main(String[] args) {
		int n[][] = { { 1, 3 }, { 2, 4 } };
		for (int i = n.length - 1; i >= 0; i--) {
			for (int y : n[i]) {
				System.out.print(y); 
				/* 
				 * La salida correcta es 2413
				 * El libro está mal porque dice que la respuesta correcta es 4231.
				 * Esto es incorrecto porque un foreach nunca va hacia atrás.
				 */
			}
		}
	}
}
