package poo.objetos;

public class Persona {

	static int numeroSentidos = 5;
	int edad;
	String nombre;
	char genero;

	public Persona() {
	}

	public Persona(int edad, String nombre, char genero) {
		this.edad = edad;
		this.nombre = nombre;
		this.genero = genero;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Persona chris = new Persona(35, "Chris", 'M');
		Persona katty = new Persona(41, "Katty", 'F');
		
		System.out.println(chris.nombre);
		System.out.println(katty.nombre);
		System.out.println(Persona.numeroSentidos);
		System.out.println(chris.numeroSentidos);
		System.out.println(katty.numeroSentidos);
		
		katty.numeroSentidos = 6;
		katty.edad = 19;
		System.out.println(Persona.numeroSentidos);
		System.out.println(chris.numeroSentidos);
		System.out.println(katty.numeroSentidos);
		System.out.println(katty.edad);
		System.out.println(chris.edad);
	}
}
