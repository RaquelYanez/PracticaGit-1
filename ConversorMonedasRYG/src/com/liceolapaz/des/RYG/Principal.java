package com.liceolapaz.des.RYG;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Moneda moneda = null;
		while (true) { // loop para vonver a emepzar cada vez que termina hasta que la ppción sea 0
			escribirMenu();
			Scanner scan = new Scanner(System.in); // leer lo introducido en consola

			int opcion = leerInt(scan); // extraer metodo en refractor
			// System.out.println(opcion);

			// leer opcion

			if (opcion == 0) {
				System.out.println("Hasta pronto");
				System.exit(0);
			}

			switch (opcion) {
			case 0:
				System.exit(0);
				
			case 1:

				System.out.println("Introduzca la cantidad: ");

				Yen yen1 = new Yen(); // construimos objeto uno de
				yen1.cantidad = scan.nextDouble(); // coge el texto introducido por teclado y lo guarda en cantidad

				System.out.println(yen1.cantidadEnEuros()); // resultado metodo de la clases Yen
				System.out.println("");

				break;

			case 2:

				System.out.println("Introduzca la cantidad: ");

				Libra libra1 = new Libra();
				libra1.cantidad = scan.nextDouble();

				System.out.println(libra1.cantidadEnEuros());
				System.out.println("");
				break;

			case 3:

				System.out.println("Introduzca la cantidad: ");

				Dolar dolar1 = new Dolar();
				dolar1.cantidad = scan.nextDouble();

				System.out.println(dolar1.cantidadEnEuros());
				System.out.println("");
				break;

			// declarados los objetos hago el menu principal

			default:
				System.out.println("Opcion no válida");
			}

		}

	}

	private static int leerInt(Scanner scan) {
		return scan.nextInt();

	}

	private static void escribirMenu() {
		System.out.println("\r\nCONVERSOR DE MONEDAS\r\n" + "1. Dólares\r\n" + "2. Libras\r\n" + "3. Yens\r\n"
				+ "0. Salir\r\n" + "Escoja una opción: ");
	}

}
