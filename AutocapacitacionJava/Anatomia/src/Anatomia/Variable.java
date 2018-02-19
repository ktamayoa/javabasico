package salud.anatomia; //paquete todas en minúscula con punto anidamiento salud.anatomia


public class Variable { //la primera mayúscula

	//Constantes
	final int IVA = 14; //constante durante el programa final impide que se pueda cambiar el valor
	final int PRUEBA_UNO = 10; //convención en mayúsculas y si es una palabra compuesta con guión
	
	//Constantes
	static final int PERIODO = 365; //constante durante la clase  final impide que se pueda cambiar el valor
	
	public static void main (String[] args){
		
		int intCantidad; //De -2 a la 31 a 2 a la 31-1; -2,147,483,648 to 2,147,483,647
		float flPuntuacionPromedio; //single precision pero no usar para Currency-Monedas usar java.math.BigDecimal
		char chClave = 'C';
		String strNombreAlumno = "Katty"; 
		byte bytNumero; //De -128 a 127
		short shNumero; //De -32678 a 32677
		long lngNumero; //De -2 a la 63 a 2 a la 63-1 billones
		double dblNumero; //double precision, por default pero no usar para Currency-Monedas
		boolean blnVariable = true; //True o False 
		//decimal dec no existe
		
		int _prueba;
		int $prueba;
		
	}

}
