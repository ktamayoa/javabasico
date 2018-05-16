package gui.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Ejemplo cuando un componenete ejecuta 2 eventos

public class _3Votacion {
	
	public static void main(String[] args) {
		
		// creamos tres radio buttons y les pasamos un valor mediante setActionCommand
		JRadioButton rob = new JRadioButton("Roberto", false);
		rob.setActionCommand("Roberto");
		JRadioButton jai = new JRadioButton("Jaime", false);
		jai.setActionCommand("Jaime");
		JRadioButton ros = new JRadioButton("Rosa", false);
		ros.setActionCommand("Rosa");
		
		// Convertimos los radio buttons en un grupo
		final ButtonGroup grupo = new ButtonGroup();
		grupo.add(rob);
		grupo.add(jai);
		grupo.add(ros);

		// creamos clase que implementa interface ActionListener
		class VotoActionListener implements ActionListener {
			
			//Implementar método actionPerformed
			public void actionPerformed(ActionEvent ex) {
				String eleccion = grupo.getSelection().getActionCommand(); // recuperamos valor de ActionCommand con getActionCommand()
				System.out.println("Acción Candidato Seleccionado: " + eleccion); // imprimimos valor recuperado
			}
		}
		
		// creamos clase que implementa interface ItemListener
		class VotoItemListener implements ItemListener {
			
			//Implemenar método itemStateChanged
			public void itemStateChanged(ItemEvent ex) {
				String item = ((AbstractButton) ex.getItemSelectable()).getActionCommand();// recuperamos valor de ActionCommand con getActionCommand()
				boolean selected = (ex.getStateChange() == ItemEvent.SELECTED);
				System.out.println("ITEM Candidato Seleccionado: " + selected + " Selección: " + item);// imprimimos valor recuperado
			}
		}
		
		// creamos objeto de la clase VotoActionListener()
		ActionListener al = new VotoActionListener();
		rob.addActionListener(al); // Añadimos ActionListener a rob
		jai.addActionListener(al); // Añadimos ActionLister a jai
		ros.addActionListener(al); // Añadimos ActionListerner a ros
		
		// creamos objeto de la clase VotoItemListener
		ItemListener il = new VotoItemListener();
		rob.addItemListener(il); // Añadimos ItemListener a rob
		jai.addItemListener(il); // Añadimos ItemListener a jai
		ros.addItemListener(il); // Añadimos ItemListener a ros
		
		// creamos el marco, le aplicamos un gestor de diseño y añadimos radio buttons
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		c.setLayout(new GridLayout(4, 1));
		c.add(new JLabel("Emite tu voto, por favor."));
		c.add(rob);
		c.add(jai);
		c.add(ros);
		frame.pack();
		frame.setVisible(true);
	}
}