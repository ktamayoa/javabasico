package chapter3.stringBuffer;

/**
 * Prueba de los métodos iguales a la clase String
 * charAt, indexOf, length, substring
 * @author csi
 */
public class _1CommonStringMethods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); //amin
		int len = sb.length(); // 7
		char ch = sb.charAt(6); // s
		System.out.println(sub + " " + len  + " " + ch); //anim 7 s
	}
}
