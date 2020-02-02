package Pub;

import java.util.ArrayList;

import Persona.persona;

public class Pub {
	private String nombre;
	private double precio;
	private boolean Dj;
	private int hora;
	private ArrayList clientela;
	private Portero portero;

	public Pub(String nombre, double precio, boolean dj, int hora, Portero portero) {
		this.nombre = nombre;
		this.precio = precio;
		Dj = dj;
		this.hora = hora;
		this.portero = portero;
		this.clientela = new ArrayList<persona>();// este array contiene objetos de tipo persona

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDj() {
		return Dj;
	}

	public void setDj(boolean dj) {
		Dj = dj;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public Portero getPortero() {
		return portero;
	}

	public void setPortero(Portero portero) {
		this.portero = portero;
	}

	public void añadirCliente(persona persona) {
		this.clientela.add(persona);

	}
}
