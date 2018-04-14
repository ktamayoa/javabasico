package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class _6AreaTexto extends JFrame {

	private static final long serialVersionUID = 1L;

	public _6AreaTexto() {
		super("Area de Texto");
		setSize(500,180);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea comentarios = new JTextArea(8, 40);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		add(comentarios);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _6AreaTexto();
	}
}
