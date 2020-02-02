package com.liceolapaz.MASS;

public class Triángulo {
//Atributos 
	public double Base;
	public double Altura; 
	public double Area; 
	
	public double calcularArea() {
	this.Area= (this.Base*this.Altura)/2;
	return this.Area;
}
}
