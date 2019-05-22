package q128;

/*
 * Pregunta: Dado el siguiente fragmento de código, 
 * 			 cuáles 3 fragmentos son válidos para insertar en la línea n1
 * Respuesta: A,D,E
 */
abstract class Toy {
	int price;
	// line n1
	
	// Opción A. Correcta
	public static void insertToy() {
		/* codigo va aqui */
	}
	
	// Opción B. No porque un abstract no debe tener cuerpo
//	public abstract Toy getToy() {
//		return new Toy();
//	}
	
	// Opción C. No porque el método no es declarado abstract ni provee un cuerpo 
//	public void printToy();
	
	// Opción D. Correcta. Es un método concreto bien definido
	public int calculatePrice() {
		return price;
	}
	
	// Opción E. Correcta, es un metodo abstracto bien definido
	public abstract int computeDiscount();
}