package loop.ejemplo;

public class _6Continue {

	public static void main(String[] args) {
		int index = 0;
		while (index <= 10) {
			index = index + 2;
			if (index == 4) {
				continue;
			}
			System.out.println(index);
		}
	}
}
