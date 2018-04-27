package gui.avanzado;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class _3ScrollList extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JScrollPane scrollPane;
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public _3ScrollList() {
		super("Ejemplo de ScrollPane");
		setSize(300,200);		
		String[] categorias = {
				"Curso de PHP y MySql", "Curso de ActionScript", "Curso de PowerPoint",
				"Curso de Camtasia", "Curso de Visual Web Developer", "Curso de DreamWeaver",
				"Curso de Serv-U", "Curso de Photoshop", "Curso de XHTML",
				"Curso de Ajax", "Curso de JQuery", "Curso de CSS",
				};
		
		JList lista = new JList(categorias);
		scrollPane = new JScrollPane(lista);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		_3ScrollList sl = new _3ScrollList();
		sl.setVisible(true);
		sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
