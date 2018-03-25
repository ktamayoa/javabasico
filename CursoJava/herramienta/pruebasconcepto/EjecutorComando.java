package pruebasconcepto;

import java.io.*;

public class EjecutorComando {

	public void ejecutar(String comando) throws IOException {
		Runtime cmd = Runtime.getRuntime();
		Process process = cmd.exec(comando);



		// Process tiene el método public abstract InputStream getInputStream(),
		// con el que se puede obtener un Stream para poder leer lo que el comando que ejecutamos escribió en la consola
		BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line = null;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}

		// Otra forma de leer lo que se escribió en consola pendiente hasta ver streams de input
		// InputStream inputstream = process.getInputStream();
		// BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);

		process.destroy();

	}

	public static void main(String[] args) {
		EjecutorComando comando = new EjecutorComando();

		try {

			// El argumento /C indica que se ejecuta el comando especificado por
			// la cadena y luego termina
//			comando.ejecutar("cmd /C date");
			comando.ejecutar("cmd /C git --clon");

		} catch (IOException e) {
			System.out.println("error" + e.getMessage());
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
		}
	}
}
