package gui.gestores;
import java.awt.*;
import javax.swing.*;

public class _4Borde extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JButton botonN = new JButton("Norte");
	JButton botonS = new JButton("Sur");
	JButton botonE = new JButton("Este");
	JButton botonO = new JButton("Oeste");
	JButton botonC = new JButton("Centro");

	
	public _4Borde(){
		super("Borde");
		setSize(240, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setLayout(new BorderLayout(10, 10));
		setLayout(new BorderLayout());

		add(botonN, BorderLayout.NORTH);
		add(botonS, BorderLayout.SOUTH);
		add(botonE, BorderLayout.EAST);
		add(botonO, BorderLayout.WEST);
		add(botonC, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		_4Borde marco = new _4Borde();
		marco.setVisible(true);
	}

}
