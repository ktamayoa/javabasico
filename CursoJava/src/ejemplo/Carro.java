package ejemplo;

public class Carro {

	private String marca;
	
	public static void main(String[] args) {
//		Carro c = new Carro();
//		c.marca = "V";
//		
//		Carro y =  new Carro();
//		System.out.println(y.marca);
		
		PruebaStatic i1 = new PruebaStatic();
		i1.add();
		PruebaStatic i2 = new PruebaStatic();
		i2.add();
		
		System.out.println(i2.getStatica());
	}
	
	public void accesoAPrivado(Carro otraInstancia) {
		otraInstancia.marca = this.marca;
		otraInstancia.accesoAPrivado(this);
		
	}
}

class Otro {
	Carro c = new Carro();
	Carro d = new Carro();

	void metodo() {
	}
}
