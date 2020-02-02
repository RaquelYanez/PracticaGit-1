package com.liceolapaz.MASS;

import java.util.Scanner;

public class MenúPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		figurasGeometricas();
		//Si se escoge cualquiera de las cuatro primeras opciones
		pedirFigura();
		int figura = leerInt();
	 	
pedirBase();
	obtenerArea();
	}
	private static void obtenerArea() {
		// TODO Auto-generated method stub
		
	
	} 
	


	private static void pedirBase() {
		System.out.println("Escriba el valor del primer lado:  ");
		
	}
	private static int leerInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void pedirFigura() {
		System.out.println("Escoger Figura: ");// Creamos selector para elección del usuario
	}

	private static void figurasGeometricas() {
		System.out.println("FIGURAS\r\n" + "1. Triángulo\r\n" + "2. Rectángulo\r\n" + "3. Pentágono\r\n"
				+ "4. Cuadrado\r\n" + "0. Salir");// Creamos menú 1 para dar las figuras
	}

}
