package Anatomia;

public class MostrarString {

	public static void main(String[] args) {
		System.out.println("Aquí se escribe nuestro texto");
		
		System.out.println("");
			
		System.out.print("Evento ");
		System.out.print("Ágil ");		
		System.out.print("se realiza ");		
		System.out.print("en octubre.");
		
		System.out.println("");
		
		System.out.println("Las mejores canciones de Maná son: \n\"Bendita tu Luz\" y \'Rayando el Sol\' "); //otros \\ \t (tab) \b (retroceso) \r (retorno de carro) \f (salto de línea) \n (nueva línea)
		
		System.out.println("");
		
		System.out.println(" \"\'Descubrir\' El verdadero viaje de descubrimiento consiste" + 
		" no en encontrar nuevas tierras, sino en verlas con nuevos ojos. \"\n\t-- Marcel Prouts, Citas");
		
		System.out.println("");
		
		int numero = 123;
		char valor = 'M';
		System.out.println("Hubo un total de " + numero + " participantes");
		System.out.println("Promedio " + valor);
		
		
		System.out.println("");
		
		String palabrasClave = "";
		palabrasClave = palabrasClave + "videotutoriales ";
		palabrasClave = palabrasClave + "flash ";
		palabrasClave = palabrasClave + "php ";
		System.out.println(palabrasClave);		
		
		System.out.println("");
		
		String palabrasClave1 = "";
		palabrasClave1 += "videotutoriales ";
		palabrasClave1 += "flash ";
		palabrasClave1 += "php ";
		System.out.println(palabrasClave1);	
		
		System.out.println("");
		
		//String como objeto porque se pueden aplicar métodos
		String respuesta = "amarillo";
		String resultado = "verde";
		System.out.println("Has respondido que el color es " + resultado + "?");
		System.out.println("Respuesta: " + respuesta.equals(resultado));

		System.out.println("");
		
		String respuesta1 = "amarillo";
		String resultado1 = "amarillo";
		System.out.println("Has respondido que el color es " + resultado1 + "?");
		System.out.println("Respuesta: " + respuesta1.equals(resultado1));
		
		System.out.println("");
		
		int tam = respuesta.length();
		System.out.println(tam);
		
		System.out.println("");
		
		String nombre = "Katty Tamayo";
		String mayusculas  = nombre.toUpperCase();
		String minusculas  = nombre.toLowerCase();		
		System.out.println(mayusculas);
		System.out.println(minusculas);
		
		System.out.println();
		
		String texto = "amarillo, azul, rojo, verde, azul, naranja, azul";
		int busca = texto.indexOf("azul");
		System.out.println(busca); //lo encuentra contando desde posición 0
		
		System.out.println();
		
		String texto1 = "amarillo, azul, rojo, verde, azul, naranja, azul";
		int busca1 = texto1.indexOf("rosado");
		System.out.println(busca1); //no lo encuentra -1
		
		

	}

}
