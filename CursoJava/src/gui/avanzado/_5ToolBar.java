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

public class _5ToolBar extends JFrame {

	private static final long serialVersionUID = 1L;

	public _5ToolBar() {
		super("Barra de Herramientas");
		setSize(370, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon imgiAgregar = new ImageIcon("img/icons/application_form_add.png");
		JButton btnAgregar = new JButton(imgiAgregar);
		ImageIcon imgiEliminar = new ImageIcon("img/icons/application_form_delete.png");
		JButton btnEliminar = new JButton(imgiEliminar);
		ImageIcon imgiEditar = new ImageIcon("img/icons/application_form_edit.png");
		JButton btnEditar = new JButton(imgiEditar);
		ImageIcon imgiAmpliar = new ImageIcon("img/icons/application_form_magnify.png");
		JButton btnAmpliar = new JButton(imgiAmpliar);
		
		// Construir barra de herramientas
		JToolBar barra = new JToolBar();
		barra.add(btnAgregar);
		barra.add(btnEliminar);
		barra.add(btnEditar);
		barra.add(btnAmpliar);
		
		// Construir area de texto
		JTextArea editar = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(editar);
		
		// Construir marco
		BorderLayout borde = new BorderLayout();
		setLayout(borde);
		add("North", barra);
		add("Center", scroll);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _5ToolBar();
	}
}
