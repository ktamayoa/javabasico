package gui.gestores;

import javax.swing.JFrame;

public class _6MarcoEncuesta extends JFrame {
	
    private static final long serialVersionUID = 1L;

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
