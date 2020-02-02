package com.liceolapaz.des.RYG;

public class Libra implements Moneda {
	
		double cantidad;
	
	public double cantidadEnEuros() { //1 British pound = 1.1029861 Euros
		return cantidad * 1.1029861;
		
	}

	
	
}
