package Anatomia;

public class Condicionales {

	public static void main(String[] args) {
		int puntuacion = 4;
		
		if (puntuacion > 5)
			System.out.println("Aprobado!!!");
		else
			System.out.println("Suspendido!!!");
		
		System.out.println("");
		
		int puntuacion3 = 4;
		String mensaje;
		
		mensaje = (puntuacion3 >7) ? "Aprobado." + " Tu nota final es: " +  puntuacion3 : "Suspendido." + " Tu nota final es: " +  puntuacion3;
		
		System.out.println(mensaje);
		
		
		System.out.println("");

		String genero = "hombre";
		
		System.out.println(genero.equals("mujer") ? "Sr." : "Sra.");
		
				
		System.out.println("");
		
		
		
		int puntuacion1 = 1;
		
		if (puntuacion1 == 4)
			System.out.println("Comparación!!!");
		else if (puntuacion1 != 4)
			System.out.println("No igual!!!");

		
		System.out.println("");
		
		
		int puntuacion2 = 4;
		char grupo = 'C';
		
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
		
		
		char grupo1 = 'Z';
		
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
		
		
		System.out.println("");
		

		char grupo2 = 'C';
		
		switch(grupo2)
		{
		case 'A':
			System.out.println("Tienes una A. Gran Trabajo!!!");
			break;
		case 'B':
			System.out.println("Tienes una B. Buen Trabajo!!!");
			break;
		case 'C':
			System.out.println("Tienes una C. Hay que trabajar más!!!");
			break;
		default: //No necesariamente debe esta presente
			System.out.println("Tienes una D. Necesitas un gran cambio!!!");
			break;
			
		}
		
		

	}

}
