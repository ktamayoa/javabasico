package fundamentospoo.ejemplo;

//La clase es un ente abstracto que se materializa a través de los objetos
public class _1Robot {
	
	// Atributos de la clase
	String estatus;
	int velocidad;
	float temperatura;

	// Método dentro de la clase
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
