package chapter3.equality;

public class _7EqualsPerro {

	private int patas;

	public _7EqualsPerro(int patas) {
		this.patas = patas;
	}

	@Override
	public boolean equals(Object obj) {
		_7EqualsPerro perroAComparar = (_7EqualsPerro)obj;
		return this.patas == perroAComparar.patas;
	}
	
	public static void main(String[] args) {
		_7EqualsPerro mia = new _7EqualsPerro(4);
		_7EqualsPerro negro = new _7EqualsPerro(4); 
		System.out.println(mia.equals(negro)); //true porque el método equals es sobreescrito y su definición compara el número de patas
		
		_7EqualsPerro abril = new _7EqualsPerro(3);
		System.out.println(mia.equals(abril)); //false porque el método equals es sobreescrito y su definición compara el número de patas
	}
}