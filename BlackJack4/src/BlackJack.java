import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		while (true) {
			escribirMenu();
			pedirOpcion();
			int opcion = leerInt();// guarda en esta variable la opcion antes elegida
			if (opcion == 0) { // si opcion es igual a cero salimos
				System.exit(0);
			} else if (opcion == 1) { // entonces si op es 1 entra
				int puntuacionCrupier = 0;
				int contadorCrupier = 0;
				while (puntuacionCrupier <= 15) { // mientras puntuacion sea menor o igual a 15
					// creamos otra variable para guardar lo anterior
					int carta = generarNumero(1, 11); // valores min y max
					puntuacionCrupier += carta; // puntCrup = puntCrup + carta
					contadorCrupier++;
				}
				System.out.println("Puntuacion crupier" + puntuacionCrupier);
				int puntuacionUsuario = 0;
				int contadorUsuario = 0;
				int respuestaUsuario = 0;
				do {
					int carta = generarNumero(1, 11);
					puntuacionUsuario += carta;
					contadorUsuario++;
					System.out.println("La carta es: " + carta + ".Puntuación total: " + puntuacionUsuario);
					if (puntuacionUsuario > 21) {
						System.out.println("Has ganado");
						break;
					} else if (puntuacionUsuario == 21) {
						System.out.println("Has ganado");
						break;
					}
					preguntarUsuario();
					respuestaUsuario = leerInt(); // usamos la variable del primer menu para leer otra vez la respuesta

				} while (respuestaUsuario == 1); // si comparacion es cierta entonces sigue jugando si es dos nop
				comprobarResultado(puntuacionUsuario, puntuacionCrupier, contadorUsuario, contadorCrupier);

			}
		}
	}

	private static void comprobarResultado(int puntuacionUsuario, int puntuacionCrupier, int contadorUsuario,
			int contadorCrupier) {
		if (puntuacionUsuario > puntuacionCrupier) {
			System.out.println("Has ganado");
		} else if (puntuacionUsuario < puntuacionCrupier) {
			System.out.println("Has perdido");

		} else if (puntuacionUsuario <= puntuacionCrupier) {
			System.out.println("Has ganado");

		} else {
			System.out.println("Pierdes");
		}
	}

	private static void preguntarUsuario() {
		System.out.println("\r\nSeguir jugando?, \r\n1.Si, \r\n2.No, \r\n0.Salir");

	}

	private static int generarNumero(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min; // nos devuelve esto

	}

	private static int leerInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void pedirOpcion() {
		System.out.println("Escribir menú");
	}

	private static void escribirMenu() {
		System.out.println("\r\nBlack Jack, \r\n1.Modo facil, \r\n2.Modo normal, \r\n0.Salir");
	}

}
