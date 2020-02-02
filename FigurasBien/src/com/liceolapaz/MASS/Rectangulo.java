package com.liceolapaz.MASS;

public class Rectangulo extends Figura{
	//definir atrbutos
	private double base;
	private double altura;
	
	//constructor publico sino no podriamos crear objetos desde otra clase
	
	public Rectangulo (double base, double altura) { //double o si fuese float se espera los aprametros double o float
this.base = base;
this.altura = altura;
}
	public double obtenerArea() {
		double area = base * altura; // no necesitamos almacenarlo en variable, vale con meteran en el return
		return area;
	}
	public double obtenerPerimetro() {
		
		double perimetro = 2*(base * altura); // no necesitamos almacenarlo en variable, vale con meteran en el return
		return perimetro;
		
	}
}