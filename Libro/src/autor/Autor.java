package autor;

public class Autor {
	/*
	 * //String nombre, apellidos

	 * enteror que sea edad
	 * crear constructor vacio y
	 *  otroparamatrizado (3propiedad
	 *  
	 *  getters y seters
	 */
	
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Autor () {
		
	}
	
	public Autor (String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public String getNombre() {
		return this.nombre;		
	}
	
	public void setNombre (String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellido (String nuevoApellidos) {
		this.apellidos = nuevoApellidos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public void setEdad (int nuevaEdad) {
		this.edad = nuevaEdad;
	}
	
}
