package com.paratienda.taller;

import java.util.*;

//para manejar una colección de productos que se encuentran en un almacen online
//Cada producto es un objeto de la clase Articulos
public class Escaparate {

	//Se usará LinkedList que es una implementación de la interface List
	//Métodos para crear una lista, añadir y eliminar elementos a la lista
	//Instaciar objeto de la clase LinkedList guardada en una variable de nombre catalogo
	//Accederemos a esta variable donde estará guardada la lista de artículos mediante los siguientes métodos 
	private LinkedList catalogo = new LinkedList();
	
	
	public void addArticulo(String id, String nombre, String precio, String cantidad){
		//Crear un objeto de la clase Articulo usando el constructor que tiene 4 parámetros
		Articulos art =  new Articulos(id, nombre, precio, cantidad);
		catalogo.add(art);
	}
	
	//Acceder a la lista a través de un índice
	public Articulos getArticulo(int i){
		return (Articulos) catalogo.get(i);
	}
	
	//Método Size cantidad de árticulos de la lista enlazada
	public int getSize(){
		return catalogo.size();
	}
	
	//Método para usar la interface Comparable y organizar los artículos
	public void sort(){
		Collections.sort(catalogo);
	}
	
	
}
