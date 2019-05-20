package testking.q85;

public class Test {

	public static void main(String[] args) {
		
//		if(args[1] == null) {
//			System.out.println("arg[1] es null");			
//		} else {
//			System.out.println("arg[1] es \"null\"(Cadena) y no un nulo");
//		}
		
		/*
		 * Boolean.valueOf(stringArg) y new Boolean(stringArg)
		 * 		Devuelve true si el texto es tRuE (ignorecase)
		 *  	Devuelve false si es null o cualquier otro texto diferente de TRUE (ignorecase)
		 */
		
		boolean a = new Boolean(Boolean.valueOf(args[0])); // se envia "TRUE" .: es true tanto en valueOf como en el constructor de la clase de envoltura
		boolean b = new Boolean(args[1]); // se envia "null"(cadena de texto) .: es false
		System.out.println(a + " " + b); // despliega: true false
	}
}
