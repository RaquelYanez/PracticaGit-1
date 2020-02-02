package Pub;

import Persona.persona;

public class Portero {
private String nombre;
private String arteMarcial;
private int kgMusculo;
public Portero(String nombre, String arteMarcial, int kgMusculo) {
	this.nombre = nombre;
	this.arteMarcial = arteMarcial;
	this.kgMusculo = kgMusculo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getArteMarcial() {
	return arteMarcial;
}
public void setArteMarcial(String arteMarcial) {
	this.arteMarcial = arteMarcial;
}
public int getKgMusculo() {
	return kgMusculo;
}
public void setKgMusculo(int kgMusculo) {
	this.kgMusculo = kgMusculo;
}
public boolean permitirEntrada (persona.persona persona) {
	if (persona.getEdad()<18) {
		System.out.println("A donde vas, fuera");
		
	}else {
		System.out.println(this.getNombre()+"adelante sr/sra"+persona.getNombre()+persona.getApellido());
		return true;
	}
}
}
