package vaca;

public class Vaca {
	private int id;
	private String nombre;
	private double peso;
	private double cantidadLeche;

	public Vaca(int id, String nombre, double peso) {// constructor siempre con el nombre de la clase igual
		this.id = id;
		this.nombre = nombre;
		this.peso = peso;
		this.cantidadLeche = 0;

	}

	public double getCantidadLeche() {
		return this.cantidadLeche;
	}
									//(5)
public String setCantidadLeche(double cantidadLeche) {
	//vaca1.cantidadLeche = 5
	this.cantidadLeche = cantidadLeche;
								//vaca1.cantidadLeche
	return "La vaca tiene: " + this.cantidadLeche + "litros";
}

	@Override
	public String toString() {
		return "Vaca [id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", cantidadLeche=" + cantidadLeche + "]";
	}

}
