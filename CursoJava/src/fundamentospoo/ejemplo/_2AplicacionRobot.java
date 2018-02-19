package fundamentospoo.ejemplo;

public class _2AplicacionRobot {

	//Clase ejecutada como una aplicación mediante el uso de main
	public static void main(String[] args) {
		//static indica que es un método de clase, por lo tanto es compartido por todos los objetos dentro de esta aplicación (AplicacionRobot) 
		
		_1RobotDante dante = new _1RobotDante(); //instanciar un objeto a travpes de la "plantilla" clase _1RobotDante
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
