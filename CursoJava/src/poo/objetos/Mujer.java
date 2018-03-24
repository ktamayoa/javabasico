package poo.objetos;

public class Mujer {

	public static void main(String[] args) {
		Persona chris = new Persona(35, "Chris", 'M');
		Persona katty = new Persona(41, "Katty", 'F');
		
		System.out.println(chris.nombre);
		System.out.println(katty.nombre);
		System.out.println(Persona.numeroSentidos);
		System.out.println(chris.numeroSentidos);
		System.out.println(katty.numeroSentidos);
		
		System.out.println("\nCambia número de sentidos y edad");
		
		katty.numeroSentidos = 6;
		katty.edad = 19;
		System.out.println(Persona.numeroSentidos);
		System.out.println(chris.numeroSentidos);
		System.out.println(katty.numeroSentidos);
		System.out.println(katty.edad);
		System.out.println(chris.edad); //Cambió la variable de clase y las instancias de esa clase ???

	}

}
