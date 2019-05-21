package q123;

import java.time.LocalDate;

public class Fragment {
	
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2012, 01, 32); //No falla en compilación
		date.plusDays(10);
		System.out.println(date); // java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32
	}
}
