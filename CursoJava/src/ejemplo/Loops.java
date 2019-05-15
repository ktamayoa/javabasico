package ejemplo;

public class Loops {

	public static void main(String[] args) {
		
		int result = 8;
		
		loop:while(result>7)
		{
			result++;
			System.out.println("1 incremento " + result);
			
			do {
				System.out.println("2 incremento " + result);
				result--;
				System.out.println("3 decremento " + result);
			} while (result > 5);
			break loop;
		}System.out.println(result);		
	}
}
