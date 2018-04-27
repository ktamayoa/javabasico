package gui.componentes.avanzados;

import javax.swing.JFrame;

public class _3ScrollList extends JFrame {

	
	private static final long serialVersionUID = 1L;

	public _3ScrollList() {
		super("Ejemplo de ScrollPane");
		setSize(300,200);		
		String[] categorias = {
				"Curso de PHP y MySql", "Curso de ActionScript", "Curso de PowerPoint",
				"Curso de Camtasia", "Curso de Visual Web Developer", "Curso de DreamWeaver",
				"Curso de Serv-U", "Curso de Photoshop", "Curso de XHTML",
				"Curso de Ajax", "Curso de JQuery", "Curso de CSS",
				};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new _3ScrollList();
	}
}
