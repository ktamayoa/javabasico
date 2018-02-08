package operadores.ejemplo;

/**
 * Precaucion
 * Prohibido terminantemente dar formato al código (CTRL + SHIFT + F)
 */
public class Prioridad2 {
	public static void main(String[] args) {
		int x = 2;
		int z = x++ * 6 + 4 * 10 / 2;
		System.out.println(z);  // z = 32
		System.out.println(x);  // x = 3
		
		x = 2;
		int y = x++ * 6 + x * 4 * 10 / 2;
		//      2   * 6 + 3 * 4 * 10 / 2
		//         12   +   12  * 10 / 2
		//         12   +      120   / 2
		//         12   +           60
		//              72
		
		System.out.println(y); // 72
		System.out.println(x); // 3
		
		x = 2;
		y = x++ + x * 4 * 10 / 2;
		//  2   + 3 * 4 * 10 / 2
		System.out.println(y); // 62
		System.out.println(x); // 3
		
		x = 2;
		y = x * 4 * 10 / 2 * x++;
		//  2 * 4 * 10 / 2 * 2
		System.out.println(y); // 80
		System.out.println(x); // 3
	}
}
