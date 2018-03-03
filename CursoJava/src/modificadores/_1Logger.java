package modificadores;

class _1Logger {

	// Solo es accesible desde la clase
	private String formato;

	public String getFormat() {
		return this.formato;
	}

	// Método para modificar el valor de la variable desde fuera.
	// De esta forma existe un mayor control en la asignación.
	public void setFormat(String formato) {
		if (formato.equals("admin") || formato.equals("OutKast")) {
			this.formato = formato;
		}
	}
}
