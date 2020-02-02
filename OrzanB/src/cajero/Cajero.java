package cajero;

public class Cajero {

	private String nombreBanco;
	private int codigoCajero;
	private double Credito;

	public Cajero(String nombreBanco, int codigoCajero, double credito) {
		this.nombreBanco = nombreBanco;
		this.codigoCajero = codigoCajero;
		this.Credito = credito;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public int getCodigoCajero() {
		return codigoCajero;
	}

	public void setCodigoCajero(int codigoCajero) {
		this.codigoCajero = codigoCajero;
	}

	public double getCredito() {
		return Credito;
	}

	public void setCredito(double credito) {
		Credito = credito;
	}
public void restarDinero (double dineroASacar){
	this.Credito = Credito - dineroASacar;
}

@Override
public String toString() {
	return "Cajero [nombreBanco=" + nombreBanco + ", codigoCajero=" + codigoCajero + ", Credito=" + Credito + "]";
}
	
}
