package com.liceolapaz.MASS;

public class Triangulo extends Figura {
	// definir atrbutos
	private double base;
	private double lado1;
	private double lado2;
	private double altura;

	public Triangulo(double base, double lado1, double lado2, double altura) { // double espera los aprametros float siguientes
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.base = base;
		this.altura = altura;
	}
	// Lo anterio todo es el constructor

	// Creamos nuevo metodo público que nos retornará un double sin parámetros
	public double obtenerPerimetro() {
		double perimetro = 2 * (lado1 + lado2 + base);
		return perimetro;
	}

	// Creamos otro metodo que sea para obtener área
	public double obtenerArea() {
		// Hacemos otra variable de tipo double para calcular el area
		// double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
		// //Formula para calcular altura
		double area = (base * altura) / 2; // no necesitamos almacenarlo en variable, vale con meteran en el return
		return area;
	}
	// Creamos metodo string para mostrar datos

}
