package q116;


public class ReportTool extends Tool implements Exportable{
	
	public void export(){	//line n2
		System.out.println("RTool::export");
	}
	
	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool); //si se corrige error imprime RTool::export
		callExport(bTool); //si se corrige error imprime Tool::export
	}

	private static void callExport(Exportable ex) {
		ex.export();
	}
}


interface Exportable{
	void export(); //son implicitamente public
}

class Tool implements Exportable{
	//protected void export(){	//line n1 //disminuye visibillidad de public a protected respuesta D compilación falla sólo en line n1
	public void export(){		//line n1 //corrigiendo error
		System.out.println("Tool::export");
	}
}