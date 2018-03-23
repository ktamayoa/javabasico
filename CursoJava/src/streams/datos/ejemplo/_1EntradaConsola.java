package streams.datos.ejemplo;

import java.io.*;

public class _1EntradaConsola {

	public static String leerLinea(){
		//Variable stringbuffer es un String que puede ser modificado
		//Es una secuencia de caracteres mutable es decir que tamaño y contenido puede cambiar a diferencia de los Strings
		//Se va recibiendo caracter por caracter
		StringBuffer respuesta = new StringBuffer();
		
		try{
			//Va a servir para recibir las entradas de teclado
			//Lo que recibe el BufferedInputStream se convierte en una entrada de consola con System.in
			BufferedInputStream buff = new BufferedInputStream(System.in);
			
			int in = 0;
			//Se va a ir recibiendo la información por teclado un byte y lo convertirá en un char
			char inChar;
			
			//Loop para ir recogiendo la información
			do{
				in = buff.read(); 	//método read de BufferedInputStream para leer las teclas que se vayan pulsando
				inChar = (char) in; //cast de ese integer en un char, de la letra que se haya pulsado
				
				//Analizar si el char debe ser añadido o no, si es -1 es el final de lo que se está devolviendo o si inChar es una nueva línea o retorno de carro
				if ((in != -1) & (inChar != '\n') & (inChar != '\r')){
					respuesta.append(inChar);
				}
			}while((in != -1) & (inChar != '\n') & (inChar != '\r')); //si una de las condiciones es cierta se termina el while
			
			buff.close();
			return respuesta.toString();
		}
		catch(IOException e){//excepción de tipo genérica
			System.out.println("Excepcion: " + e.getMessage()); //mensaje de consola
			return null; //si se ha producido algún tipo de error
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("\n¿Cuál es tu nombre? ");
		String entrada = _1EntradaConsola.leerLinea();
		System.out.println("\nHola, " + entrada);
	}

}
