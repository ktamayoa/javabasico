package fundamentospoo.ejemplo;

//La clase es un ente abstracto que se materializa a través de los objetos
public class _1RobotDante {
	
	// Atributos de la clase 3 variables de instancia??? minuto 34
	String estatus;
	int velocidad;
	float temperatura;

	// Método instancia dentro de la clase ???? minuto 13 -- 2 métodos de instancia minuto 34
	void comprobarTemperatura() {
		if (temperatura > 660) {
			estatus = "Volviendo a casa";
			velocidad = 5;
		}
	}
	
	
	void mostrarAtributos(){
		System.out.println("Estatus: " + estatus);
		System.out.println("Velocidad: " + velocidad);
		System.out.println("Temperatura: " + temperatura);
	}

}
