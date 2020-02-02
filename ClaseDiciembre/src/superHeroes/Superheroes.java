package superHeroes;
/*
 * Modificadores de acceso
 * package
 * public
 * private
 * protected
 */
/*
 * definiri variable = modificadoreDeAcceso(privado) tipoDeDato(String) nombreDeVariable = expresion del valor inicializador
 */
public class Superheroes {
//variables de instancia
	private static int contadorSuperHeroes;// estatic para que no imprima y fncione solo en esta clase
	private String nombre;
	private int velocidad;
	private int fuerza;

	// contar supereroes que se han creado. Creamos contrstucor
	public Superheroes(String nombre, int velocidad, int fuerza) {
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		contadorSuperHeroes++;
	}

	/*
	 * Creando asi el objet, este tendra comopropiedades 4 variables nombre
	 * velocidad fuerza contadorSuperheroes
	 */
									//60
	public int contadorVelocidad(int viento) {
		/*System.out.println(nombre);
		String nombre = "Javier";
		this.nombre ="Manuel ";
		System.out.println(this.nombre);*/
		//return batman.velocidad - 60
		
		
		
		
		
		
		return this.velocidad - viento;
	}

	@Override
	public String toString() {// sin toString no podriamos imprimir nada de batman en la principal
		return "Superheroes [contadorSuperHeroes=" + contadorSuperHeroes + ", nombre=" + nombre + ", velocidad="
				+ velocidad + ", fuerza=" + fuerza + "]";
	}

	public static int getContadorSuperHeroes() {
		return contadorSuperHeroes;
	}

	public static void setContadorSuperHeroes(int contadorSuperHeroes) {
		Superheroes.contadorSuperHeroes = contadorSuperHeroes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	
}
