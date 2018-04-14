package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class _3CampoTexto extends JFrame {

	private static final long serialVersionUID = 1L;

	public _3CampoTexto() {
		super("CampoTexto");
		setSize(400,80);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel etiquetaPagina = new JLabel("Dirección página web: ", JLabel.RIGHT);
		JTextField direccionPagina = new JTextField("Escribe aqui", 30);
		
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		add(etiquetaPagina);
		add(direccionPagina);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _3CampoTexto();
	}
}
