package Anatomia;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner; //REcuperar los números que va escribiendo el usuario

public class LoopWhileJuego {

	public static void main(String[] args) {
		Scanner miScanner = new Scanner(System.in);
		int numIntentos = 0;
		int numAleatorio = new Random().nextInt(10) + 1; //en numAletaorio almacenamos un objeto de la clase random +1 porque empieza en 0
		out.println(" ");
		out.println("Bienvenido al juego \" Acierta el número!!\'");
		out.println(" ");
		out.print("Escribe un número del 1 al 10: ");
		int numeroEscrito = miScanner.nextInt();
		numIntentos++;
		out.println("Intento # " + numIntentos);
		
		while (numeroEscrito != numAleatorio)
		{
			out.println(" ");
			out.println("Inténtalo de nuevo... ");
			out.print("Escribe un número del 1 al 10: ");
			numeroEscrito = miScanner.nextInt(); //Capturar lo que escribió el usuario
			numIntentos++;
			out.println("Intento # " + numIntentos);
		}
		
		out.print("Has ganado después de ");
		out.println( numIntentos + " intentos.");
		
			
	}

}
