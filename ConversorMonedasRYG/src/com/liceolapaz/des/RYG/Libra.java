package com.liceolapaz.des.RYG;

public class Libra implements Moneda {
	
	private double cantidad;

	public Libra (double cantidad) {
		super();
		this.cantidad = cantidad;	
	}
	
	
	public double cantidadEnEuros() { //1 British pound = 1.1029861 Euros
		return cantidad * 1.1029861;
		
	}

	
	
}
