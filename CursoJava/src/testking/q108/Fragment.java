package q108;

public class Fragment {

	public static void main(String[] args) {
		int[] stack = { 10, 20, 30 };
		int size = 3;
		int idx = 0;

		// Opción A
		//do {
		//	idx++;
		//} while (idx >= size);

		// Opción B
		//while (idx < size) {
		//	idx++;
		//}

		// Opción C
		do {
			idx++;
		} while (idx < size - 1);

		// Opción D
//		do {
//			idx++;
//		} while (idx <= size);
//
//		// Opción E
//		while (idx <= size - 1) {
//			idx++;
//		}
		
		System.out.println("The top element: " + stack[idx]);
	}
}
