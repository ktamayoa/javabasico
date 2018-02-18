package condicional.ejemplo;

public class _1If {

	public static void main(String[] args) {
		
		//Ejemplo if-else
		int puntuacion = 4;

		System.out.println("Valor enviado: " + puntuacion + " Evaluación del if: " + ">5");
		
		if (puntuacion > 5)
			System.out.println("Cumple!!!");
		else
			System.out.println("No cumple!!!");
		
		System.out.println("");
		
		
		//Ejemplo if-else if
		int puntuacion1 = 1;

		System.out.println("Valor enviado: " + puntuacion1 + " Evaluación del if: " + "==4");
		
		if (puntuacion1 == 4)
			System.out.println("Igual!!!");
		else if (puntuacion1 != 4)
			System.out.println("No es igual!!!");
				
		System.out.println("");
		
		
		//Bloques de declaraciones
		int puntuacion2 = 4;
		char grupo = 'C';
		
		System.out.println("Valor enviado: " + puntuacion2 + " Evaluación del if: " + ">=5");
		
		if (puntuacion2 >= 5)
		{
			System.out.println("Aprobado!!!");
			System.out.println("Tu nota final es: " + puntuacion2);
			grupo = 'A';
		}
		else
		{
			System.out.println("Suspendido!!!");
			System.out.println("Tu nota final es: " + puntuacion2);
			grupo = 'B';
		}
		
		System.out.println("Formas parte del grupo: " + grupo);
		
		System.out.println("");
		
		
		//else if
		char grupo1 = 'Z';
		
		System.out.println("Valor enviado: " + grupo1 + " Evaluación del if: " + "==\'A\'");
		
		if (grupo1 == 'A')
		{
			System.out.println("Formas parte del grupo: " + grupo1);
		}
		else if (grupo1 == 'B')
		{
			System.out.println("Formas parte del grupo: " + grupo1);
		}
		else if (grupo1 == 'C')
		{
			System.out.println("Formas parte del grupo: " + grupo1);
		}
		else
		{
			System.out.println("Formas parte del grupo: D");
		}
		
		
				
	}
}
