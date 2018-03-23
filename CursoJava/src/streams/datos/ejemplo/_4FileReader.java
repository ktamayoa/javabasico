package streams.datos.ejemplo;

import java.io.FileReader;
import java.io.IOException;

public class _4FileReader {

	public static void main(String[] args) {

		try {
			FileReader texto = new FileReader("E:\\personal\\conocimiento\\java\\javabasico\\CursoJava\\src\\archivos\\alfabeto.txt"); // Lee los datos del archivo

			int inByte;

			do {
				inByte = texto.read();
				if (inByte != -1)
					System.out.println((char) inByte);

			} while (inByte != -1);

			System.out.println("");
			texto.close();
			
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}
}
