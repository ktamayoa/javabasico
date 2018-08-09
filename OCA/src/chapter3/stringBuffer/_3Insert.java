package chapter3.stringBuffer;

/**
 * Ejemplos de delete y deleteCharAt
 * @author csi
 *
 */
public class _3Insert {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		sb.delete(1, 3); 				// sb = adef
		sb.deleteCharAt(5); 				// throws an StringIndexOutOfBoundsException (solo existían 4 caracteres restantes)
	}
}
