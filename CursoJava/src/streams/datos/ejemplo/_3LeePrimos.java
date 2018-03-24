package streams.datos.ejemplo;

import java.io.*;

public class _3LeePrimos {

	public static void main(String[] args){
		try{
			
			FileInputStream archivo = new FileInputStream("E:\\personal\\conocimiento\\java\\javabasico\\CursoJava\\src\\archivos\\250primos.dat"); //Lee los datos del archivo
			BufferedInputStream buff = new BufferedInputStream(archivo); //
			DataInputStream datos = new DataInputStream(buff);
			
			try{
				while(true){
					int in = datos.readInt(); //Lea los datos enteros
					System.out.println(in + " ");
				}
			}catch(EOFException eof){ //No existe el -1 para determinar que terminó como ocurría con byte se usa la excepción por ser datos integer
				buff.close();
			}
		}catch(IOException e){
			System.out.println("Error -- " + e.toString());
		}
	}
	
}
