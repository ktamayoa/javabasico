package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _2Playback extends JFrame {

	private static final long serialVersionUID = 1L;

	public _2Playback() {
		super();
		setTitle("Playback");
		setSize(250,80);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout dis = new FlowLayout();
		setLayout(dis);
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		add(play);
		add(stop);
		add(pause);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new _2Playback();
	}
}
