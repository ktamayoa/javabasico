package cadena.ejemplo;

public class MetodoEquals {

	public static void main(String[] args) {
		String respuesta = "amarillo";
		String resultadoFalso = "verde";
		String resultadoVerdadero = "amarillo";
		System.out.print("¿ Has respondido que el color es " + resultadoFalso + "?\t\t");
		System.out.println("Respuesta:" + respuesta.equals(resultadoFalso));
		
		System.out.print("¿ Has respondido que el color es " + resultadoVerdadero + "?\t");
		System.out.println("Respuesta:" + respuesta.equals(resultadoVerdadero));
	}
}
