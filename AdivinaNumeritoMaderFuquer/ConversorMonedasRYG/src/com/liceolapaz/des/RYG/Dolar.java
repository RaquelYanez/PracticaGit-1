package com.liceolapaz.des.RYG;

public class Dolar implements Moneda {

		double cantidad;

		
		public double cantidadEnEuros() { // 1 U.S. dollar = 0.883509299 Euros
			return cantidad * 0.883509299;
		}
		
		
}
