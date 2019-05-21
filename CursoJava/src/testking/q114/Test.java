package q114;

/*
 * Si se ejecuta la clase Test con los siguientes comandos, cuál es el resultado
 * javac Test.java
 * java Test
 */

public class Test {
	public static final int MIN = 1;
	
	public static void main(String[] args) {
	
		int x = args.length; // x = 0
		
		if (checkLimit(x)){ //line n1
			System.out.println("Java SE");
		} else{
			System.out.println("Java EE"); // Despliega "Java EE" (Respuesta: B)
		}
	}

	private static boolean checkLimit(int x) {
		return (x >= MIN) ? true : false; // 0 >= 1 (false) .: retorna false
	}
	
}
