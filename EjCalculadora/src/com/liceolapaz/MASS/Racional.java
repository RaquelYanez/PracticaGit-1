package com.liceolapaz.MASS;

public class Racional implements Numeros {

	private int numerador;
	private int denominador;

	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public Numeros suma(Numeros operando) {
		if (operando instanceof Racional) {
			Racional op = (Racional) operando;
			int a = this.numerador;
			int b = this.denominador;
			int c = op.getNumerador();
			int d = op.getDenominador();
			int nuevoNumerador = a * d + b * c;
			int nuevoDenominador = b * d;
			return new Racional(nuevoNumerador, nuevoDenominador);

		}
		return null;
	}

	@Override
	public Numeros resta (Numeros operando) {
if  (operando instanceof Racional) {
	Racional op = (Racional) operando;
	int a = this.numerador;
	int b = this.denominador;
	int c = op.getNumerador();
	int d = op.getDenominador();
	int nuevoNumerador = a*d - b*c;
	int nuevoDenominador = b*d;
	return new Racional (nuevoNumerador, nuevoDenominador);


	}
return null;
	}

	@Override
	public Numeros producto (Numeros operando) {
if  (operando instanceof Racional) {
	Racional op = (Racional) operando;
	int a = this.numerador;
	int b = this.denominador;
	int c = op.getNumerador();
	int d = op.getDenominador();
	int nuevoNumerador = a*c;
	int nuevoDenominador = b*d;
	return new Racional (nuevoNumerador, nuevoDenominador);


	}
return null;
	}

	@Override
	public Numeros division (Numeros operando) {
if  (operando instanceof Racional) {
	Racional op = (Racional) operando;
	int a = this.numerador;
	int b = this.denominador;
	int c = op.getNumerador();
	int d = op.getDenominador();
	int nuevoNumerador = a*d;
	int nuevoDenominador = b*c;
	return new Racional (nuevoNumerador, nuevoDenominador);


	}
return null;
	}

	@Override
	public String mostrar() {
		return "" + this.numerador + "/" + this.denominador;
	}

}
