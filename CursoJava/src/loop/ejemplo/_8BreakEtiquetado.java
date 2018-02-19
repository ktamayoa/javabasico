package loop.ejemplo;

public class _8BreakEtiquetado {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int points = 0;
		int target = 100;
		 
		targetLoopWhile: while (target <= 100) {
			targetLoopFor: for (int i = 0; i < target; i++) {
				System.out.println("i: " + i);
				System.out.println("inicio: " + points);

				if (points > 50) {
					System.out.println("points = " + points);
					System.out.println("Saliendo de los 2 loops");
					break targetLoopWhile;
				}
				points = points + i;
				System.out.println("fin: " + points);
			}
		}
	}
}
