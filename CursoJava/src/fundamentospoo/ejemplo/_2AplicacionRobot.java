package fundamentospoo.ejemplo;

public class _2AplicacionRobot {

	//Clase ejecutada como una aplicación mediante el uso de main
	public static void main(String[] args) {
		//static indica que es un método de clase, por lo tanto es compartido por todos los objetos dentro de esta aplicación (AplicacionRobot) 
		
		_1Robot dante = new _1Robot(); //instanciar un objeto a través de la "plantilla" clase _1Robot
		dante.estatus = "explorando";
		dante.velocidad = 2;
		dante.temperatura = 510;
		dante.mostrarAtributos();
		
		System.out.println("Incremento velocidad a 3.");
		dante.velocidad = 3;
		dante.mostrarAtributos();

		System.out.println("Cambiando temperatura a 670.");
		dante.temperatura = 670;
		dante.mostrarAtributos();
		
		System.out.println("Comprobando la temperatura.");
		dante.comprobarTemperatura();
		dante.mostrarAtributos();
		
	}
}
