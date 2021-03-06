
package gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class _16RecogeDatos extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel etiquetaNombre = new JLabel("Nombre: ", SwingConstants.RIGHT);
	private JTextField nombre;
	private JLabel etiquetaURL = new JLabel("URL: ", SwingConstants.RIGHT);
	private JTextField url;
	private JLabel etiquetaTipo = new JLabel("Tipo: ", SwingConstants.RIGHT);
	private JTextField tipo;

	public _16RecogeDatos() {
		super("Recogida de información");
		setSize(400, 105);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Nombre sitio
		String respuesta1 = JOptionPane.showInputDialog(null, "Escribe el nombre del sitio:");
		nombre = new JTextField(respuesta1, 20);
		// Dirección sitio
		String respuesta2 = JOptionPane.showInputDialog(null, "Escribe la dirección del sitio:");
		url = new JTextField(respuesta2, 20);
		// Tipo sitio
		String[] opciones = { "Personal", "Empresarial", "Gubernamental" };
		int respuesta3 = JOptionPane.showOptionDialog(null, "¿Qué tipo de sitio es?", "Tipo sitio", 0,
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		tipo = new JTextField(opciones[respuesta3], 20);

		setLayout(new GridLayout(3, 2));
		add(etiquetaNombre);
		add(nombre);
		add(etiquetaURL);
		add(url);
		add(etiquetaTipo);
		add(tipo);
		setLookAndFeel();
		setVisible(true);
	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.err.println("No se ha podido usar el sistema look and feel: " + e);
		}
	}

	public static void main(String[] args) {
		new _16RecogeDatos();
	}
}
