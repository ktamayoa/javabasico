/**
 * Los iconos usados en este ejemplo fueron obtenidos de:
 * _________________________________________
 * Mark James
 * http://www.famfamfam.com/lab/icons/silk/
 * _________________________________________
 */
package gui.avanzado;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class _4ToolBar extends JFrame {

	private static final long serialVersionUID = 1L;

	public _4ToolBar() {
		super("Barra de Herramientas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Iconos
		ImageIcon imgiAgregar = new ImageIcon("img/icons/application_form_add.png");
		ImageIcon imgiEliminar = new ImageIcon("img/icons/application_form_delete.png");
		ImageIcon imgiEditar = new ImageIcon("img/icons/application_form_edit.png");
		ImageIcon imgiAmpliar = new ImageIcon("img/icons/application_form_magnify.png");
		// Botones
		JButton btnAgregar = new JButton("Agregar", imgiAgregar);
		JButton btnEliminar = new JButton("Eliminar", imgiEliminar);
		JButton btnEditar = new JButton("Editar", imgiEditar);
		JButton btnAmpliar = new JButton("Ampliar", imgiAmpliar);
		// Barra de herramientas
		JToolBar barra = new JToolBar();
		barra.add(btnAgregar);
		barra.add(btnEliminar);
		barra.add(btnEditar);
		barra.add(btnAmpliar);
		// Preparar la interface de usuario
		JTextArea editar = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(editar);
		BorderLayout borde = new BorderLayout();
		setLayout(borde);
		add("North", barra);
		add("Center", scroll);
		pack(); //ajusta el frame de acuerdo a los componentes que contiene
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _4ToolBar();
	}
}
