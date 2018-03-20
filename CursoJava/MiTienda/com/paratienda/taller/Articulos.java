package com.paratienda.taller;

import java.util.*;

public class Articulos implements Comparable{
	//Con private ninguna otra clase va a poder setear o recuperar sus valores, se deberá usar métodos accesores
	private String id;
	private String nombre;
	private double detalle;
	private int cantidad;
	private double precio;
	
	//Constructor para configurar valores de las variables
	//Toma 4 objetos String como argumentos para configurar las variables de instancia id, nombre, detalle y cantidad
	Articulos (String idIn, String nombreIn, String detalleIn, String cantidadIn){
		id = idIn;
		nombre = nombreIn;
		detalle = Double.parseDouble(detalleIn);
		cantidad = Integer.parseInt(cantidadIn);
		
		//Precio varíe segun la cantidad del producto en stock
		if (cantidad > 400)
			precio = detalle*.5D;  //50 porciento .5D=double
		else if (cantidad > 200)
			precio = detalle*.6D;
		else
			precio = detalle*.7D;
		
		precio = Math.floor(precio*100+.5)/100; //floor va a tener 2 decimales como máximo
		
	}
	
	
	
	//Error The type Articulos must implement the inherited abstract method Comparable.compareTo(Object)
	//La clase debe implementar el/los métodos de la interface en este caso el método compareTo
	//compareTo compara 2 objetos de una clase, el objeto actual desde el que se usa y el objeto que le pasa como argumento al método
	//El valor de retorno indicará el orden natural en el que hay que colocar al objeto
	//Si los 2 objetos son iguales devuelve 0, si el objeto actual es menor devuelve -1, si el objeto actual es mayor devuelve 1 (colacar encima colocar debajo minuto 40) 
	
	public int compareTo(Object obj){
		//Desaparece el error de arriba pero ahora hay que implementarlo
		//Primero hay que realizar el casting, porque en el método de la interface hay que pasarle un argumento de tipo interface 
		//convertido a un objeto de la clase Articulos  
		Articulos temp = (Articulos)obj; //objeto actual
		
		if (this.precio < temp.precio)
			return 1;
		else if (this.precio > temp.precio)
			return -1;
		return 0;
		
	}

	
	//Métodos accesores públicos, return para devolver el valor que tiene la variable
	//Convención getVariable
	public String getId(){
		return id;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getDetalle(){
		return detalle;
	}
	
	public int getCantidad(){
		return cantidad;
	}
	
	public double getPrecio(){
		return precio;
	}
	
}