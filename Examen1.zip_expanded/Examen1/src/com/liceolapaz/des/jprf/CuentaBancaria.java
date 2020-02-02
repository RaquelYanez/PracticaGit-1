package com.liceolapaz.des.jprf;

public abstract class CuentaBancaria {
	public abstract double consultarSaldo();

	public abstract void ingresarDinero(double cantidad);

	public abstract void retirarDinero(double cantidad);
}
