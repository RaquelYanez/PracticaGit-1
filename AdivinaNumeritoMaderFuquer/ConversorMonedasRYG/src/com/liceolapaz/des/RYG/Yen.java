package com.liceolapaz.des.RYG;

public class Yen implements Moneda {

		double cantidad; //guardamos en una variable
		
	
	public double cantidadEnEuros() { //metodo para calcular la conversion
		// ahora hago calculo de conversion 1 Japanese yen = 0.00779327499 Euros
		return cantidad *  0.00779327499 ; //operacion 
	}

}
