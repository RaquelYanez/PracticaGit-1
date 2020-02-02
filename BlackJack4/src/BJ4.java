import java.util.Random;
import java.util.Scanner;

public class BJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		int puntuacionJugador = 0;
		int cartaJugador = 0; 
		int opcion2 = 0;
		int i = 1;
		int puntuacion = aleatorio.nextInt(11 - 1 + 1) + 1;
		int i2 = 1;
		
		
		while (true) {//global 

		System.out.println(
		"BLACKJACK\n" + "1. Modo fácil\n" + "2. Modo normal\n" + "0. Salir\n" + "Escoja una opción: " );

		int opcion1 = sc.nextInt();
		if (opcion1 < 0 || opcion1 > 2) {//si no es una opcion validad error
		mostrarError();
		//break;
		continue;//si usamos break terminaria pero asi vuelve al inicio
		}

		if (opcion1 == 0) {
		System.exit(0);//sale del juego
		}
		
		
		puntuacion = 0;
		i = 1;
		
		while (puntuacion < 15) { //puntuación de la maquina

		puntuacion = puntuacion + aleatorio.nextInt(11 - 1 + 1) + 1;
		i++;
		}


		if (opcion1 == 1) {
		System.out.println("El Croupier ha obtenido " + puntuacion + " puntos en " + i + " intentos"+"\r\n");//puntuacion y numero de intentos
		

		}


		cartaJugador = aleatorio.nextInt(11 - 1 + 1) + 1;
		puntuacionJugador = 0;
		i2 = 0;
		puntuacionJugador = puntuacionJugador + cartaJugador;
		mostrarCartaPunt(puntuacionJugador, cartaJugador);
		if (puntuacion >= 21) {
		System.out.println("El croupier ha sacado 21 puntos o más , has ganado!"+"\r\n");

		continue;
		}
		opcion2 = mostrarMenuJuego(opcion2, sc);

		while (opcion2 < 1 | opcion2 > 2) {
		mostrarError();
		opcion2 = mostrarMenuJuego(opcion2, sc);


		}

		while (opcion2 == 1) {//seguir jugando? 
		cartaJugador = aleatorio.nextInt(11 - 1 + 1) + 1;
		puntuacionJugador = puntuacionJugador + cartaJugador;
		i2++;//cuenta intentos

		if (puntuacionJugador > 21) {
		System.out.println("Has perdido! Tu puntuación es mayor que 21 " + "(" + puntuacionJugador + ")"+"\r\n");

		break;
		} else if (puntuacionJugador == 21) {
		System.out.println("Has ganado! Tu puntuación es 21."+"\r\n");

		break;

		}

		mostrarCartaPunt(puntuacionJugador, cartaJugador);
		opcion2 = mostrarMenuJuego(opcion2, sc);
		while (opcion2 < 1 | opcion2 > 2) {
		mostrarError();
		opcion2 = mostrarMenuJuego(opcion2, sc);
		}
		}

		if (opcion2 == 2) {
		if (puntuacionJugador > puntuacion) {
		System.out.println("Has ganado al Croupier!"+"\r\n");
		continue;
		} else if (puntuacionJugador < puntuacion) {
		System.out.println("Has perdido, el Croupier ha sacado mayor puntuación que tú!"+"\r\n");
		continue;
		} else if (puntuacionJugador == puntuacion) {
		if (i > i2) {
		System.out.println("Has ganado al Croupier!"+"\r\n");
		continue;
		}
		else if (i < i2) {
		System.out.println(
		"Has perdido, sacaste la misma puntuación que el Croupier, pero el ha necesitado menos intentos que tú!"+"\r\n");
		continue;
		} else {
		System.out.println("Has ganado! (Empate en puntuación e intentos)"+"\r\n");
		continue;
		}

		}

		}

		}

		}



		private static void mostrarError() {
		System.out.println("Introduce una opción válida" +"\r\n");

		}

		private static int mostrarMenuJuego(int opcion2, Scanner sc) {
		System.out.print("¿Seguir jugando?\n" + "1. Sí\n" + "2. No\n" + "Escoja una opción: ");
		opcion2 = sc.nextInt();
		return opcion2;

		}

		private static void mostrarCartaPunt(int puntuacionJugador, int cartaJugador) {

		System.out.println("El número de tu carta actual es " + cartaJugador + ", la puntuación en este momento es "
		+ puntuacionJugador+"\r\n");

		}

		}

