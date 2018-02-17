package cadena.ejemplo;

public class ConcatenacionSimplificada {

	public static void main(String[] args) {
		
		String palabrasClave = "";
		palabrasClave = palabrasClave + "videotutoriales ";
		palabrasClave = palabrasClave + "flash ";
		palabrasClave = palabrasClave + "php ";
		System.out.println(palabrasClave);
		
		//Concatenacion simplificada mediante el uso del operador +=
		palabrasClave = "";
		palabrasClave += "videotutoriales ";
		palabrasClave += "flash ";
		palabrasClave += "php ";
		System.out.println(palabrasClave);
	}
}
