package loop.ejemplo;

public class _7LoopsAnidados {

	public static void main(String[] args) {
		int points = 0;
		int target = 100;
		while (target <= 100) {
			for (int i = 0; i < target; i++) {
				if (points > 50) {
					System.out.println("Saliendo del loop for");
					break;
				}
				points = points + i;
			}
		}
	}
}
