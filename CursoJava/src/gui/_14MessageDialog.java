
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _14MessageDialog extends JFrame {

	private static final long serialVersionUID = 1L;

	public _14MessageDialog() {
		JOptionPane.showMessageDialog(null, 
				"Existen actualizaciones para el programa", 
				"Aviso actualizaciones",
				JOptionPane.WARNING_MESSAGE);
	}

	public static void main(String[] args) {
		new _14MessageDialog();
	}
}
