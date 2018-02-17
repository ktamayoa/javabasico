package Anatomia;

import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;


public class LoopDoWhile {

	public static void main(String[] args) {
		File archivo = new File("c:\\miArchivo.txt");
		Scanner miScanner = new Scanner(System.in);
		char replica;
		
		do
		{
			out.print("Borrar archivo? (s/n) ");
			replica = miScanner.findWithinHorizon(".",0).charAt(0);
		} while (replica != 's' && replica != 'n' && replica != 'S' && replica != 'N'); //si es verdad vuelve al bucle
		
		if (replica == 's' || replica == 'S')
		{
			out.println("");
			out.println("Borrando Archivo");
			archivo.delete();
		}
		else
			out.println("Confirmado no borrar");
			

	}

}
