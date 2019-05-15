package ejemplo;

public class VarEstaticaInstanciaLocal {

	static int varestatica;
	int varinstancia;
	
	static final int varestaticafinal=1;
	final int varinstanciafinal;
	
	public VarEstaticaInstanciaLocal(){
		//varestaticafinal = 1;
		varinstanciafinal = 1;
	}
	
	public static void main(String... args) {
		int varlocal = 0;

		//System.out.println(varestatica);
		//System.out.println(new VarEstaticaInstanciaLoca().varinstancia);
		//System.out.println(varlocal);
		
		
		float varlocalfloat3 = 1;
		float varlocalfloat = 5;
		float varlocalfloat2 = 5f;
		float varlocalfloat1 = 5.0f;
		
		
		System.out.println(varlocalfloat);
		System.out.println(varlocalfloat2);		
		System.out.println(varlocalfloat1);
		System.out.println(varlocalfloat3);

		System.out.println();
		
		double varlocaldouble = 5;
		double varlocaldouble1 = 5.0;
		double varlocaldouble2 = 5f;
		double varlocaldouble3 = 5.0f;
		
		System.out.println(varlocaldouble);
		System.out.println(varlocaldouble1);
		System.out.println(varlocaldouble2);
		System.out.println(varlocaldouble3);
		
		//double d1 = new double(1_000_000.00);
		double d2 = new Double(1_000_000.00);
		//Double d3 = new double(1_000_000.00);
		
	}
	
}
