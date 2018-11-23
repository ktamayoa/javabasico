package arraylist;

import java.util.ArrayList;
import java.util.List;

public class _1ManejoArraylist {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		/*
		 * En teoría no se puede agregar primitivos a un ArrayList. Con los ejemplos a
		 * continuación se puede ver que Java realiza un autoboxing para agregarlos.
		 */
		// Ejemplo de lista de Object
		List listaObject = new ArrayList();
		listaObject.add(1);
		System.out.println(listaObject);

		// Ejemplo de lista de Integer
		List<Integer> listaInteger = new ArrayList<>();
		listaInteger.add(2);
		System.out.println(listaInteger);
	}

}
