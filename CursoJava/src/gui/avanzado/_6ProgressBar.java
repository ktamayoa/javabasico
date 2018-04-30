package gui.avanzado;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class _6ProgressBar extends JFrame {

	private static final long serialVersionUID = 1L;
	JProgressBar actual;
	int num = 0;

	public _6ProgressBar() {
		super("Barra de progreso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(205, 68);
		setLayout(new FlowLayout());
		actual = new JProgressBar(0, 2000);
		actual.setValue(0);
		actual.setStringPainted(true);
		add(actual);
	}
	
	public void iterate() {
		while(num < 2000) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			num += 95;
			actual.setValue(num);
		}
	}
	
	public static void main(String[] args) {
		_6ProgressBar barraProgreso = new _6ProgressBar();
		barraProgreso.setVisible(true);
		barraProgreso.iterate();
	}
}
