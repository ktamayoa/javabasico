package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class _7MarcoReloj extends JFrame {

	private static final long serialVersionUID = 1L;

	public _7MarcoReloj() {
		super("Reloj");
		setSize(600,75);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		_7PanelReloj tiempo = new _7PanelReloj();
		add(tiempo);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _7MarcoReloj();
	}
}
