package q86;

public class Fragment {

	public static void main(String[] args) {
		int[][] arr = new int[2][4];
		/*
		 * new int[] {} es obligatorio en las siguietes asignaciones
		 */
		arr[0] = new int[] { 1, 3, 5, 7 };
		arr[1] = new int[] { 1, 3 };

		/* Alternativamente se pudo haber inializado el arreglo al declararlo
		 * int[][] arr = { { 1, 3, 5, 7 }, { 1, 3 } };
		 * NOTA: esta última forma solamente es válido si se especifican todos los
		 * elementos al momento de declarar el arreglo.
		 * No es válido lo siguiente (ya que el arreglo ya fue declarado en una línea previa).
		 * 	arr[0] = { 1, 3, 5, 7 };
		 */
		for (int[] a : arr) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
