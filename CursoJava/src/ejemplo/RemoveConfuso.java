package ejemplo;

import java.util.ArrayList;
import java.util.List;

public class RemoveConfuso {

	public static void main(String[] args) {
		
		List<Integer> centavos = new ArrayList<>();
		centavos.add(3);
		centavos.add(2);
		centavos.remove(new Integer(2));
		System.out.println(centavos);
	}
}
