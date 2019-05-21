package q053;

public class _53 {

}


class Vehicle{
	int x;
	
	Vehicle(){
		this(10);
	}
	
	Vehicle(int x){
		this.x = x;
	}
}

class Car extends Vehicle{
	int y;
	
	Car(){
		super();
		//this(20);	
	}
	
	Car(int y){
		this.y = y;
	}
	
	
}