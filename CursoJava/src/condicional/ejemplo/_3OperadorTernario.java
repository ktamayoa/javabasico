package condicional.ejemplo;

public class _3OperadorTernario {

	public static void main(String[] args) {
		//Operador ternario
		int nota = 4;
		String mensaje;
		mensaje = (nota >7) ? "Aprobado." + " Tu nota final es: " +  nota : "Suspendido." + " Tu nota final es: " +  nota;
		
		System.out.println("Valor enviado: " + nota + " Evaluación del operador ternario: " + ">7");
		System.out.println(mensaje);
		
		System.out.println("");
				
		String genero = "hoooombre";
		System.out.println("Valor enviado: " + genero + " Evaluación del operador ternario: " + "equals mujer");
		System.out.println(genero.equals("mujer") ? "Sra." : "Sr.");
		
		System.out.println("");

	}

}
