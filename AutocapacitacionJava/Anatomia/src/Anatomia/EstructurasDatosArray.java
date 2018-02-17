package Anatomia;
import java.util.ArrayList;

public class EstructurasDatosArray {

		public static void main(String[] args) {

			for (int waterLevel =0; waterLevel < 7; waterLevel++) {

				System.out.println("The pool's water level is at " + waterLevel + " feet.");

			}
			
			ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();

		    weeklyTemperatures.add(78);
		    weeklyTemperatures.add(67);
		    weeklyTemperatures.add(89);
		    weeklyTemperatures.add(94);
		    
		    System.out.println(weeklyTemperatures.get(1));
			
		    weeklyTemperatures.add(2,111);
		    
		    System.out.println(weeklyTemperatures.get(3));
		    
		    for (int j = 0; j < weeklyTemperatures.size(); j++){
		        System.out.println(weeklyTemperatures.get(j));
		      }
		    
		    for (Integer temperature:weeklyTemperatures) {
				System.out.println(temperature);
			}
		
		}
}
