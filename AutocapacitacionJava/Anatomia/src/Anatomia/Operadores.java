package Anatomia;

public class Operadores {

	public static void main(String[] args) {
		int intAltura = 123;
		intAltura = intAltura % 7; //modulus 123/7 = 17,57 17*7 = 119 123-119=4 lo restante es el modulus 
		System.out.println(intAltura);
		
		int puntuacion = 12;
		int total = 325 + (puntuacion * 22);
		System.out.println(total);
		
		int x = 3;
		int valorx = x++ * 10; //como sufijo primero la operación y luego el incremento sobre la variable x
		System.out.println(valorx + "x:" + x);
	
		int y = 3;
		int valory = ++y * 10; //como prefijo primero el incremento de la variable y y luego la operación
		System.out.println(valory + "y:" + y);
		
		int z = 21;
		int k = z * 3 + 5;
		System.out.println(k);
		
		int n = 21;
		int o = n * (3 + 5);
		System.out.println(o);
		
		
		//primero se ejecuta incrementos y decrementos
		//orden de operadores * / % + -
		
		int l = 7;
		int m = l++ * 6 + 4 *10 / 2;
		System.out.println(l);
		System.out.println(m);

	}

}
