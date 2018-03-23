package excepcion;

import java.net.MalformedURLException;

public class _52PaginaCatalogo {

	public static void main(String[] args) {
		_51PaginaInicial[] catalogo = new _51PaginaInicial[5];
		try {
			catalogo[0] = new _51PaginaInicial("Alfredo Belcacer", "http://www.ultimasnovedades.com", "actualidad");
			catalogo[1] = new _51PaginaInicial("Roberta Savino", "http://www.losmaspopulares.com", "musica");
			catalogo[2] = new _51PaginaInicial("Camilo Arrouca", "http://rubyonrailes.net", "programacion");
			catalogo[3] = new _51PaginaInicial("Julia Cabrera", "http://www.escolantes.com", "educacion");
			catalogo[4] = new _51PaginaInicial("Jaime Lendón", "://www.awt.org");
//			catalogo[4] = new _51PaginaInicial("Jaime Lendón", "http://www.awt.org");
			
			for (int i = 0; i < catalogo.length; i++) {
				System.out.println(catalogo[i].propietario + ": " + catalogo[i].direccion + " - " + catalogo[i].categoria);
			}
		} catch (MalformedURLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
