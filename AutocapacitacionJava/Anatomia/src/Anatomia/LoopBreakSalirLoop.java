package Anatomia;

public class LoopBreakSalirLoop {

	public static void main(String[] args) {
		int index = 0;
		
		while(index <= 1000)
		{
			index = index + 5;
			System.out.println(index);
			
			if (index == 400)
			{
				System.out.println("index = " + index + " saliendo ....");
				break;
			}
		}

	}

}
