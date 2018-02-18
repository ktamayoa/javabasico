package loop.ejemplo;

import java.util.*; //Calendar;

public class _11MedidorVelocidad {

	public static void main(String[] args) {
		// Obtener fecha y hora actual
		Calendar start = Calendar.getInstance(); // crea un objeto de la clase Calendar, con el tiempo actal
		start.roll(Calendar.MINUTE, true); // Mover el tiempo hacia adelante 1 minuto
		int nextMinute = start.get(Calendar.MINUTE);
		int nextSecond = start.get(Calendar.SECOND);

		int index = 0;

		while (true) { // loop infinito
			Math.sqrt(index);
			GregorianCalendar now = new GregorianCalendar();
			if (now.get(Calendar.MINUTE) >= nextMinute) {
				if (now.get(Calendar.SECOND) >= nextSecond) {
					break;
				}

			}
			index++;
		}
		System.out.println(index + " loops en un minuto");
	}
}
