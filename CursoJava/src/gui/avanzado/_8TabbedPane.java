package gui.avanzado;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class _8TabbedPane extends JPanel {

	private static final long serialVersionUID = 1L;

	public _8TabbedPane() {
		super();
		JPanel principal = new JPanel();
		JLabel label1 = new JLabel("Este es el panel Principal");
		principal.add(label1);
		JPanel avanzada = new JPanel();
		JLabel label2 = new JLabel("Este es el panel Avanzada");
		avanzada.add(label2);
		JPanel privada = new JPanel();
		JLabel label3 = new JLabel("Este es el panel Privada");
		privada.add(label3);
		JPanel email = new JPanel();
		JLabel label4 = new JLabel("Este es el panel Email");
		email.add(label4);
		JPanel seguridad = new JPanel();
		JLabel label5 = new JLabel("Este es el panel Seguridad");
		seguridad.add(label5);

		JTabbedPane pestanias = new JTabbedPane();
		ImageIcon icon = new ImageIcon("img/middle.gif");
		principal.setPreferredSize(new Dimension(410, 50));

		pestanias.addTab("Principal", icon, principal);
		pestanias.addTab("Avanzada", icon, avanzada);
		pestanias.addTab("Privada", icon, privada);
		pestanias.addTab("Email", icon, email);
		pestanias.addTab("Seguridad", icon, seguridad);

		// Añadir el componente JTabbedPane
		add(pestanias);

		// Habilitar el uso del scroll de pestañas
		pestanias.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}

	// Crear la GUI y mostrarla
	private static void crearYMostrarGUI() {
		// Crear y configurar la ventana
		JFrame marco = new JFrame("Ejemplo de Paneles con pestañas");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Añadir contenido a la ventana
		marco.add(new _8TabbedPane(), BorderLayout.CENTER);
		// Mostrar la ventana
		marco.pack();
		marco.setVisible(true);
	}

	public static void main(String[] args) {
		crearYMostrarGUI();
	}
}
