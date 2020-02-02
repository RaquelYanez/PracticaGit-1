package retorno;

public class ArgumentosTipoRetorno {
	public static double calacularPerimetro(double lado) {
		return lado * 4;
	}

	public static void main(String[] args) {
		// para llamanr a este metodo nos vale con poner el nombre de la clase
		//double resultado = calacularPerimetro(5); 
		System.out.println(calacularPerimetro(5));
	}

}
