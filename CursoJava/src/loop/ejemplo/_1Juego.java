package loop.ejemplo;

// Evita la escritura repetitiva de Sytem.out, solo se necesita escribir out.
import static java.lang.System.out;
// Clase para generar numeros aleatorios
import java.util.Random;
// Permite el ingreso de valores al usuario.
import java.util.Scanner;

public class _1Juego {

	public static void main(String[] args) {
		Scanner miScanner = new Scanner(System.in);
		int numIntentos = 0;
		// en numAletaorio se almacena un objeto de la clase random + 1 porque empieza en 0
		int numAleatorio = new Random().nextInt(10) + 1;
		out.println("***************************************************");
		out.println("*** Bienvenido al juego \"¡¡Acierta el número!!\" ***");
		out.println("***************************************************");
		out.print("Escribe un número del 1 al 10: ");
		// Capturar lo que escribió el usuario
		int numeroEscrito = miScanner.nextInt();
		numIntentos++;
		out.println("Intento # " + numIntentos);
		while (numeroEscrito != numAleatorio) {
			out.println();
			out.println("Inténtalo de nuevo... ");
			out.print("Escribe un número del 1 al 10: ");
			numeroEscrito = miScanner.nextInt();
			numIntentos++;
			out.println("Intento # " + numIntentos);
		}
		out.print("Has ganado después de ");
		out.println(numIntentos + " intentos.");
		miScanner.close();
	}
}
