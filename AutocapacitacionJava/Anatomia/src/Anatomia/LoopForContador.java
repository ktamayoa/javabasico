package Anatomia;

public class LoopForContador {

	public static void main(String[] args) {
		
		for (int contador = 1; contador <= 10; contador ++) //inicializaci�n (se ejecuta la primera vez q inicia el for); expresi�n; actualizaci�n
		{
			System.out.println(contador);
			System.out.println("El valor del contador es: " + contador);
			System.out.println(contador);
		}
		
		System.out.println("Terminado!!!");
		

	}

}
