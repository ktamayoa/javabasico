package gui.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _1CambiarTitulo extends JFrame implements ActionListener {
	
	JButton b1 = new JButton("Curso de JavaScript");
	JButton b2 = new JButton("Curso de PHP");

	public _1CambiarTitulo(){
		super("Barra de Título");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(this); //this, es el propio botón que debe ser vigilado
		b2.addActionListener(this);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(b1);
		add(b2);
		pack(); //Forma en la que se van a distribuir
		setVisible(true);
	}
	

	public void actionPerformed(ActionEvent evt) {
		Object fuente = evt.getSource();
		
		//Se da clic en un botón se cambia de título
		if (fuente == b1){
			setTitle("Curso de JavaScript");
		}
		else if(fuente == b2){
			setTitle("Curso de PHP");
		}
		
		repaint(); //Para ver el cambio inmediato en la interface
		
	}
	
	
	public static void main(String[] args) {
		new _1CambiarTitulo();

	}

}
