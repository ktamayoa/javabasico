package loop.ejemplo;

public class _10LoopComplejo {

	public static void main(String[] args) {
		int i, j;
		for (i = 0, j = 0; i * j < 100; i++, j += 2) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
}
