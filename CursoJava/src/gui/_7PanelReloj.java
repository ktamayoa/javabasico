package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import condicional.ejemplo._4Reloj;

public class _7PanelReloj extends JPanel {

	private static final long serialVersionUID = 1L;

	public _7PanelReloj() {
		super();
		_4Reloj reloj = new _4Reloj();
		String tiempoActual = reloj.getTiempo();
		JLabel tiempo = new JLabel("Fecha: ");
		JLabel actual = new JLabel(tiempoActual);
		add(tiempo);
		add(actual);
	}
}
