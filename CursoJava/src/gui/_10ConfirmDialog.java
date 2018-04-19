package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _10ConfirmDialog extends JFrame {

	private static final long serialVersionUID = 1L;

	public _10ConfirmDialog() {
		int respuesta = JOptionPane.showConfirmDialog(null, "Error leyendo archivo. ¿Quiere probar nuevamente?",
				"Error de archivo", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		System.out.println("Respuesta:" + respuesta);
	}

	public static void main(String[] args) {
		new _10ConfirmDialog();
	}
}
