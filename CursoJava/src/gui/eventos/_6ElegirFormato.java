package gui.eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _6ElegirFormato extends JFrame implements ItemListener {

	//creamos array de String para ComboBox
    String formatos[] = { "(elige formato)", "Atom", "RSS 0.92", 
        "RSS 1.0", "RSS 2.0" };
    
    //creamos array de String para etiquetas, que se mostraran cuando se selecione uno de los items del combobox
    String descripciones[] = {
        "Formato de sindicacion y weblog Atom",
        "Formato de sindicacion RSS 0.92 (Netscape)",
        "RSS 1.0 (RDF)",
        "RSS 2.0 (RSS Selección Aconsejada"
    };
    
    //Creamos Combo y Etiqueta
    JComboBox cajaFormato = new JComboBox();
    JLabel etiquetaDescripcion = new JLabel();
    
    public _6ElegirFormato() {
        super("Formato de Sindicación");
        setSize(420, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); //Gestor de diseño
        
        //añadimos a Combo items del string formatos
        for (int i = 0; i < formatos.length; i++ ) {
            cajaFormato.addItem(formatos[i]);
        }
        
        cajaFormato.addItemListener(this); //Añadimos listener a Combo
        add(BorderLayout.NORTH, cajaFormato); //Añadir el combo arriba en el gestor de diseño 
        add(BorderLayout.CENTER, etiquetaDescripcion); //Añadir etiquetas al centro en el gestor de diseño
        setVisible(true);
    }
    
    //Implementar método itemStateChanged de la interfaz
    public void itemStateChanged(ItemEvent event) {
        int eleccion = cajaFormato.getSelectedIndex(); //obtener index del item seleccionado
        if (eleccion > 0) { //En el ejemplo el primer índice "(elige formato)" no tiene etiqueta
            etiquetaDescripcion.setText(descripciones[eleccion-1]);
        }
    }
    
    public static void main(String args[]) {
        new _6ElegirFormato();
    }
}