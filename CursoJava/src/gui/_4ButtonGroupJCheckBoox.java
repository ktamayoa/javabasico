package gui;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class _4ButtonGroupJCheckBoox extends JFrame {

	private static final long serialVersionUID = 1L;

	public _4ButtonGroupJCheckBoox() {
		super("Cajas Chequeo");
		setSize(345,120);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCheckBox cursoJava = new JCheckBox("Curso de Java", true);
		JCheckBox cursoFlash = new JCheckBox("Curso de Flash", true);
		JCheckBox cursoPHP = new JCheckBox("Curso de PHP", false);
		JCheckBox cursoRuby = new JCheckBox("Curso de Ruby", false);
		
		FlowLayout dis = new FlowLayout();
		ButtonGroup cursos = new ButtonGroup();
		
		cursos.add(cursoJava);
		cursos.add(cursoFlash);
		cursos.add(cursoPHP);
		cursos.add(cursoRuby);
		
		setLayout(dis);
		add(cursoJava);
		add(cursoFlash);
		add(cursoPHP);
		add(cursoRuby);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _4ButtonGroupJCheckBoox();
	}
}
