package com.liceolapaz.MASS;

public class Entero implements Numeros {
//variable privada
	private int valor;

	public Entero(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override //sobreescrito de la parte de arriba 
		public Numeros suma(Numeros operando) {
		if (operando instanceof Entero) { 
			Entero op = (Entero) operando; 
			int resultado = this.valor + op.getValor();
		return new Entero(resultado);	
		}
		return null;
		}

	@Override
	public Numeros resta(Numeros operando) {
		if (operando instanceof Entero) { 
			Entero op = (Entero) operando; 
			int resultado = this.valor - op.getValor();
		return new Entero(resultado);	
		}
		return null;
		}

	

	@Override
	public Numeros producto(Numeros operando) {
		if (operando instanceof Entero) { 
			Entero op = (Entero) operando; 
			int resultado = this.valor * op.getValor();
		return new Entero(resultado);	
		}
		return null;
		}

	

	@Override
	public Numeros division(Numeros operando) {
		if (operando instanceof Entero) { 
			Entero op = (Entero) operando; 
			if (op.getValor() == 0) {
				System.out.println("Error: Division entre 0");
			}
		}
		return null;
		}

	

	@Override
	public String mostrar() {
		return "" + this.valor;
	}

}