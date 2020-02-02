package autor;

import libro.Libro;

public class Autor {
//
	private String nombre;
	private String apellidos;
	private int edad;
	private double cuentaCorriente;

	public Autor() {

	}

	public Autor(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cuentaCorriente = 0;
		
	}
	
	public double getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(double cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public double ingresarPorTrabajo (int paginas, String tipo) {
		/*if (tipo =="novela") {
			
		}else if (tipo == "comedia"){
			
		}else if (tipo == "tratro") {
			
		}else {
			System.out.println("Error, tipo desconocido");
		}
		*/
		double cobroAutor = 0;
		//-----------------------SWITCH-------------------------------------
		switch (tipo) {
		case "novela":
			cobroAutor = paginas *2.5;
			this.cuentaCorriente = this.cuentaCorriente + (cobroAutor);
		
			break;
			
		case "comedia":
			cobroAutor = paginas *1.25;
		this.cuentaCorriente = this.cuentaCorriente + ( cobroAutor);
		break;
		
		case "teatro":
			cobroAutor = paginas *0.25;
			this.cuentaCorriente = this.cuentaCorriente + ( cobroAutor);
			break;
			default:
				System.out.println("Error, tipo desconocido");
		
		}
		System.out.println("El autor cobra la cantidad de: " + cobroAutor);
		return cobroAutor;

		//this.cuentaCorriente += catidadDinero;
		//this.cuentaCorriente = this.cuentaCorriente + cantidadDinero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellido(String nuevoApellidos) {
		this.apellidos = nuevoApellidos;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int nuevaEdad) {
		this.edad = nuevaEdad;
	}

	// queremos que cuando se llame al metodo escriir, el autor, crre un libro
	// public String escribir (String frase) {
	// return frase;
	public Libro escribir(int paginas) {
		return new Libro(this, paginas);

	}
	//---------------AÑADIDO-------------------despues de corte de luz----
	public void bautizarObra (String titulo, Libro libro){
		System.out.println("Titulo escogido por el autor " + this + "es: " + libro.bautizarLibro(titulo));
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", cuentaCorriente="
				+ cuentaCorriente + "]";
	}

	

}
