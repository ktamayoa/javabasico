package testking.q11;

interface Readable{
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable{
	public void readbook(){
		System.out.println("Padre");
	}
}

class EBook extends Book{
	public void readBook(){
		System.out.println("Hija");
	}
	public void setBookMark(){
		
	}
}


public class _11 {

	public static void main(String[] args) {
		Book book1 = new EBook();
		book1.readBook();
	}

}


