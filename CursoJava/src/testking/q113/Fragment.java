package q113;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fragment {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		// Los objetos LocalDateTime son inmutables
		dt.plusDays(30); // Agrega 30 días a la fecha dt y devuelve una copia de la nueva fecha
		dt.plusMonths(1); // Agrega 1 mes a la fecha dt y devuelve una copia de la nueva fecha
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE)); // Imprime la fecha original en formato yyyy-MM-dd -> 2014-07-31 (Respuesta: C)
		
	}
	
}
