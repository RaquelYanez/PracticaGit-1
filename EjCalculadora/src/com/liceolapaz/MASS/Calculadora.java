package com.liceolapaz.MASS;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Escribir menú
		escribirMenu();

		// Pedir opción
		pedirOpcion();

		// Leer opción y guardarla
		int opcion = leerInt();

		// Si la opcion es 1, 2, 3 o 4
		if (opcion >= 1 && opcion <= 4) { // && si todo este es verdad

			// Escribir submenú
			escribirSubmenu();

			// Pedir opción 2
			pedirOpcion();

			// Leer opción 2 y guardarla
			int opcion2 = leerInt();

			// Si la opción 2 es 1
			if (opcion2 == 1) {

				// Pedir valor operando 1

				pedirValor1();
				// Leer operando y gardarlo operando 1
				int valor1 = leerInt();
				// Pedir valor operando 2

				pedirValor2();
				// Leer operando y gardarlo operando 2
				int valor2 = leerInt();
				// Crear operando 1
				Entero operando1 = new Entero(valor1);
				// Crear operando 2
				Entero operando2 = new Entero(valor2);

				// Dependiendo de la opción, hacer la operación correspondiente y guardar
				// resultado
				Numeros resultado = null;

				switch (opcion) {
				case 1:
					resultado = operando1.suma(operando2);

					break;
				case 2:
					resultado = operando1.resta(operando2);

					break;

				case 3:
					resultado = operando1.producto(operando2);

					break;

				case 4:
					resultado = operando1.division(operando2);

					break;
				}

				// Mostrar resultado
				mostrarResultado(resultado);
			}

			// Si la opción 2 es 2
			else if (opcion2 == 2)
				;
			// Pedir numerador del oeprando 1
			pedirNumerador1();
			// Leer numerador del operando 1 y gardarlo
			int numerador1 = leerInt();
			// Pedir denomiandor del operando 1
			pedirDenominador1();
			// Leer denominador del operando 1 y gardarlo
			int denominador1 = leerInt();
			// Pedir numerador del oeprando 2
			pedirNumerador2();
			// Leer numerador del operando 2 y gardarlo
			int numerador2 = leerInt();
			// Pedir denomiandor del operando 2
			pedirDenominador2();
			// Leer denominador del operando 2 y gardarlo
			int denominadro2 = leerInt();
			// Creamos operando 1
			Racional operando1 = new Racional(numerador1, denominadro2);
			// Creamos operando 2
			Racional operando2 = new Racional(numerador1, denominadro2);

			// Dependiendo de la opcion, hacer la operacoon

			// Correspoendiente y guardar resultado

			// Mostrar resultado

			// Si la opción 2 es 0
			// Mostrar menú principal

			// Si es otra opción 2
			// Mostrar mensaje de erro
			// Mostrar menú principal

			// Si la opción es 0
			// SAlir del programa

			// Si es otra opción
			// Mostrar mensaje de error
		}
	}

	private static void pedirDenominador2() {
		// TODO Auto-generated method stub

	}

	private static void pedirNumerador2() {
		// TODO Auto-generated method stub

	}

	private static void pedirDenominador1() {
		// TODO Auto-generated method stub

	}

	private static void pedirNumerador1() {
		// TODO Auto-generated method stub

	}

	private static void mostrarResultado(Numeros resultado) {
		if (resultado != null) {
			System.out.println("El resultado de la operación es" + resultado);
		}
	}

	private static void pedirValor2() {
		System.out.println("Introducir el valor del segundo operando");
	}

	private static void pedirValor1() {
		System.out.println("Introduzca valor del primer operando");
	}

	private static void escribirSubmenu() {
		System.out.println("Tipos de numeros\r\n" + "1. Numeros enteros\r\n" + "2. Racionales\r\n" + "0. Salir");
		System.out.println();
	}

	private static int leerInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();

	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
	}

	private static void escribirMenu() {
		System.out.println("CALCULADORA\r\n" + "1. Suma\r\n" + "2. Resta\r\n" + "3. Producto\r\n" + "4. División\r\n"
				+ "0. Salir");
	}

}
