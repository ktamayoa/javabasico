package Anatomia;

import java.util.*; //Calendar;

public class LoopMedidorVelocidad {

	public static void main(String[] args) {
		//Obtener fecha y hora actual
		Calendar start = Calendar.getInstance(); //start objeto de la clase Calendar
		int startMinute = start.get(Calendar.MINUTE);
		int startSecond = start.get(Calendar.SECOND);
		
		start.roll(Calendar.MINUTE, true); //MOver el tiempo hacia adelante 1 minuto
		
		int nextMinute = start.get(Calendar.MINUTE);
		int nextSecond = start.get(Calendar.SECOND);
		
		int index = 0;
		
		while (true)
		{
			double x = Math.sqrt(index);
			GregorianCalendar now = new GregorianCalendar();
			if(now.get(Calendar.MINUTE) >= nextMinute)
			{
				if(now.get(Calendar.SECOND) >= nextSecond)
				{
					break;
				}
				
			}
			index++;
			
		}
		
		System.out.println(index + " loops en un minuto");

	}

}
