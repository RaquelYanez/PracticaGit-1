package com.licelolapaz.MASS;

import java.util.Scanner;

import java.util.Random;

public class PiedraPapel {

	public static void main(String[] args) {

		escribirMenu();// Escribir el menú del juego

		pedirOpcion();// Pedir Opcion

		int opcion = leerOpcion();// Leer opcion y guardar variable

		if (opcion < 0 | opcion > 2) {// Según la opción marcada, ejecutar una opción

			System.out.println("Introduzca 1 o 2");
		}

		if (opcion == 1) { // Comprobar Si la opción es 1:

			// Crear lista de jugadas
			String[] jugadasArray = new String[6]; // Se debe declarar y asignar memoria al Array(lista de objetos
													// comunes)
			jugadasArray[1] = "Piedra";
			jugadasArray[2] = "Papel";
			jugadasArray[3] = "Tijera";
			jugadasArray[4] = "Lagarto";
			jugadasArray[5] = "Spock";

			while (true) {

				// Generar un número aleatorio del 1 al 5.

				Random generadorNumeroAleatorio = new Random(); // Constructor de generadores de números aleatorios.
				int aleatorio = generadorNumeroAleatorio.nextInt(5 - 1 + 1) + 1; // Creando un generador de
																					// númeroaleatorio del 1 al 5.
//Lo que hace esta formula es inicializar a partir de 1, Si solo le damos el valor (5) +1 esto incializaría de 0
				// hasta cuatro y sumaría 1 para hacer 5
				escribirMenuJugada(); // Escribir menú para seleccionar jugada

				System.out.print("Escoja una opción: \r\n"); // imprime pedir Opcion de jugada

				int opcionJugador = leerOpcion(); // Leer opción de jugada y extraer del array

				if (opcionJugador > 5) {
					/*
					 * Se puede hacer por comparación de jugada 0 | 5 o simplemente si la opcion
					 * elejida es mayor al número de opcionoes a elegir entonces nos dará un error
					 */

					/*
					 * if (opcionJugador < 0 | opcionJugador > 5) { //Usar esa opcion de jugada y
					 * compararla con la extraida // del array, abarcando todas las posibilodades de
					 * // entrada posibles System.out.
					 * println("Jugada no permitida. Introduzca un número entre el 0 y el 5"); }
					 */System.out.println("Jugada no permitida. Introduzca un número entre el 0 y el 5");
				}

				else if (opcionJugador == aleatorio) { // compara opcion mía y maquina
					System.out.println("Empate, ASUS jugó: " + jugadasArray[aleatorio] + "\r\n");

				} else if (aleatorio == 1 & (opcionJugador == 3 | opcionJugador == 4)) {
					System.out.println("Perdiste, ASUS jugó Piedra" + "\r\n");

				} else if (aleatorio == 2 & (opcionJugador == 1 | opcionJugador == 5)) {
					System.out.println("Perdiste, ASUS jugó Papel " + "\r\n");

				} else if (aleatorio == 3 & (opcionJugador == 2 | opcionJugador == 4)) {
					System.out.println("Perdiste, ASUS jugó Tijera " + "\r\n");

				} else if (aleatorio == 4 & (opcionJugador == 2 | opcionJugador == 5)) {
					System.out.println("Perdiste, ASUS jugó Lagarto " + "\r\n");

				} else if (aleatorio == 5 & (opcionJugador == 3 | opcionJugador == 1)) {
					System.out.println("Perdiste, ASUS jugó Spock" + "\r\n");

				} else if (opcionJugador == 0) {
					System.out.println("Sayonara Baby");
					System.exit(0);

				} else {
					System.out.println("Ganaste! La máquina jugó " + jugadasArray[aleatorio] + "\r\n");

				}
			}
		}

		// Si la opción es 2, el programa debe terminarse.
		else if (opcion == 0) {
			System.out.println("Hasta pronto");
			System.exit(0);
		}

	}

	private static void escribirMenuJugada() {
		System.out.println("Elija juego:\n" + "1.Piedra \n" + "2.Papel \n" + "3.Tijera \n" + "4.Lagarto \n"
				+ "5.Spock \n " + "0.Salir \r\n");

	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		return opcion;

	}

	private static void escribirMenu() {
		System.out.println("PIEDRA PAPEL TIJERAS LAGARTO SPOCK\n" + "1. Jugar\n" + "0. Salir\n");

	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: " + "\r\n");

	}
}

//Fuentes: 
//https://www.quora.com/How-do-I-pick-up-a-random-string-from-an-array-of-strings-in-Java
//https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
