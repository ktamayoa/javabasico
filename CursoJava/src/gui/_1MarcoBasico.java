package gui;

import javax.swing.JFrame;

//Extender de la clase JFrame (no abstracta ya que sus métodos están implementados)
public class _1MarcoBasico extends JFrame {

	private static final long serialVersionUID = 1L;

	//En el constructor default llamar a super
	public _1MarcoBasico() {
		//super("Mi primer frame"); //Colocar el texto que irá en el título
		//Se puede utilizar otro constructor
		super();
		setTitle("Mi titulo con set"); //Asignar un título
		setSize(400, 200); //Setear el tamaño de la pantalla (ancho=400, alto=200) en pixeles		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir operación de cierre
		setVisible(true); //Definir visibilidad del frame
	}
	
	public static void main(String[] args) {
		new _1MarcoBasico(); //Llamar al constructor de la clase
	}
}
