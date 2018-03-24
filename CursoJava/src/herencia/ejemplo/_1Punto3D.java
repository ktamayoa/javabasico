package herencia.ejemplo;
import java.awt.*;


//con extends(es un) clase _1Punto3D es subclase de la clase Point
public class _1Punto3D extends Point{
	public int z;

	//método constructor de la clase que lleva el nombre de la clase en la que se encuentra
	//x y y recibirá de Point y z de si mismo
	public _1Punto3D(int x, int y, int z)	{
		//hace referencia al constructor de la superclase en este caso el constructor recibe los valores x y y
		super (x, y);
		//this significa this (este); hace referencia a la instancia actual. Mediante este se puede acceder a los miembros (variables o métodos) de la instancia.
		this.z = z;
	}
	
	public void move(int x, int y, int z)	{
		this.z= z;
		super.move(x, y);
	}

	public void translate(int x, int y, int z)	{
		this.z += z;
		super.translate(x, y);
	}
}

