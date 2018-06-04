package herencia.ejemplo;

public interface Animal {
	public default String getName() {
		return null;
	}
}

interface Mammal {
	public default String getName() {
		return null;
	}
}

abstract class Otter implements Mammal, Animal {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Animal.super.getName();
	}
}