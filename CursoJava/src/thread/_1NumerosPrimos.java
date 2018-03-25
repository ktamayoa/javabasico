package thread;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class _1NumerosPrimos extends JFrame implements Runnable, ActionListener {

	private static final long serialVersionUID = 7220754147372280209L;
	Thread ir;
	JLabel etiquetaCuantos = new JLabel("Cantidad: ");
	JTextField cuantos = new JTextField("250", 10);
	JButton mostrar = new JButton("Mostrar Primos");
	JTextArea primos = new JTextArea(8, 40);
	
	public _1NumerosPrimos() {
		super("Mostrar Números Primos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		mostrar.addActionListener(this);
		
		JPanel topPanel = new JPanel();
		topPanel.add(etiquetaCuantos);
		topPanel.add(cuantos);
		topPanel.add(mostrar);
		add(topPanel, BorderLayout.NORTH);
		
		// Permite mostrar el contenido en varias líneas y no en una única linea horizontal
		primos.setLineWrap(true);
		
		JScrollPane panelTexto = new JScrollPane(primos);
		add(panelTexto, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	// Se ejecuta al pulsar el botón.
	public void actionPerformed(ActionEvent e) {
		// Se deshabilita para que no se pueda volver a pulsar el botón
		mostrar.setEnabled(false);
		if (ir == null) {
			ir = new Thread(this);
			ir.start();
		}
	}
	
	public void run() {
		int cantidad = Integer.parseInt(cuantos.getText());
		int numPrimos = 0;
		// candidato: el número puede ser primo
		int candidato = 2;
		primos.append("Primeros " + cantidad + " números primos: ");
		while (numPrimos < cantidad) {
			if (esPrimo(candidato)) {
				primos.append(candidato + " ");
				numPrimos++;
			}
			candidato++;
		}
	}

	private boolean esPrimo(int comprobarNumero) {
		double raiz = Math.sqrt(comprobarNumero);
		for (int i = 2; i <= raiz; i++) {
			if (comprobarNumero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		new _1NumerosPrimos();
	}
}
