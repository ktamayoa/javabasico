package streams.ejemplo;

import java.io.*;

public class _5LeerFuente {

	public static void main(String[] args) {
		try{
			FileReader archivo = new FileReader("src\\streams\\ejemplo\\_5LeerFuente.java"); //Asociar un archivo indicando la ruta
			BufferedReader buff = new BufferedReader(archivo); //Filtro buffer que se asocia con la fuente de entrada en este caso archivo
			
			boolean eof = false;
			
			while (!eof){
				String linea = buff.readLine(); //Lee línea a línea el archivo
				if (linea == null) //Cuando aparece un caracter de nueva línea \n o retorno de carro \r
					eof = true;
				else
					System.out.println(linea);
			}
			buff.close();
		}catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
	}
}
