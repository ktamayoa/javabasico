package gui.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos clase _10ComprobarTecla subclase de JFrame
public class _10ComprobarTecla extends JFrame {
	JLabel etiquetaTecla = new JLabel("Pulsa cualquier tecla");

	public _10ComprobarTecla() {
		super("Pulsa una tecla");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		MonitorearTecla monitor = new MonitorearTecla(this);
		setFocusable(true);
		addKeyListener(monitor);
		add(etiquetaTecla);
		setVisible(true);
	}

	public static void main(String args[]) {
		new _10ComprobarTecla();
	}
}

class MonitorearTecla extends KeyAdapter {

	_10ComprobarTecla display;

	MonitorearTecla(_10ComprobarTecla display) {
		this.display = display;
	}

	public void keyTyped(KeyEvent event) {
		//Modificar el texto que aparece en la interface
		display.etiquetaTecla.setText("" + event.getKeyChar());
		display.repaint();
	}
}