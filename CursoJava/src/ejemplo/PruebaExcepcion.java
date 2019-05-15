package ejemplo;

import com.sun.org.apache.xpath.internal.operations.Number;

public class PruebaExcepcion {

	public static void main(String[] args) {
		
		final Object exception = new Exception();
//		final Exception data = (RuntimeException)exception;
		Exception data = new RuntimeException();
		System.out.print(data);
		
		Object o = new Number();
//		Number n = (Integer)o;
//		Number n = new Integer();
		
		Padre p = new Padre("");
//		Padre p2 =  new Hija(); //Si es posible
		Padre p2 =  (Hija)p;
		System.out.print(data);
	}
	
}
