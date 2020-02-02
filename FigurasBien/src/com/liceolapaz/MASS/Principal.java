package com.liceolapaz.MASS;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		while (true) { //mientras la opñción no sea correcta volveremos al menú
		/*escribirMenu();// Escribir el menú del juego*/

		pedirOpcion();// Pedir Opcion

		int opcion = leerOpcion();// Leer opcion y guardar en variable

		if (opcion == 1) {
			int Triangulo = 1;
			int Rectangulo = 2;
			int Pentagono = 3;
			int Cuadrado = 4;
		}

		if (opcion == 0) {
			System.out.println("Hasta pronto");
			System.exit(0);
		}

		escribirFigura(); // Submenú Figura
		pedirFigura(); // selcciona una figura mediante un número
		int figuraUsuario = leerNumero();

		/*
		 * // Según la opción marcada, ejecutar una opción "0 o 1" if (opcion < 0 |
		 * opcion > 2) { System.out.println("Introduzca 1 o 2"); //opcion uno
		 */

//----------------------------------------	

		switch (figuraUsuario) {

		case 1: {
			pedirAltura();
			double altura = leerValor();
			pedirBase();
			double base = leerValor();
			pedirlado1();
			double lado1 = leerValor();
			pedirlado2();
			double lado2 = leerValor();
			// llama a los metodos abastractos con la clase triangulo
			Triangulo triangulo1 = new Triangulo(base, lado1, lado2, altura);

			double area = triangulo1.obtenerArea();

			double perimetro = triangulo1.obtenerPerimetro();
			resultado(perimetro, area);

			break;
		}
//----------------------------------------	
		case 2: {
			pedirAltura();
			double altura = leerValor();
			pedirBase();
			double base = leerValor();

			Rectangulo rectangulo = new Rectangulo(base, altura);
			double area = rectangulo.obtenerArea();
			double perimetro = rectangulo.obtenerPerimetro();
			resultado(perimetro, area);

			break;
		}
//----------------------------------------	

		case 3: {
			pedirAltura();
			double lado = leerValor();
			pedirApotema();
			double apotema = leerValor();

			Pentagono pentagono = new Pentagono(lado, apotema);
			double area = pentagono.obtenerArea();
			double perimetro = pentagono.obtenerPerimetro();
			resultado(perimetro, area);

			break;
		}
//----------------------------------------	

		case 4: {
			pedirAltura();
			double lado = leerValor();

			Cuadrado cuadrado = new Cuadrado(lado);
			double area = cuadrado.obtenerArea();
			double perimetro = cuadrado.obtenerPerimetro();
			resultado(perimetro, area);

			break;
		}
		// ----------------------------------------------------------------//
		
		default: //cualquier opcion que no esté realizada en el switch ya interpreta como un error
		

			/*if (opcion > 4) { // IF el número de figura seleccionado es mayor de los listado >4 ELSE nos dará
								// un mensaje de error
				// System.exit(0);
			}

			else {*/
				System.out.println("Opcion no valida. Elija otra opción");


		}
	}
	}

	private static void pedirApotema() {
		System.out.println("Valor de la apotema es: ");
	}

	private static void resultado(double perimetro, double area) {
		System.out.println("El resultados del área es: \n" + area + " El resultado del perimetro es; " + perimetro);
	}

	private static void pedirlado2() {
		System.out.println("Valor lado2 es: ");
	}

	private static void pedirlado1() {
		System.out.println("Valor lado1 es: ");
	}

	private static double leerValor() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void pedirBase() {
		System.out.println("Escribir valor de la base de la figura: ");

	}

	private static void pedirAltura() {
		System.out.println("Escribir valor de la altura de la figura: ");
	}

	private static int leerNumero() { // lee el número seleccionado y pasa a la siente
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void pedirFigura() { // pide la opción que queramos
		System.out.println("Escoja una opción: ");

	}

	private static void escribirFigura() { // Escribe menú para la lista de figuras
		System.out.println("ESCOJA DE FIGURAS\r\n" + "1. Triángulo\r\n" + "2. Rectángulo\r\n" + "3. Pentágono\r\n"
				+ "4. Cuadrado\r\n" + " 0. Salir\r\n");

	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		return opcion;
	}

	private static void pedirOpcion() {
		System.out.println("FIGURAS GEOMETRICAS \n 1. Entrar" + " 0. Salir");

	}

	/*private static void escribirMenu() {
		System.out.print("Hallar valores: " + "\r\n");
	}*/

}
