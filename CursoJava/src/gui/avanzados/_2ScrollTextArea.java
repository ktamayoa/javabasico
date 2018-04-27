package gui.componentes.avanzados;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class _2ScrollTextArea extends JFrame {

	
	private static final long serialVersionUID = 1L;
	JScrollPane scrollPane;

	public _2ScrollTextArea() {
		super("Area de Texto con Scroll");
		setSize(500,180);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea comentarios = new JTextArea(8, 40);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		scrollPane = new JScrollPane(comentarios);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _2ScrollTextArea();
	}
}
