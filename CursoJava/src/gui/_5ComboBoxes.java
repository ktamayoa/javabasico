package gui;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class _5ComboBoxes extends JFrame {

	private static final long serialVersionUID = 1L;

	public _5ComboBoxes() {
		super("Cajas Boxes");
		setSize(345,120);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		JComboBox curso = new JComboBox();
		JComboBox<String> curso = new JComboBox<String>();
		FlowLayout dis = new FlowLayout();

		curso.addItem("Curso de Java");
		curso.addItem("Curso de C++");
		curso.addItem("Curso de PHP");
		curso.addItem("Curso de Flash");
		curso.addItem("Curso de JavaScript");
		curso.addItem("Curso de Ruby");
		curso.addItem("Curso de Angular");
//		curso.setEditable(true);
		
		setLayout(dis);
		add(curso);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _5ComboBoxes();
	}
}
