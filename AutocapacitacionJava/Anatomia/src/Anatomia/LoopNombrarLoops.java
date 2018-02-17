package Anatomia;

public class LoopNombrarLoops {

	public static void main(String[] args) {
		int points = 0;
		int target = 100;
		
		targetLoop:
		while (target <= 100)
		{
			for(int i = 0; i < target; i++)
			{
				System.out.println("i: " + i);
				System.out.println("inicio: " + points);
				
				if(points > 50)
				{
					System.out.println("points = " + points);
					System.out.println("Saliendo de los 2 loops");
					break targetLoop;
				}
				points = points + i;
				System.out.println("fin: " + points);
				
			}
		}

	}

}
