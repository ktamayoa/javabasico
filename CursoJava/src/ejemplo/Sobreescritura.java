package ejemplo;

public class Sobreescritura {

}

class BubbleException extends Exception {
}

class Fish {
	Fish getFish() throws BubbleException {
		throw new RuntimeException("fish!");
	}
}

final class Clownfish extends Fish {
	public final Clownfish getFish() {
		throw new RuntimeException("clown!");
	}

	public static void main(String[] bubbles) {
		final Fish f = new Clownfish();
		//f.getFish();
		System.out.println("swim!");
	}
}