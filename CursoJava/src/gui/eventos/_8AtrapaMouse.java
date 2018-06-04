package gui.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Clase _8AtrapaMouse implementa ActionListener con dos componentes (JLable y JButton)
public class _8AtrapaMouse extends JFrame implements ActionListener {

	public _8AtrapaMouse() {
		super("Mensaje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		
		setLayout(new BorderLayout());
		
		JLabel mensaje = new JLabel("Pulsa en aceptar para cerra la ventana");
		add(BorderLayout.NORTH, mensaje);
		
		AtrapaPanel atrapa = new AtrapaPanel();
		atrapa.aceptar.addActionListener(this);
		add(BorderLayout.CENTER, atrapa);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		System.exit(0);
	}

	public static void main(String[] arguments) {
		new _8AtrapaMouse();
	}

	//Panel que forma parte del marco
	//Clase AtrapaPanel subclase de JPanel e implementa la interface MouseMotionListener
	class AtrapaPanel extends JPanel implements MouseMotionListener {

		//Colocamos botón con valores absolutos
		JButton aceptar = new JButton("Aceptar");
		int botonX, botonY, ratonX, ratonY;
		int ancho, alto;

		AtrapaPanel() {
			super();
			//No asignar un gestor de diseño, para colocar botón con valores absolutos
			setLayout(null);
			
			addMouseMotionListener(this);
			botonX = 110;
			botonY = 110;
			
			aceptar.setBounds(new Rectangle(botonX, botonY, 90, 20));
			add(aceptar);
		}


        public void mouseMoved(MouseEvent event){
        	
        	//Posición del puntero
            ratonX = event.getX();
            ratonY = event.getY();
            
            ancho = (int)getSize().getWidth();
            alto = (int)getSize().getHeight();
           
            //Mover el botón a un lugar distinto
            if(Math.abs((ratonX + 35)- botonX)<50){
                botonX = moverBoton(ratonX,botonX,ancho);
                repaint();  //Reformular aspecto del marco
            }
            if(Math.abs((ratonY + 10)- botonY) <50){
                botonY = moverBoton(ratonY,botonY,alto);
                repaint();
            }
        }

		public void mouseDragged(MouseEvent event) {
			// ignored this event
		}

		private int moverBoton(int ratonAt, int botonAt, int borde) {
			if (botonAt < ratonAt) {
				botonAt--;
			} else {
				botonAt++;
			}
			if (botonAt > (borde - 20)) {
				botonAt = 20;
			}
			if (botonAt < 0) {
				botonAt = borde - 80;
			}
			return botonAt;
		}

		public void paintComponent(Graphics comp) {
			super.paintComponent(comp);
			aceptar.setBounds(botonX, botonY, 90, 20);
		}
	}
}