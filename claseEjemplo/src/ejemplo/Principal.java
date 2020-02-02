package ejemplo;

import java.util.Scanner;

import persona.Persona;

public class Principal {

	public static void main(String[] args) {
		String nombreTeclado;
		String apellidoTeclado;
		
		/*Scanner sc = new Scanner(System.in);

		System.out.println("introduzca un nombre para la persona: ");

		nombreTeclado = sc.next();

		System.out.println("introduzca unos apellidos para la persona: ");

		apellidoTeclado = sc.next();
		
		

		Persona persona1 = new Persona(nombreTeclado, apellidoTeclado);
		
		Persona persona2 = new Persona(nombreTeclado, apellidoTeclado);
		
		Persona persona3 = new Persona(nombreTeclado, apellidoTeclado);*/
		
		Persona persona1 = new Persona("Miguel", "Veigue");
		System.out.println(persona1);
		Persona persona2 = new Persona("Djalma", "Feitosa");
		System.out.println(persona2);
		/*
		System.out.println(persona2);
		System.out.println(persona3);
		*/
		
		
		
		System.out.println("La persona creada tiene el nombre: " + persona1.getNombre());

		//aqui queremos cambiar le noombre de la persona
		persona1.setNombre("Renombrado");
		System.out.println("La persona creada tiene el nombre: " + persona1.getNombre());

	}

}


/*
 * Ejercicio
 * Crea un nuevo proyecto Java que se llame granja
 * Vas a necesitar crear objetos de tipo Granjero y objetos de tipo Vaca
 * Los granjeros van a tener un nombre, un apellido y un trabajo (recogedor, ordeñador, limpiador)
 * Las vacas van a tener un nombre, un sexo y un peso
 * Necesitamos un programa que cree 3 granjeros y 3 vacas mostrando los valores de las propiedades de cada uno
 * de los objetos creados.
 * Y al final del programa quiero que hagas una llamada al setter de cada objeto creado para renombrarlos todos 
 * como "Paca"
 * Modifica el setter para que muestre un mensaje diciendo que se ha cambiado y el nombre y que muestre el valor
 * nuevo de nombre
 */