package herencia.ejemplo;
import java.awt.*;


//con extends clase _1Punto3D es subclase de la clase Point
public class _1Punto3D extends Point{
	public int z;

	//método constructor de la clase que lleva el nombre de la clase en la que se encuentra
	//x y y recibirá de Point y Z de si mismo
	public _1Punto3D(int x, int y, int z)	{
		//hace referencia a la superclase del objeto actual
		super (x, y);
		//modo que se usa para referenciar el actual objeto Punto3D desde el cual ejecutamos la clase
		//objeto en concreto que está utilizando la clase
		this.z= z;
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

