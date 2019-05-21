package q115;


public class Test {
	
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount();
		
		//line n2
		
		//Opción B
		//this.amount = 100; //Falla, dice el error que un this no se puede usar en un contexto estático??
		
		//Opción C
		//amount = 100; //Falla no tiene la var definida en esta clase
		
		//Opción E
		//acct.amount = 100;
		
		
		System.out.println(acct.amount);
		//Con opción A imprime 100 //line n1 clase CheckingAccount
		//Con opción B falla       //line n2 clase Test
		//Con opción C falla       //line n2 clase Test
		//Con opción D imprime 100 //line n1 clase CheckingAccount
		//Con opción E imprime 100 //line n2 clase Test
		//Con opción F falla       //line n1 clase CheckingAccount
		
	}

	
}
