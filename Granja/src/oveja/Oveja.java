package oveja;

/*
 * propuesto: hacer que el granjero puedaquitar por completo la lana de una oveja 
 * la ovjea sera creaa introducioendo valores por parametro y toda oveja tendrá lana 
 * desde el momento en que es creada.
 
 * la oveja tiene una propiedad lana que será true si tiene lana y false si no tiene
 * la oveja tendra una propiedad double que sea cantidad de lana 
 * cuando se la corte el granjero será 0
 * Cntrolar que no se pueda crear una oveja con cantidad de lana = 0 y lana igual a true en ese caso 
 * mandar mensaje de error
 */
public class Oveja {
	private int id;
	private String nombre;
	private double peso;
	private double cantidadLana;
	private boolean lana;

	// crear constructor, siempre public para acceder
	public Oveja(int id, String nombre, double peso, boolean lana) {

		this.id = id;
		this.nombre = nombre;
		this.peso = peso;
		this.lana = lana;
		this.cantidadLana = 0;

	}

	public double cantidadLana(double cantidadLana) {
		this.cantidadLana = cantidadLana;
		return "La oveja tiene: " + this.cantidadLana + "kilos lana";
	}

	@Override
	public String toString() {
		return "Oveja [id=" + id + ", nombre=" + nombre + ", peso=" + peso + ", cantidadLana=" + cantidadLana
				+ ", lana=" + lana + "]";
	}
	
}
