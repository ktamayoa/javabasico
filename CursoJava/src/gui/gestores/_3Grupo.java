package gui.gestores;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _3Grupo extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JButton chris = new JButton("Chris");
	JButton katty = new JButton("Katty");
	JButton hugo = new JButton("Hugo");
	JButton gloria = new JButton("Gloria");
	JButton naty = new JButton("Natalia");
	JButton estefy = new JButton("Estefania");
	JButton mia = new JButton("Mia");
	JButton walda = new JButton("Walda");
	JButton lazi = new JButton("Lazi");

	
	public _3Grupo(){
		super("Grupo");
		setSize(260, 260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		GridLayout miembros = new GridLayout(3, 3, 10, 10);
		panel.setLayout(miembros);
		panel.add(chris);
		panel.add(katty);
		panel.add(hugo);
		panel.add(gloria);
		panel.add(naty);
		panel.add(estefy);
		panel.add(mia);
		panel.add(walda);
		panel.add(lazi);
		add(panel);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new _3Grupo();
	}

}
