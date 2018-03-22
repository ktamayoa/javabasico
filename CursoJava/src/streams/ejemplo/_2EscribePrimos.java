package streams.ejemplo;

import java.io.*;

public class _2EscribePrimos {
	
	public static void main (String[] args){
		int [] primos = new int[250];
		int numPrimos = 0;
		
		//candidato: el número que puede ser primo
		int candidato = 2;
		
		while (numPrimos < 250){
			if(esPrimo(candidato)){
				primos[numPrimos] = candidato;
				numPrimos++;
			}
			candidato++;
		}
		
		try{
			//Escribir salida a disco
			FileOutputStream archivo = new FileOutputStream("E:\\personal\\conocimiento\\java\\javabasico\\CursoJava\\src\\archivos\\250primos.dat"); //Asociar a un archivo
			BufferedOutputStream buff = new BufferedOutputStream(archivo); //Guarda el archivo en un buffer
			DataOutputStream datos = new DataOutputStream(buff); //Dentro de datos tenemos un stream que nos permitirá utilizar los tipos de datos de java
			
			for(int i=0; i< 250; i++)
				datos.writeInt(primos[i]);  //Salida basada en datos tipo integer
			datos.close();
		}catch(IOException e){
			System.out.println("Error -- " + e.toString());
		}
	}

	public static boolean esPrimo(int comprobarNumero){
		double raiz = Math.sqrt(comprobarNumero);
		
		for(int i=2; i <= raiz; i++){
			if (comprobarNumero % i == 0)
				return false;
		}
		return true;
	}
}
