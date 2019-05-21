package q079;

public class _079 {

	public static void main(String[] args) {
		Caller c = new Caller();
		//c.start();  // No se puede acceder porque es privado en la clase Caller
		//c.init();   // No se puede acceder porque es privado en la clase Caller
	}
}


class Caller{
	  private void init(){
		  System.out.println("Initialized");
	  }
	  
	  private void start(){
		  System.out.println("Started");
	  }	
}