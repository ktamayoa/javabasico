package q025;

import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

public class _25 {

}

class Employee{
	String name;
	boolean contract;
	double salary;
	
	Employee(){
		name = "Joe";
		contract = true;
		salary = 100;
		
		this.name = "Joe";
		this.contract = true;
		this.salary = 100;
	}
	
	public String toString(){
		return name + ":" + contract + ":" + salary;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		System.out.print(e);
	}
	
	
}