package excepcion;

import java.net.MalformedURLException;
import java.net.URL;

public class _51PaginaInicial {

	String propietario;
	URL direccion;
	String categoria = "ninguna";

	public _51PaginaInicial(String enPropietario, String enDireccion) throws MalformedURLException {
		propietario = enPropietario;
		direccion = new URL(enDireccion);
	}

	public _51PaginaInicial(String enPropietario, String enDireccion, String enCategoria) throws MalformedURLException {
		this(enPropietario, enDireccion);
		categoria = enCategoria;
	}
}
