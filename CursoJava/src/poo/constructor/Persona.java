package poo.constructor;

public class Persona {

	int numeroSentidos;
	
	
	public Persona(int numeroSentidos) {
		if(numeroSentidos == 5) {
			this.numeroSentidos = numeroSentidos;
		} else {
			System.out.println("No es una persona normal");
		}
	}
}
