package cadena.ejemplo;

public class _9MetodoIndexOf {

	public static void main(String[] args) {
		String texto = "Seguíale Sancho a todo trote de su jumento; pero caminaba tanto Rocinante, que, viéndose quedar atrás, le fue forzoso dar voces a su amo, que se aguard....";
		int busca = texto.indexOf("Sancho");
		System.out.println(busca);
		int busca1 = texto.indexOf("Sanchez");
		System.out.println(busca1);
	}
}
