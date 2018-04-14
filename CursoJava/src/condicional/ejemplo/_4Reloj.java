package condicional.ejemplo;

import java.util.*; //Calendar;

public class _4Reloj {
	public static void main(String[] args) {
		_4Reloj reloj = new _4Reloj();
		System.out.println(reloj.getTiempo());
	}

	public String getTiempo() {
		StringBuffer tiempo = new StringBuffer();
		// Obtener fecha y hora actual
		Calendar ahora = Calendar.getInstance(); // ahora, objeto de la clase Calendar

		int hora = ahora.get(Calendar.HOUR_OF_DAY);
		int minuto = ahora.get(Calendar.MINUTE);
		int mes = ahora.get(Calendar.MONTH) + 1; // POR QUÉ? porque Enero empieza con 0
		int dia = ahora.get(Calendar.DAY_OF_MONTH);
		int an = ahora.get(Calendar.YEAR);

		// Mostrar saludo
		if (hora < 12)
			tiempo.append("Buenos días. \n");
		else if (hora < 17)
			tiempo.append("Buenas tardes. \n");
		else
			tiempo.append("Buenas noches. \n");

		// Iniciar el mensaje horario mostrando las horas
		tiempo.append("Son las ");
		tiempo.append(hora > 12 ? hora - 12 : hora);
		tiempo.append(" horas ");

		// Mostrando los minutos
		if (minuto != 0) {
			tiempo.append(minuto + " ");
			tiempo.append((minuto != 1) ? "minutos " : "minuto ");
		}

		// Mostrar el día
		tiempo.append("del día " + dia + " de ");

		// Mostrar el nombre del mes
		switch (mes) {
		case 1:
			tiempo.append("Enero");
			break;
		case 2:
			tiempo.append("Febrero");
			break;
		case 3:
			tiempo.append("Marzo");
			break;
		case 4:
			tiempo.append("Abril");
			break;
		case 5:
			tiempo.append("Mayo");
			break;
		case 6:
			tiempo.append("Junio");
			break;
		case 7:
			tiempo.append("Julio");
			break;
		case 8:
			tiempo.append("Agosto");
			break;
		case 9:
			tiempo.append("Septiembre");
			break;
		case 10:
			tiempo.append("Octubre");
			break;
		case 11:
			tiempo.append("Noviembre");
			break;
		case 12:
			tiempo.append("Diciembre");
			break;

		}
		// Mostrar el año
		tiempo.append(" de " + an);
		return tiempo.toString();
	}
}
