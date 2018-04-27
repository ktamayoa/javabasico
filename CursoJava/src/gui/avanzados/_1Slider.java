package gui.componentes.avanzados;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class _1Slider extends JFrame {

	private static final long serialVersionUID = 1L;

	public _1Slider() {
		super("Ejemplo simple de Slider");
		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		add(slider);
	}
	
	public static void main(String[] args) {
		_1Slider marco = new _1Slider();
		marco.pack();
		marco.setVisible(true);
	}
}
