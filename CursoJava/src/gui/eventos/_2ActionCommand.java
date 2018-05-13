package gui.eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _2ActionCommand extends JFrame implements ActionListener {
	
	JButton b1 = new JButton("Curso de JavaScript");

	public _2ActionCommand() {
		super("Barra de Título");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Añadir listener al componente que queremos vigilar
		b1.addActionListener(this);
		
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(b1);
		pack(); //Forma en la que se van a distribuir
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt){
		b1.setActionCommand("prueba");
		b1.setLabel(b1.getActionCommand());
		
		repaint();
	}
	
	public static void main(String[] args) {
		new _2ActionCommand();

	}

}
