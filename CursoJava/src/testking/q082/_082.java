package q082;

public class _082 {

	private char var;
	
	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		
		_082 obj1 = new _082();
		_082 obj2 = obj1;
		
		obj1.var = 'i';
		obj2.var = 'o';
		
		System.out.println(var1 + ", " + var2);
		System.out.print(obj1.var + ", " + obj2.var);
				
	}
}

