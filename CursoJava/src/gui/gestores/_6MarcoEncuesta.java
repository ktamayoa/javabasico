package gui.gestores;

import java.awt.*;
import javax.swing.*;

public class _6MarcoEncuesta extends JFrame {

	public _6MarcoEncuesta(){
		super("Encuesta");
		setSize(290, 140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_5AsistenteEncuesta asis = new _5AsistenteEncuesta();
		add(asis);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new _6MarcoEncuesta();
	}

}
