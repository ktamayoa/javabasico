package pruebasconcepto;

import java.text.Normalizer;

public class CaracteresEspeciales {

	private static final String ORIGINAL = "ÁáÉéÍíÓóÚúÑñÜü";
	private static final String REPLACEMENT = "AaEeIiOoUuNnUu";
	
	
	public static String normalizarTexto(String cadena){
	
		// Elimina espacios, tabuladores, retornos
		cadena = cadena.replaceAll("\\s","");
				
		String cadenaNormalize = Normalizer.normalize(cadena, Normalizer.Form.NFD);   
		String cadenaSinAcentos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
		return cadenaSinAcentos;
	}
	
	
	public static String normalizarTexto2(String cadena){
		
		// Elimina espacios, tabuladores, retornos
		cadena = cadena.replaceAll("\\s","");
		
	    char[] array = cadena.toCharArray();
	    for (int index = 0; index < array.length; index++) {
	        int pos = ORIGINAL.indexOf(array[index]);
	        if (pos > -1) {
	            array[index] = REPLACEMENT.charAt(pos);
	        }
	    }
	    
	    return new String(array);
	}
	
	public static void main(String[] args) {
		
		String original = "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏ ÐÑÒÓÔÕÖØÙÚÛÜ Ýßàáâãäåæçèé êëìíîïðñòóôõöøùúûüýÿ";
		System.out.println("Resultado1: " + normalizarTexto(original));
		
		original = "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýÿ";
		System.out.println("Resultado2: " + normalizarTexto2(original));
		
		
		original = "La cigüeña tocaba el saxofón detrás del Ñandú de áéíóú.";
		System.out.println("Resultado3: " + normalizarTexto(original));
		
		original = "La cigüeña tocaba el saxofón detrás del Ñandú de áéíóú.";
		System.out.println("Resultado4: " + normalizarTexto2(original));
	
	}

}
