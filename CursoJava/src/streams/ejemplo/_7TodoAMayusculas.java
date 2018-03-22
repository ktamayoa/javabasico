package streams.ejemplo;

import java.io.*;

public class _7TodoAMayusculas {

	public static void main(String[] args) {
		TodoMayusculas may = new TodoMayusculas(args[0]); //Se pasa como argumento el nombre del archivo a utilizar, desde confuguración de argumentos
		may.convertir();

	}
}


class TodoMayusculas{
	String nombreFuente;
	
	//Constructor que asignará el valor del argumento a la variable de la clase, cuando se cree una instancia de la clase
	TodoMayusculas(String fuenteArg){
		nombreFuente = fuenteArg;
	}
	
	void convertir(){
		try{
			
			//Lectura y escritura 
			
			//Crear objetos file
			File fuente = new File(nombreFuente);
			//Archivo donde se guardará la conversión temporalmente
			File temp = new File(nombreFuente + ".tmp");
			
			//Crear stream de entrada, de lectura, encargado de leer el contenido del archivo y almacenarlo en un buffer
			FileReader fr = new FileReader(fuente);
			BufferedReader in = new BufferedReader(fr); 
			
			//Crear stream de salida output
			FileWriter fw = new FileWriter(temp); //Para escribir en el archivo tmp, con el resultado de la conversion en mayúsculas 
			BufferedWriter out = new BufferedWriter(fw); //Almacenarlo en un buffer
			
			
			boolean eof = false; //Para determinar fin de archivo
			int inChar = 0;		 //Donde se van incluyendo los valores que se van leyendo del archivo fuente
			
			do{
				inChar = in.read(); //Método read a variable in que lee contenido de archivo fuente caracter por caracter
				if (inChar != -1){ //Si in.read() nos devuelve -1 significa que llegó al final del stream
					char outChar = Character.toUpperCase((char)inChar); //Convertir el integer leido a un caracter y aplicarle el método toUpperCase, se tiene el caracter en mayúscula
					out.write(outChar); //Se va escribiendo en el buffer cada caracter transformado a mayúscula
				}else
					eof = true; //Final del stream devuelve -1, detiene el loop
			}while (!eof);
				
			//Aplicar close a los streams de entrada y de salida
			in.close();
			out.close();
			
			
			//Archivo fuente para leer EjemploConversion.txt
			//Archivo temp para escribir con la conversión EjemploConversion.txt.tmp

			//Pasar de temp a fuente
			boolean borrado = fuente.delete();
			
			if (borrado)
				temp.renameTo(fuente);
			
		}catch(IOException e){
			System.out.println("Error -- " + e.toString());
		} catch (SecurityException se){
			System.out.println("Error -- " + se.toString());
		}
		
	}
}