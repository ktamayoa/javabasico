package ejemplo;

public class Arreglo {

	static int[][] game = new int[4][4];

	public static void main(String args[]) {
		game[3][3] = 6;
		Object[] obj = game;
//		obj[3] = 'X';
		
		int[] arregloColgado = (int[])obj[3];
		arregloColgado[0] = 'y';
		
		System.out.println(game[3][3]);
	}

}
