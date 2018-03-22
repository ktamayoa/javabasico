package streams.ejemplo;

import java.io.FileWriter;
import java.io.IOException;

public class _6FileWriter {

	public static void main(String[] args) {

		try {

			FileWriter letras = new FileWriter("E:\\personal\\conocimiento\\java\\javabasico\\CursoJava\\src\\archivos\\alfabeto.txt"); //Archivo donde se va a escribir la información

			for (int i = 65; i < 91; i++) // Valores integer de las letras del abecedario
				letras.write((char) i);   // Convertir a char
			letras.close();

		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}

	}

}
