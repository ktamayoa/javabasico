
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _12InputDialog extends JFrame {

	private static final long serialVersionUID = 1L;

	public _12InputDialog() {
		String email = JOptionPane.showInputDialog(null, "¿Cuál es tu email?", "Escribe tu email",
				JOptionPane.WARNING_MESSAGE);
		System.out.println("Email ingresado: " + email);
	}

	public static void main(String[] args) {
		new _12InputDialog();
	}
}
