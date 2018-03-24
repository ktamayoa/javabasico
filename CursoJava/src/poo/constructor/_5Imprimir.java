package poo.constructor;

class _5Imprimir {
	int x = 2;
	int y = 3;

	void imprimeme() {
		System.out.println("x es " + x + ", y es " + y);
		System.out.println("Soy una instancia de la clase " 
				+ this.getClass().getName());
	}
}

class _5SubImprimir extends _5Imprimir {
	int z = 4;
	
	void imprimeme() {
		System.out.println("x es " + x + ", y es " + y + ", z es " + z);
		System.out.println("Soy una instancia de la clase " 
				+ this.getClass().getName());
	
		super.imprimeme();
	}
	
	public static void main(String[] args) {
		_5SubImprimir obj = new _5SubImprimir();
		//Va primero por su método sobreescrito???
		obj.imprimeme();
		
	}
}