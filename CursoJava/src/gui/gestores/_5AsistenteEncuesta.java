package gui.gestores;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _5AsistenteEncuesta extends JPanel implements ActionListener {
	
	//Interface que permite el trabajo con eventos, responde a eventos
	//actionPerformed método llamado cuando un componente está siendo escuchado para generar un evento 
	//Cuando se haga clic en el botón se llamará al metodo actionPerformed aumentará la variable en 1 y usará el método show para mostrar una nueva carta 
	
	int cartaActual = 0;
	
	CardLayout cartas = new CardLayout();
	PanelEncuesta[] pregunta = new PanelEncuesta[3];
	
	public _5AsistenteEncuesta(){
		super();
		setSize(240, 140);
		setLayout(cartas);
		
		//Configurar encuesta
		
		//Pregunta, array de respuestas y respuesta por defecto
		String pregunta1 = "¿Cuál es tu género?";
		String[] respuestas1 = {"hombre", "mujer", "no contesto"};
		pregunta[0] = new PanelEncuesta(pregunta1, respuestas1, 2);

		String pregunta2 = "¿Cuál es tu edad?";
		String[] respuestas2 = {"Menos de 25", "25-34", "35-54", "Más de 54"};
		pregunta[1] = new PanelEncuesta(pregunta2, respuestas2, 1);
		
		String pregunta3 = "¿Cuántas veces haces ejercicio cada semana?";
		String[] respuestas3 = {"Nunca", "1-3 veces", "Más de 3"};
		pregunta[2] = new PanelEncuesta(pregunta3, respuestas3, 1);
		
		//Método para hacer aparecer y desaparecer los botones siguiente y finalizar conforme se llegue a la última patalla
		pregunta[2].setPreguntaFinal(true);
		
		
		//En el botón se colocará un listener (escucha) para cuando se da clic en el botón
		for (int i=0; i < pregunta.length; i++){
			pregunta[1].botonSiguiente.addActionListener(this);
			pregunta[1].botonFinal.addActionListener(this);
			add(pregunta[i], "Carta " + i);
		}

	}
	
	public void actionPerformed(ActionEvent evt){
		cartaActual++;
		
		if (cartaActual >= pregunta.length){
			System.exit(0); //El programa finaliza
		}
		cartas.show(this, "Carta " + cartaActual);
	}
	
}

class PanelEncuesta extends JPanel{
	
	JLabel pregunta;
	JRadioButton[] respuesta;
	JButton botonSiguiente = new JButton("Siguiente");
	JButton botonFinal = new JButton("Finalizar");
	
	
	public PanelEncuesta (String pre, String[] resp, int def){
		super();
		setSize(160, 110);
		
		pregunta = new JLabel(pre);
		respuesta = new JRadioButton[resp.length];
		
		ButtonGroup grupo = new ButtonGroup();
		JPanel sub1 = new JPanel();
		JLabel preLabel = new JLabel(pre);
		sub1.add(preLabel);
		JPanel sub2 = new JPanel();
		
		for(int i=0; i < resp.length; i++){
			if (def == 1){
				respuesta[i] = new JRadioButton(resp[i], true);
			} 
			else{
				respuesta[i] = new JRadioButton(resp[i], false);
			}
			
			grupo.add(respuesta[i]);
			sub2.add(respuesta[i]);
		}
		
		JPanel sub3 = new JPanel();
		botonSiguiente.setEnabled(true);
		sub3.add(botonSiguiente);
		botonFinal.setEnabled(false);
		sub3.add(botonFinal);

		GridLayout grid = new GridLayout(3, 1);
		setLayout(grid);
		add(sub1);
		add(sub2);
		add(sub3);
		
	}
	
	void setPreguntaFinal (boolean preguntaFinal){
		if(preguntaFinal){
			botonSiguiente.setEnabled(false);
			botonFinal.setEnabled(true);
		}
	}
}
