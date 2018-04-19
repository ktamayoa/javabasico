package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _9ConfirmDialog extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public _9ConfirmDialog() {
		int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere borrar el archivo?");
		System.out.println("Respuesta:" + respuesta);
	}
	
	public static void main(String[] args) {
		new _9ConfirmDialog();
	}
}
