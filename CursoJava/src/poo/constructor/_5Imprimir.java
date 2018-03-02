package poo.constructor;

class _5Imprimir {
	int x = 0;
	int y = 1;

	void imprimeme() {
		System.out.println("x es " + x + ", y es " + y);
		System.out.println("Soy una instancia de la clase " 
				+ this.getClass().getName());
	}
}

class _5SubImprimir extends _5Imprimir {
	int z = 3;
	
	void imprimeme() {
		System.out.println("x es " + x + ", y es " + y + ", z es " + z);
		System.out.println("Soy una instancia de la clase " 
				+ this.getClass().getName());
	}
	
	public static void main(String[] args) {
		_5SubImprimir obj = new _5SubImprimir();
		obj.imprimeme();
	}
}