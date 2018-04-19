package gui;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class _4ButtonGroupJCheckBox extends JFrame {

	private static final long serialVersionUID = 1L;

	public _4ButtonGroupJCheckBox() {
		super("Cajas Chequeo");
		
		
		setSize(345,120);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCheckBox cursoJava = new JCheckBox("Curso de Java", true);
		JCheckBox cursoFlash = new JCheckBox("Curso de Flash", true);
		JCheckBox cursoPHP = new JCheckBox("Curso de PHP", false);
		JCheckBox cursoRuby = new JCheckBox("Curso de Ruby", false);
		
		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			SwingUtilities.updateComponentTreeUI(cursoJava); //SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("No se ha podido configurar el look and feel: " + e.getMessage());
			e.printStackTrace();
		}
		
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
		new _4ButtonGroupJCheckBox();
	}
}
