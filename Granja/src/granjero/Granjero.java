package granjero;

import vaca.Vaca;

public class Granjero {
	private String nombre;
	private String apellido;
	private String sexo;
	private boolean jubilado;// true => jubilado, false => trabaja

	public Granjero(String nombre, String apellido, String sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.jubilado = true;

	}

	/*
	 * Cosas que plantearse al hace run métdp Desde donde se llama a este metodo Que
	 * info nos va a devolver el método Como se va a llamar Necesitamos información
	 * exterior al método? (parámetros)
	 */
	// Quien ordeña? por eso se pone aqui //(vaca1)
	public double ordenharVaca(Vaca vaca) {
		// if (vaca1.getCantidadLeche() == 0);
		if (vaca.getCantidadLeche() == 0) {
			System.out.println("Esta vaca no tiene leche");
			return 0;
		} else {
			
			vaca.setCantidadLeche(vaca.getCantidadLeche() - 1);
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Granjero [nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", jubilado=" + jubilado
				+ "]";
	}

}
