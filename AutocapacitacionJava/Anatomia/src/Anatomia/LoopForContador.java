package Anatomia;

public class LoopForContador {

	public static void main(String[] args) {
		
		for (int contador = 1; contador <= 10; contador ++) //inicialización (se ejecuta la primera vez q inicia el for); expresión; actualización
		{
			System.out.println(contador);
			System.out.println("El valor del contador es: " + contador);
			System.out.println(contador);
		}
		
		System.out.println("Terminado!!!");
		

	}

}
