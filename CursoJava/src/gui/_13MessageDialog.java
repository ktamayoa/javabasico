
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _13MessageDialog extends JFrame {

	private static final long serialVersionUID = 1L;

	public _13MessageDialog() {
		JOptionPane.showMessageDialog(null, "Existen actualizaciones para el programa");
	}

	public static void main(String[] args) {
		new _13MessageDialog();
	}
}
