package q112;

public class Fragment {

	public static void main(String[] args) {

		int [] data = {2010, 2013, 2014, 2015, 2014}; //si puede repetir elemento
		int key = 2014;
		int count = 0;

		for (int e : data){
			if(e != key){
				continue;
				//count++; //código inalcanzable
			}
		}
		
		System.out.println(count + "Found");
		
	}
	
}
