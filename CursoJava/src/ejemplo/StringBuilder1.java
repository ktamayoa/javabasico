package ejemplo;

public class StringBuilder1 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("radical ");
		sb = new StringBuilder("radical ").insert(7, "robots");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("radical ");
		sb1 = new StringBuilder("radical ").insert(sb1.length(), "robots");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("radical ");
		sb2 = new StringBuilder("radical ").delete(1, 100).append("obots").insert(1, "adical r");
		System.out.println(sb2);
	}
}
