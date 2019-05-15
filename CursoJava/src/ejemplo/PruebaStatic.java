package ejemplo;

public class PruebaStatic {

	private static int variablePrivada = 1;
	
	public void add() {
		variablePrivada++;
	}
	
	public int getStatica() {
		return variablePrivada;
	}
	
	public static void main(String[] args) {
		int prueba = variablePrivada;
		System.out.println(prueba);
		
		PruebaStatic i1 = new PruebaStatic();
		i1.add();
		PruebaStatic i2 = new PruebaStatic();
		i2.add();
		
		System.out.println(variablePrivada);
	}

}
