package poo.constructor;

class _4Imprimir {
	int x = 0;
	int y = 1;

	void imprimeme() {
		System.out.println("x es " + x + ", y es " + y);
		System.out.println("Soy una instancia de la clase " 
				+ this.getClass().getName());
	}
}

class SubImprimir extends _4Imprimir {
	int z = 3;
	
	public static void main(String[] args) {
		SubImprimir obj = new SubImprimir();
		obj.imprimeme();
	}
}