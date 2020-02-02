package com.liceolapaz.des.RYG;

public class Dolar implements Moneda {

		private double cantidad;

		public Dolar (double cantidad) {
			super();
			this.cantidad = cantidad;	
		}
		
		@Override
		public double cantidadEnEuros() { // 1 U.S. dollar = 0.883509299 Euros
			return cantidad * 0.883509299;
		}
		
		
}
