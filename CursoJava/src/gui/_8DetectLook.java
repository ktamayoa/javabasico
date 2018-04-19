package gui;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * Detecta los aspectos soportados por el sistema operativo subyacente
 * @author csi
 */
public class _8DetectLook extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public _8DetectLook() {
		UIManager.LookAndFeelInfo[] laf = UIManager.getInstalledLookAndFeels();
		for (int i = 0; i < laf.length; i++) {
			System.out.println("Class name: " + laf[i].getClassName());
			System.out.println("Name: " + laf[i].getName() + "\n");
		}
	}
	
	public static void main(String[] args) {
		new _8DetectLook();
	}
}
