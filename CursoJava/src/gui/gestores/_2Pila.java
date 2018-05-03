package gui.gestores;

import java.awt.*;
import javax.swing.*;

public class _2Pila extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public _2Pila(){
		super("Alfabeto");
		setSize(430, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Crear panel superior
		JPanel panelComando = new JPanel();
		BoxLayout horizontal = new BoxLayout(panelComando, BoxLayout.X_AXIS);
		panelComando.setLayout(horizontal);
		
		JButton alta = new JButton("Alta");
		JButton baja = new JButton("Baja");
		JButton actualizar = new JButton("Actualizar");
		JButton salvar = new JButton("Salvar");
		
		panelComando.add(alta);
		panelComando.add(baja);
		panelComando.add(actualizar);
		panelComando.add(salvar);
		
		
		//Crear panel inferior
		JPanel panelTexto = new JPanel();
		JTextArea texto = new JTextArea(4, 70);
		JScrollPane panelScroll = new JScrollPane(texto);
				
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		//Poner los paneles juntos
		add(panelComando);
		add(panelScroll);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new _2Pila();
	}

}
