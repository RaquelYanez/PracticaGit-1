package persona;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = 0;
	}

	/*
	 * Para definir unmetodo 
	 * Desde donde se llama al metodo= Modificador de acceso, public private o protected
	 * Que va a retornar el metodo = las distintas posibilidades (sstring, float, void boolean etc, cualqueri clase definida
	 * Como se va a llamar = poner nombre al metodo
	 * Necesita recoger algunainfomacion del exterior por parametro?
	 */
	
	public String getNombre() {
		//L28returnb persona1.nombre
		//L29returnb persona2.nombre
		return this.nombre;
		
	}
	
	public void setNombre(String nuevoNombre) {
		
		this.nombre = nuevoNombre;
		
	}
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
}