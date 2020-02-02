package JuegoCartas;

import java.util.Random;
import java.util.Scanner;

public class Blackjack2 {

	public static void main(String[] args) {
		// Declaramos todas las variables antes del cuerpo
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numBanca = 0;//puntuacion crupier
		int numJugador = 0;//puntuacion de jugador
		int numeroAleatorio;
		int suma = numeroAleatorio = (int) (Math.random() * 21) + 1;
	}

	// Crear menú de modos Bj
	// Escribir menu 1 jugar 0 salir
	escribirMenu();

	// Perdir opcion de juego facil normal o salir
	pedirOpcion();

	int opcion = leerOpcion(); // Leer opción y guardarla en la variable opcion
	// Introducir numer usuario
	if(opcion==1)
	{

		System.out.println("La banca ha obtenido: " + suma + "\n");
	}

	pedirNumero();

	int numero = leerNumero();// lee numero y guarda en variable numero

	/*
	 * if (opcion == 1) { // si la opción es 1 juega facil // while (true) { //
	 * mientras la opción no sea correcta volveremos al menú //while (true) { //
	 * mientras la opción no sea correcta volveremos al menú juego(6, 15, 21, 0);//
	 * int maxIntentos, int min, int max, int suma
	 * 
	 * banca(6, opcion);// int maxIntentos, int opcion } //} else if (opcion == 2) {
	 * 
	 * }
	 * 
	 * else if (opcion == 0) { System.out.println("Hasta pronto"); } }
	 * 
	 * 
	 * private static void juego(int maxIntentos, int min, int max, int suma) { //
	 * System.out.println("Inserte un número: "); // Dependiendo de la opción hacer
	 * lo que sea int numIntentos = 0;
	 * 
	 * // Generar un nº aletorio y guardarlo en una variable int numeroAleatorio =
	 * (int) (Math.random() * 21) + 1; suma = numeroAleatorio + suma; numIntentos++;
	 * 
	 * System.out.println(suma); }
	 * 
	 * private static void banca(int i, int opcion) { int numeroAleatorio = 0; int
	 * numIntentos = 0; int suma = 0;
	 * 
	 * // Generar un nº aletorio y guardarlo en una variable while (suma <= 15 &&
	 * numIntentos < i) { numeroAleatorio = (int) (Math.random() * 21) + 1; suma =
	 * numeroAleatorio + suma; numIntentos++; }
	 * 
	 * if (opcion == 1) { System.out.println("La banca ha obtenido: " + suma +
	 * "\n"); } }
	 */

	private static int leerNumero() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void pedirNumero() {
		System.out.println("Introduzca un número: ");
	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);// lee opción introducida en teclado
		int opcion = scan.nextInt();
		return opcion;
	}

	private static void pedirOpcion() {
		System.out.println("Escoja opción: ");

	}

	private static void escribirMenu() {
		System.out.println("Black Jack \n" + "1.Modo fácil\n" + "2. Modo normal\n" + "0. Salir\n");

	}

}
