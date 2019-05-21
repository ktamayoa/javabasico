package q101;


public class Fragmento {

	String name;
	int age = 25;
		
	public Fragmento(String name){
		//this(); //no existe el constructor
		setName(name);
	}

	public Fragmento(String name, int age){
		//Fragmento(name); //debe ser llamado como this(name); o new Fragmento(name);
		setAge(age);
	}
	
	private void setAge(int age2) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

	public String show(){
		return name + " " + age;
	}
	
	public static void main(String[] args) {
		Fragmento p1 = new Fragmento("Jesse");
		Fragmento p2 = new Fragmento("Walter", 52);
		
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}
