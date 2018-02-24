package casting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3RaizNuevo{

	public static void main(String[] args) throws IOException {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriba un número: ");
		String str = buff.readLine();
		
		
		int numero = Integer.parseInt(str);
		System.out.println("La raíz cuadrada de " 
				+ numero 
				+ " es " 
				+ Math.sqrt(numero));
	}
}
