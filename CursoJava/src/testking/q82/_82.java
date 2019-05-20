package testking.q82;

public class _82 {

	private char var;
	
	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		
		_82 obj1 = new _82();
		_82 obj2 = obj1;
		
		obj1.var = 'i';
		obj2.var = 'o';
		
		System.out.println(var1 + ", " + var2);
		System.out.print(obj1.var + ", " + obj2.var);
				
	}
}

