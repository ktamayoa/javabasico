package array.ejemplo;

public class _3ContadorLetras {

	public static void main(String[] args) {
		String frase[] = {
			"TODA CUESTIÓN TIENE DOS PUNTOS DE VISTA",
			"EL EQUIVOCADO Y EL NEUTRO",
			"TODAS LAS MUJERES TIENEN ALGO HERMOSO",
			"AUNQUE SEA UNA PRIMA LEJANA",
			"SE ESTÁ MURIENDO GENTE QUE ANTES NO SE MORÍA",
			"HE OIDO HABLAR TAN BIEN DE TI",
			"QUE CREÍA QUE ESTABAS MUERTO",
			"RECUERDA SIEMPRE QUE ERES ÚNICO",
			"EXACTAMENTE IGUAL QUE TODOS LOS DEMÁS",
			"TODO TIEMPO PASADO FUE ANTERIOR.",
			"LOS HONESTOS SON INADAPTADOS SOCIALES",
			"LA VERDAD ABSOLUTA NO EXISTE",
			"Y ESTO ES ABSOLUTAMENTE CIERTO",
			"LO TRISTE NO ES IR AL CEMENTERIO, SINO QUEDARSE",
			"EL AMOR ETERNO DURA APROXIMADAMENTE TRES MESES"
		};
		int[] contadorLetras = new int[26];
		for (int contador = 0; contador < frase.length; contador++) {
			String current = frase[contador];
			char[] letras = current.toCharArray();
			for (int contador2 = 0; contador2 < letras.length; contador2++) {
				char letra = letras[contador2];
				if ((letra >= 'A') & (letra <= 'Z')) {
					contadorLetras[letra - 'A']++;
				}
			}
		}
		for (int contador3 = 'A'; contador3 <= 'Z'; contador3++) {
			System.out.print((char)contador3 + ": " + contadorLetras[contador3 - 'A'] + " ");
		}
	}
}
