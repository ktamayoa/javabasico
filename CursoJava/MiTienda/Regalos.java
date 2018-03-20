import java.util.*; //importar todas las clases del paquete, métodos y atributos
import com.paratienda.*;
import com.paratienda.taller.*;

public class Regalos {

	//para convertirlo en aplicación
	public static void main(String[] args){
		
		//instanciar un objeto de la clase escapareate, al que se accede por el paquete
		Escaparate almacen = new Escaparate();
		
		//Añadir artículos mediante la variable catalogo
		almacen.addArticulo("C01", "ZAPATILLAS", "9.99", "150");
		almacen.addArticulo("C02", "BOLSA DEPORTIVA", "12.99", "82");
		almacen.addArticulo("C03", "SUDADERA", "10.49", "800");
		almacen.addArticulo("D01", "CAMISETA", "16.99", "90");
	
		//Llamar al método sort para ordernar todos los árticulos
		almacen.sort();
		
		//Loop for para acceder a todos los elementos de la lista
		//Método getSize para conocer el número de artículos de la lista
		for(int i=0; i< almacen.getSize(); i++){
			Articulos mostrar = (Articulos) almacen.getArticulo(i);
			
			System.out.println("\nArtículo ID: " + mostrar.getId() +
					" \nNombre: " + mostrar.getNombre() +
					" \nPrecio Detalle: " + mostrar.getDetalle() + " $" +
					" \nPrecio: " + mostrar.getPrecio() + " $" +
					" \nCantidad: " + mostrar.getCantidad());
		}
	}
}
