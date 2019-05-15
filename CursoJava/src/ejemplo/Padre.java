package ejemplo;

public class Padre {

	private String colorOjos;
	protected String tipoSangre;
	
	public Padre() {
		this("azules");
	}
	public Padre(String colorOjos) {
		this.colorOjos = colorOjos;
	}
}
