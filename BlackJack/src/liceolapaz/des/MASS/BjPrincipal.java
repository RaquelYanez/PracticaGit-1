package liceolapaz.des.MASS;

import java.util.Random;
import java.util.Scanner;

public class BjPrincipal {
	// ----------CUERPO----------------------
	public static void main(String[] args) {
		
		int numBanca = 0;
		int numJugador = 0;
		private int numeroAleatorio;
		int suma = 0;//numeroAleatorio = (int) (Math.random() * 21) + 1;
		// Crear menú de modos Bj
		escribirMenu();// Pedir Opcion
		int opcion = leerOpcion();// Leer opcion y guardar en variable
		int numeroAleatorio = generarNumeroAleatorio();
		suma = suma + numeroAleatorio;
		if (opcion == 1) {

			System.out.println("La banca ha obtenido: " + suma + "\n");
			while (suma < 15) {
				int puntuacion = 0;
				puntuacion = puntuacion + numeroAleatorio;

			}
			//while (numIntentos < maxIntentos) {

				jugar(3, 15, 21); // numero de intentos - numero minimo -numero maximo
				introducirNumero();
				int introducirNumero = 0;
				int numero = introducirNumero + suma;

				int numeroUsuario = leerNumero();
			}
		}
	

	private static void leerNumero() {
		// TODO Auto-generated method stub

	}

	private static void introducirNumero() {
		System.out.println("Introduzca un numero: ");
	}

	private static void jugar(int numIntentos, int numMinimo, int numMaximo) {
		// TODO Auto-generated method stub

	}

	private static int generarNumeroAleatorio() {
		Random rand = new Random();
		return rand.nextInt();
	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		return opcion;
	}

	private static void escribirMenu() {
		System.out.println("Black Jack \n" + "1.Modo fácil\n" + "2. Modo normal\n" + "0. Salir\n" + "Elija modo: ");

	}

}
