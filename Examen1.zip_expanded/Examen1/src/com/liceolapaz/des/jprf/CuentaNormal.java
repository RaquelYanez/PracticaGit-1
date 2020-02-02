package com.liceolapaz.des.jprf;

public class CuentaNormal extends CuentaBancaria {

	private double saldo;

	public CuentaNormal(double saldo) {
		super();
		this.saldo = saldo;
	}

	@Override
	public double consultarSaldo() {
		return this.saldo;
	}

	@Override
	public void ingresarDinero(double cantidad) {
		if (cantidad < 0) {
			System.out.println("La cantidad a ingresar tiene que ser positiva");
		} else {
			this.saldo = this.saldo + cantidad;
		}
	}

	@Override
	public void retirarDinero(double cantidad) {
		if (cantidad < 0) {
			System.out.println("La cantidad a retirar tiene que ser positiva");
		} else {
			if (cantidad > this.saldo) {
				System.out.println("No puede quedarse con saldo negativo");
			} else {
				this.saldo = this.saldo - cantidad;
			}
		}
	}

}
