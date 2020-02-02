package Persona;

public class hombre extends persona {
	private boolean barba; // if true -->tendrán barba

	public hombre(String nombre, String apellido, int edad, boolean barba) {
		super(nombre, apellido, edad);//con los parametros de arriba llama a la clase persona y usa estos valroes
		this.barba= barba;
		// TODO Auto-generated constructor stub
	}

	public hombre(boolean barba) {
		super ();
		this.barba = barba;
	}

	public boolean isBarba() { // por convenio el get se llama is pero se puede poner el getBarba
		return barba;
	}

	public void setBarba(boolean barba) {
		this.barba = barba;
	}

	@Override
	public String toString() {
		return "hombre [barba=" + barba + ", apellido=" + apellido + ", edad=" + edad + ", dinero=" + dinero + "]";
	}

}
