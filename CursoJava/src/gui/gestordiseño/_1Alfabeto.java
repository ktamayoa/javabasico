package gui.gestordiseño;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _1Alfabeto extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JButton a = new JButton("Abierto");
	JButton b = new JButton("Basado");
	JButton c = new JButton("Cuerpo");
	JButton d = new JButton("Decisión");
	JButton e = new JButton("Evidencia");
	JButton f = new JButton("Formación");
	
	public _1Alfabeto(){
		super("Alfabeto");
		setSize(360, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//FlowLayout milayout = new FlowLayout(FlowLayout.LEFT); //por default 5px de separación entre componentes y filas
		FlowLayout milayout = new FlowLayout(FlowLayout.LEFT, 25, 15); //Con este constructor se puede definir la sepación entre componentes y filas
		setLayout(milayout);
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new _1Alfabeto();
	}

}
