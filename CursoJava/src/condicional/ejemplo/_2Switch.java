package condicional.ejemplo;

public class _2Switch {
	public static void main(String[] args) {

		char grupo2 = 'B';

		System.out.println("Valor enviado: " + grupo2);

		switch (grupo2) {
		case 'A':
			System.out.println("Tienes una A. Gran Trabajo!!!");
			break;
		case 'B':
			System.out.println("Tienes una B. Buen Trabajo!!!");
			break;
		case 'C':
			System.out.println("Tienes una C. Hay que trabajar más!!!");
			break;
		default: // No necesariamente debe estar presente
			System.out.println("Tienes una D. Necesitas un gran cambio!!!");
			break; //No es necesario colocar el break

		}
	
		System.out.println();
		
		
		String prueba  = "ZZZ";

		System.out.println("Valor enviado: " + prueba);

		switch (prueba) {
		case "ABB":
			System.out.println("ABB!!!");
			break;
		case "ABC":
			System.out.println("ABC!!!");
			break;

		}
		
		
		System.out.println();
		

		int evaluador = 3;
		
		System.out.println("Valor enviado: " + evaluador);
		
		switch (evaluador) {
		case 1:
			System.out.println("Es un 1");
			break;
		case 2:
			System.out.println("Entra a 2");
		case 3:
			System.out.println("Entra a 3");
		case 4:
			System.out.println("Entra a 4");
		case 5:
			System.out.println("Entra a 5");
			break;
		case 6:
			System.out.println("Es 6");
		default:
			System.out.println("Es default");
		}
	}
}
