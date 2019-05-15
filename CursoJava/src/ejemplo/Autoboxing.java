package ejemplo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Autoboxing {

	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	private static SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMd");
	private SimpleDateFormat dateFormatIni = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) {
		/*Integer integer = new Integer(4);
		System.out.print(integer) ; //.byteValue());
		
		System.out.print("-");
		int i = new Integer(4);
		//System.out.print(i.byteValue());
		System.out.print(i);
		
		Integer integer1 = 1;
		System.out.println(integer1);
		
		int integer2 = 1;
		System.out.println(integer2);

		System.out.println("-");
		
		Integer a = Integer.parseInt("1");
		System.out.println(a);
		
		int b = Integer.parseInt("1");
		System.out.println(b);
				
		Integer c = Integer.valueOf("1");
		System.out.println(c);
		
		int d = Integer.valueOf("1");
		System.out.println(d);
		*/
		

		

		Date fechaActual = new Date();
		//Date fechaActual = new Date(19, 1, 3);
		//Date fechaActual = new Date(2014, 02, 03);
		System.out.println(fechaActual);
		
		
		int anioActual = fechaActual.getYear();
		anioActual += 1900;
		String dateVigency = anioActual + "" + (fechaActual.getMonth() + 1) + "" + fechaActual.getDate();
		
		System.out.println(dateVigency);

		String dateString = dateFormat.format(fechaActual);
		int anioActual1 = Integer.parseInt(dateString.substring(0,3));
		anioActual1 += 1900;
		String dateVigency1 = anioActual1 + "" + (Integer.parseInt(dateString.substring(4,6)) + 1) + "" + dateString.substring(6,8); 

		System.out.println(dateVigency1);
		

		String dateString2 = dateFormat1.format(fechaActual);
		
		System.out.println(dateString2);
		
	}
}
