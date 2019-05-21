package q133;

/*
 * Pregunta: Cuales dos definiciones de clases fallan en la compilación
 * Respuesta: D, E 
 */

// Opción A
abstract class A3 {
	private static int i;
	public void doStuff() {}
	public A3() {} // Una clase abstracta si puede definir un constructor
}

//Opción B
final class A1 {
	public A1() {}
}

//Opción C
public class A2 {
	private static int i;
	private A2() {}
}

//Opción D
class A4 {
	/*
	 * un campo final debe ser inicializado en su declaración 
	 * o a lo mucho en un bloque de inicialización estático.
	 */
//	protected static final int i;	// No compila
	private void doStuff() {}
}

//Opción E
//final abstract class A5 { // No compila. Una clase puede ser static o final, no ambas a la vez
//	protected static int i;
//	void doStuff() {}
//	abstract void doIt();
//}