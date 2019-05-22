package q120.pants;

/*
 * Las respuestas correctas son: B y C
 */

//line n1
//opción A
//import q120.Shirt;

//opción B
import q120.*;

//opción C
//import static q120.Shirt.getColor;

//opción D
//nada

//opción E 
//import q120; //se debe importar una clase o usar un wildcard no todo el paquete

public class Jeans {
	
	public void matchShirt(){
		//line n2
		//opción A
		//String color = getColor(); //no definido en Jeans
		
		//opción B
		String color = Shirt.getColor(); //imprime Fit
		
		//opción C
		//String color = getColor(); //imprime Fit
		
		//opción D
		//String color = Shirt.getColor(); //no puede ser resuelto falta el import
		
		//opción E
		//String color = Shirt.getColor(); //no puede ser resuelto falta el import
		
		if (color.equals("Green")){
			System.out.print("Fit");
		}
	}
	
	public static void main(String[] args) {
		Jeans trouser = new Jeans();
		trouser.matchShirt();
	}
}
