package ejemplo;

public class PruebaFinally {

	public String getAddress(String street, String city) {
		try {
			return street.toString() + " : " + city.toString();
		} finally {
			System.out.print("Posted:");
		}
	}

	public static void main(String[] form) {
		String street = "1";
		String city = "2";
		System.out.print(new PruebaFinally ().getAddress(street,city));
		}
}
