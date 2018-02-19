package argumentos.ejemplo;

import java.awt.*;
import java.awt.Graphics2D;

public class EjemploApplet extends javax.swing.JApplet{
	
	private static final long serialVersionUID = 1L;
	int intNumero;
	
	public void init(){
		intNumero = 317;
	}

	public void paint (Graphics screen) {
		Graphics2D screen2D = (Graphics2D) screen;
		screen2D.drawString("La raíz cuadrada de " + intNumero + " es " + Math.sqrt(intNumero), 5, 50 );
	}

}
