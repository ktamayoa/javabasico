package streams.inputoutput.ejemplo;
import java.io.*;


//Escribir una serie de bytes a un stream output asociado a un archivo de texto y después leer esos bytes
public class _3EjemploBuffer {

	public static void main(String[] args) {
		//Valores a tomar como argumentos
		int inicio = 0;
		int fin = 255; //probar con 256
		
		if(args.length > 1){
			inicio = Integer.parseInt(args[0]);
			fin = Integer.parseInt(args[1]);
		}else if (args.length > 0)
			inicio = Integer.parseInt(args[0]);
		
		ArgStream as = new ArgStream(inicio, fin);
		System.out.println("\nEscribiendo: ");
		boolean exito = as.escribirStream();
		System.out.println("\nLeyendo: ");
		boolean exitoLectura = as.leerStream();
	}
}


class ArgStream{
	int inicio;
	int fin;
	
	//Asignación de valores de inicio y fin
	ArgStream(int st, int f){
		inicio = st;
		fin = f;
	}
	
	
	//Los 2 métodos escribirStream y leerStream explican la creación de filtros
	
	//Escribir en un archivo los enteros que se indiquen en el rango de inicio y fin
	boolean escribirStream(){
		try{
			
			//Pasos para crear stream filtrado
			//1. Crear stream de salida, pasando archivo fuente 51:23 ???
			FileOutputStream archivo = new FileOutputStream("numeros.dat");
			
			//2. Filtrar el stream archivo, con BufferedOutputStream de salida, pasando el stream a filtrar que es el archivo
			BufferedOutputStream buff = new BufferedOutputStream(archivo);
			//En buff está el stream filtrado
			
			for (int salida = inicio; salida <= fin; salida++){
				//3. Usar métodos write(int), de salida
				buff.write(salida);
				System.out.print(" " + salida);
			}
			
			//4. Usar método close(), para cerrar el stream buffered
			buff.close();
			return true; //Retorno para determinar si la operación terminó exitosamente

			//Lanzan objetos IOException cuando ocurre algún error	
		}catch(IOException e){
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
	}
	
	
	//Leer del archivo ese mismo rango
	boolean leerStream(){
		try{
			//1. Crear stream de entrada, pasando archivo destino
			FileInputStream archivo = new FileInputStream("numeros.dat");
			
			//2. Filtrar el stream archivo, con BufferedInputStream de entrada, pasando el stream a filtrar que es el archivo
			BufferedInputStream buff = new BufferedInputStream(archivo);
			//En buff está el stream filtrado
			
			int in = 0;
			
			do{
				//3. Usar métodos read(), de entrada
				in = buff.read();
				if (in != -1)
					System.out.print(" " + in);
			}while (in != -1);
			
			//4. Usar método close(), para cerrar el stream buffered
			buff.close();
			return true;  //Retorno para determinar si la operación terminó exitosamente 
			
			//Lanzan objetos IOException cuando ocurre algún error
		}catch(IOException e){
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
	}

}
