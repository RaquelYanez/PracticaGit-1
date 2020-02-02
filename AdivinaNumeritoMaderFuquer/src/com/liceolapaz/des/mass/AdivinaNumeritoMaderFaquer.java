package com.liceolapaz.des.mass;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeritoMaderFaquer {

	public static void main(String[] args) {
		while (true) {
			// Escribir menu
			escribirMenu();
			// Pedir opción
			pedirOpcion();
			// Leer opción y guardar en una variable
			int opcion = leerOpcion();

// -------------------------------------------------------------------

			// Si la opción es 1
			if (opcion == 1) {
				jugar(3, 1, 10);

			} else if (opcion == 2) {
				jugar(5, 1, 50);

			} else if (opcion == 0) {
				System.out.println("Hola pringuel");
				System.exit(0);

			} else {
				System.out.println("no existe esa opcion");
			}
		}

	}
//----------------------------------------------------------------------	
	// control shift F arregla las llaves !!cntrl shift L TODOS LOS ATAJOS

	// Si la opcion es 0
	private static void jugar(int maxIntentos, int min, int max) {

		// Dependiendo de la opción hacer lo que sea
		int numIntentos = 0;

		// Generar un nº aletorio y guardarlo en una variable
		int numeroAleatorio = generarNumeroAleatorio(min, max);
		// System.out.println("El numero a adivinar es: " + numeroAleatorio ); luego se
		// borra
		System.out.println("El número a adivinar es : " + numeroAleatorio);
		String comparacion = "";

// Pedir nº al usuario-------------------------------------------------------------
		while (numIntentos < maxIntentos) {
			pedirNumero();
			
			// Leer nº de usuario guardarlo en una variable
			int numeroUsuario = leerNumero();
			
			// Sumar un intento
			numIntentos = numIntentos + 1; // ++ seria igual a poner mas 1
			
			// Comparar los dos nº y guardar esa comparación en una variable
			comparacion = compararNumero(numeroAleatorio, numeroUsuario);
			
			// Si el nº del usuario es mayor
			if (comparacion == "menor") {// si la comparacion es menor, el nº sera menor
			
				// Escribir mensaje de que el nº a adivinar es menor
				System.out.println("El numero a adivinar es menor");
			} else if (comparacion == "mayor") {
				System.out.println("El numero a adivinar es mayor");
			} else if (comparacion == "igual") {
				System.out.println("Has acertado el número en " + numIntentos);
				break;
			}
		}
		// Si el nº de usuario es mayor
		// Escribir un mensaje que diga que el nº a adivinar es mayor
		// Si los dos nº son iguales
		// Escribir mensaje de que acertó X intentos
		if (comparacion != "igual")
			System.out.println("No has acertado. El numero era " + numeroAleatorio);

	}

//------------------------------------------------------------------------------------------------------------
	private static String compararNumero(int numeroAleatorio, int numeroUsuario) {
		if (numeroAleatorio < numeroUsuario) {
			return "menor";
		} else if (numeroAleatorio > numeroUsuario) {
			return "mayor";
		} else {
			return "igual";
		}

	}

	private static int leerNumero() {
		Scanner scan = new Scanner(System.in); // sys.in es el teclado
		return scan.nextInt();

	}

	private static void pedirNumero() {
		System.out.println("Escriba un número: ");

	}

	private static int generarNumeroAleatorio(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;

	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();

		return opcion;
	}

	private static void pedirOpcion() {
		System.out.print("Escoja un menu: ");
	}

	private static void escribirMenu() {
		System.out.print("ADIVINA EL NÚMERO\r\n" + "1. Del 1 al 10 (3 intentos)\r\n" + "2. Del 1 al 50 (5 intentos)\r\n"
				+ "0. Salir\r\n");
	}

}

//HAcer una tercera opcion que sea de 1 a 100 (intentos infinitos)
