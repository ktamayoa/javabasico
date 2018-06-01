package gui.eventos;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

//Creamos la clase _4Calculadora subclase de JFrame e implementa la herencia FocusListener
public class _4Calculadora extends JFrame implements FocusListener {

	//La calculadora suma 2 campos cuando uno de los campos gana o pierde el foco
	
	//Creamos los campos de texto y las etiquetas para la calculadora
	JTextField valor1 = new JTextField("0", 5);
	JLabel mas = new JLabel("+");
	JTextField valor2 = new JTextField("0", 5);
	JLabel igual = new JLabel("=");
	JTextField suma = new JTextField("0", 5);

	//Creamos el constructor
	public _4Calculadora() {
		super("Añade dos números"); //Llamamos al contructos de la Superclase
		setSize(350, 90); //Dar un tamaño al marco
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Comportamiento de botones al cierre
		
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER); //Creamos un objeto 
		setLayout(flow); //Aplicamos el gestor de diseño
		
		// añadimos listeners a los dos campos de entrada de texto
		valor1.addFocusListener(this);
		valor2.addFocusListener(this);
		
		// configuramos el campo suma y lo hacemos no editable
		suma.setEditable(false);
		
		// añadimos los Componentes
		add(valor1);
		add(mas);
		add(valor2);
		add(igual);
		add(suma);
		setVisible(true);
	}

	//Implementamos el método focusGained de la interface FocusListener
	public void focusGained(FocusEvent event) {
		try {
			// Convertimos valores campos de String a números y los sumamos
			float total = Float.parseFloat(valor1.getText()) + Float.parseFloat(valor2.getText());
			
			// Añadimos el resultado al campo suma
			suma.setText("" + total);
		} catch (NumberFormatException nfe) { //Si ocurre una excepción
			valor1.setText("0");
			valor2.setText("0");
			suma.setText("0");
		}
	}

	//Implementamos el método focusLost de la interface FocusListener, haciendo que llame a focusGained
	public void focusLost(FocusEvent event) {
		focusGained(event);
	}

	public static void main(String args[]) {
		new _4Calculadora();
	}
}