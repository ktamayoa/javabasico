package streams.inputoutput.ejemplo;

//Paquete donde están las clases para crear flujos de entrada y salida
import java.io.*;

public class _1LectorByte {

	public static void main(String[] args) {
		try{
			
			//FileInputStream archivo = new FileInputStream("clase.dat"); //De este archivo se recuperará los datos, al copiarlo en el directorio E:\personal\conocimiento\java\javabasico\CursoJava
			FileInputStream archivo = new FileInputStream("E:\\personal\\conocimiento\\java\\javabasico\\CursoJava\\src\\archivos\\clase.dat"); //Como estoy colacando en el directorio archivos los archivos de ejemplo
			
			boolean eof = false;	//Indicará el final del archivo
			int contador = 0;		//Ir contando el número de bytes que se van leyendo desde el archivo
			
			while(!eof){
				int entrada = archivo.read(); //Ir leyendo la información del archivo, byte por byte
				System.out.print(entrada + " ");
				
				if (entrada == -1)	//Indica que ha llegado el final del archivo
					eof = true;		//Deja de cumplir la condición del while
				else 
					contador++;
			}
			
			archivo.close();
			System.out.println("\nBytes leídos: " + contador);
			
		}catch (IOException e){   //Captura de posibles excepciones lanzadas
			System.out.println("Error -- " + e.toString());
		}
		
		//En primera corrida Error -- java.io.FileNotFoundException: clase.dat (El sistema no puede encontrar el archivo especificado)
		//En el directorio de este paquete copiamos el archivo LectorByte.class y lo renombramos por clase.dat

	}

}
