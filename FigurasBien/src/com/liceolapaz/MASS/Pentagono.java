package com.liceolapaz.MASS;

public class  Pentagono extends Figura{
	private double apotema;
	private double lado;
	
	public Pentagono (double apotema, double lado) { //double o si fuese float se espera los aprametros double o float
		this.apotema= apotema;
		this.lado = lado;
	}
	@Override
	public double obtenerArea() {
		double area = (apotema * obtenerPerimetro()) / 2; // no necesitamos almacenarlo en una variable, nos vale con meter en el calculo en el return
		//obtenerPerimetro() llama al constructor perímetro que tiene la formula (lado ) *5 y ya la aplica en el perimetro de necesario para calcular área
		return area;
		
	}

	@Override
	public double obtenerPerimetro() {
		double perimetro = (lado) * 5; // no necesitamos almacenarlo en variable, vale con meteran en el return
		return perimetro;
		
	}

}
