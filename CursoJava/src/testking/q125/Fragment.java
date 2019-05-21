package q125;

public class Fragment {
	
	public static void main(String[] args) {

		Book book1 = new EBook();
		book1.readBook();
	}
}

interface Downloadable{
	public void download();
}

interface Redeable extends Downloadable{	//line n1
	public void readBook();
}

abstract class Book implements Redeable {	//line n2
	public void readBook(){
		System.out.println("Read Book");
	}
}

class EBook extends Book {	//line n3
	public void readBook(){
		System.out.println("Read E-Book");
	}
}