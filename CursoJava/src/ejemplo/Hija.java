package ejemplo;

public class Hija extends Padre {

	
//	public Hija(){
//		super("");
//	}
	
	
	public Hija(String c) {
		// llama implícitamente al constructor padre que no tiene argumentos -> super();
		super(c);
	}
}
