
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _15OptionDialog extends JFrame {

	private static final long serialVersionUID = 1L;

	public _15OptionDialog() {

		
		// TODO Puede ser arreglo de checkboxes ???
		String[] cursos = { "Java", "C++", "PHP" };

		int response = JOptionPane.showOptionDialog(null, "¿Qué curso sigues?", "Cursos", 0,
				JOptionPane.INFORMATION_MESSAGE, null, cursos, cursos[2]);
	
		System.out.println(response);
	}

	public static void main(String[] args) {
		new _15OptionDialog();
	}
}
