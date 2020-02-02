package Persona;

import Pub.Pub;
import cajero.Cajero;

public class persona {
	private String nombre; // propiedad que e sun nombre que es de tipo string cadena, solo se podrá
							// acceder dentre de la clase persona
	protected String apellido;
	protected int edad; // propiedad que es un entero
	protected double dinero;

//Constructor, para crear objeto de esta clase. lo llamamos
	public persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dinero = 0;
	}

	public persona() {
	}

	// si usamos queuet tiene que devolvernos el valor
	public String getNombre() {
		return this.nombre;

	}

//set para poner el valor
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public void sacarDinero(Cajero objetoCajero,
			double dineroASacar) { /*
									 * a este meodo le pasamos objeto cajero porque va aser una persona y la
									 * cantidad de dinero que saca persona
									 */
		if (objetoCajero.getCredito() < dineroASacar) {
			System.out.println("No hay suficiente dinero en el cajero, el crédito disponible ene ste cajero es: "
					+ objetoCajero.getCredito());
			// objetoCajero.setCredito(dineroASacar);

		} else {
			this.setDinero(dineroASacar); // seteamos la propiedad dinero de persona
			objetoCajero.restarDinero(dineroASacar);
			System.out.println("Ahí tiene sus: " + dineroASacar);
		}

	}

	public void entrerEnPub(Pub objetoPub) {
		if (objetoPub.getPortero().permitirEntrada(this)) {
			if (this.getDinero() >=objetoPub.getPrecio()) {
				
				double dineroRestante=this.getDinero() - objetoPub.getPrecio();
				this.setDinero(dineroRestante);
				System.out.println(this.getNombre() + "voy a bailar y mañana asisitiré a clase" );
			}else {
				System.out.println(this.getNombre()+"no puede entrar porque no tiene cash");
			}
			}else {
			
				System.out.println ("maldito portero de marras....");
			}
		
		}
		//if(this.edad <18);{
		//return false;
	

		/*
					 * Pub objetoPub, ) = pubPub +. Param objeto pub return boolean comportamiento
					 * // de la persona a la hora de entrar en un pub. Informacion accesible //
					 * propiedades de la clase PErsona (sera un objeto persona el que llama al //
					 * método. Propiedades de la clase pub (porque pasamos un objeto pub por //
					 * parametro. Propiedades de la clase portero (porque va implicito pub creado)
					 */
	}

