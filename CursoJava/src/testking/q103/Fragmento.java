package q103;

import java.util.ArrayList;

public class Fragmento {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(2);  // elimina el elemento en la posición 2 => 3
		points.remove(null); // elimina el objeto null
		System.out.println(points);
	}

}
