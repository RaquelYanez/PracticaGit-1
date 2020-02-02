package examen;

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
//Para ingresar dinero, lo que se ingrese debe ser mayor que cero entonces Si canidad (a ingresar es menor que 0) imprimir mensje
		if (cantidad < 0) {
			System.out.println("La cantidad a ingresar debe ser positiva");

		} else {// entonces este SALDO es igual al saldo actual más la cantidad ingresada
			this.saldo = this.saldo + cantidad;
		}
	}

	@Override
	public void retirarDinero(double cantidad) {
		// Para retirar diner la cantidad a retirar debe ser "positiva" entonce Si
		// cantidad es menor que 0 imprime mensaje
		if (cantidad < 0) {
			System.out.println("La cantidad a retirar debe ser mayor que 0");
//entonces si candidad a retirar es MAYOR que el saldo imprimir mensaje que nopermita quedar saldo negativo

		} else {

			if (cantidad > this.saldo) {
				System.out.println("No puede quedarse con saldo negativo");
//entonces para ritrar el dinero

			} else {
				this.saldo = saldo - cantidad;
			}

		}
	}
}
