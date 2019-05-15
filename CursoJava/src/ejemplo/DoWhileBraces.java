package ejemplo;

class DoWhileBraces {

	public static void main(String[] args) {
		do
			System.out.println("helium");
		while (false);

		boolean balloonInflated = false;
		do {
			if (!balloonInflated) {
				balloonInflated = true;
				System.out.print("inflate-");
			}
		} while (! balloonInflated);
		System.out.println("done");

	}

}
