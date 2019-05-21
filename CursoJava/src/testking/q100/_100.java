package q100;


public class _100 {

	int count;
	public static void displayMsg(){
		//count++; //var de instancia no pueden ser llamadas desde un método estático
		//System.out.println("W" + "V C: " + count); //var de instancia no pueden ser llamadas desde un método estático
	}
	
	public static void main(String[] args) {
		_100.displayMsg();
		_100.displayMsg();
	}
}
