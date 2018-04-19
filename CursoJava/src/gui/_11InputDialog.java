
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _11InputDialog extends JFrame {

	private static final long serialVersionUID = 1L;

	public _11InputDialog() {
		JOptionPane.showInputDialog("Escribe tu nombre");
	}

	public static void main(String[] args) {
		new _11InputDialog();
	}
}
