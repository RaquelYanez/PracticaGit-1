package examen;

import java.util.Scanner;

public class CajeroDisparador {

	public static void main(String[] args) {
		CuentaBancaria cuenta = null; // declaramos variable cuenta
		while (true) {// usamos el while para el menu para que vuelva a empezar en caso de salir y
						// introducir datos erroneos

			// menu principal
			escribirMenu();// menú 1
			pedirOpcion(); // menu 2 tipo cuenta
			// añadimos variable para guardar la opción elegida
			int opcion = leerOpcion();

			// Usaremos un Switch de casos para cada cuenta---------------
			switch (opcion) {
			// primero usaremos el case 0 para salir del programa si elegimos la opcion 0
			case 0:
				System.exit(0); /*
								 * system exit se usa en caso que solo queramos salir sin tener que comparar las
								 * opciones
								 */
			case 1:
				escribirSubmenu();
				// usaremos el metodo anterior de pedirOpcion para ahorrar lineas ya que nos
				// vale igualmente aqui
				pedirOpcion();
				// al igual que en el primer menu usaremos variable para guardar la opcion nueva
				int opcion2 = leerOpcion();
				// dentro de este caso añadiremos otro switch con la nueva opcion y las cuentas
				switch (opcion2) { // tipos de cuentas
				case 1:
					// se nos pide que al iniciar nuestro bank le indiquemos el saldo inicial y
					// creará dicha cuenta
					pedirSaldoInicial();
					// creamos un metodo CUENTA NORMAL que lea la cantidad introducida, haremos un
					// double ya que es lo que se pide
					double saldoInicialNormal = leerCantidad();
					// creamos la clase cuentaNormal
					cuenta = new CuentaNormal(saldoInicialNormal);// guarda el saldo introducido para crear cuenta
					break;

				case 2: // es exactamente igual que el primero ya que responden a la misma funcionalidad
					pedirSaldoInicial();// usaremos los mismos metodos par aaprovechar espacio
					double saldoInicialPremium = leerCantidad();
					cuenta = new CuentaPremium(saldoInicialPremium);
					break;

				case 0: // caso de introducir una opcion que no exista imprimir mensaje
					break;
				default:
					System.out.println("Elja una opcion valida: ");

				}
				break;

			case 2: // opcion de ingreso de dinero
				if (cuenta == null) { // comparamos op1 y op2 son iguales? true. no son iguales? false. en este caso
										// nos da un false e imprime
					System.out.println("No hay cuentas activas");
					// entoces creamos metodo de pedir cantidad a ingesar
					pedirCantidadIngresar();// solo imprimira mensaje de dinero a ingesar
					double cantidad = leerCantidad();
					cuenta.ingresarDinero(cantidad);
					System.out.println("El saldo de su cuenta es: " + cuenta.consultarSaldo());

				}
				break;
			case 3:// opcion de retirar dinero
				if (cuenta == null) {
					System.out.println("No hay cuentas activas");
				} else {
					pedirCantidadRetirar();
					double cantidad = leerCantidad();
					cuenta.retirarDinero(cantidad);
					System.out.println("El saldo de su cuenta es: " + cuenta.consultarSaldo());

				}
				break;
			case 4:
				if (cuenta == null) {
					System.out.println("No hay cuentas activas");
				} else {
					System.out.println("El saldo de su cuenta es" + cuenta.consultarSaldo());

				}
				break;
			default:
				System.out.println("Opción no valida");
			}
		}
	}

	private static void pedirCantidadRetirar() {
		System.out.println("Escriba la cantidad a retirar: ");

	}

	private static void pedirCantidadIngresar() {
		System.out.println("Escriba la cantidad a ingresar: ");
	}

	private static double leerCantidad() { //
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble(); // en este caso nos dvuelve un nextDouble por la cantidad de digitos
	}

	private static void pedirSaldoInicial() { // simplemente le mandaremos impimir el mensaje
		System.out.println("Indique el saldo inicial: ");
		// TODO Auto-generated method stub

	}

	private static void escribirSubmenu() {// entramos en los casos y escibimos el submenu para elegir cuenta o salir
		System.out.println("\r\nTipo de cuenta\r\n" + "1. Cuenta normal\r\n" + "2. Cuenta Premium\r\n" + "0. Cancelar");

	}

	private static int leerOpcion() {
		// Añadismo Scanner para leer la opción que introducimos por teclado que nos
		// devolverá el scaner next int para pasar a la siguiente linea
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void pedirOpcion() {// este metodo al igual que el anterior solo imprimirá un mensaje para el
										// usuario y elegir una accion
		System.out.println("Elija una opción: ");

	}

	private static void escribirMenu() { // este será nuestro escribirMenu principal
		System.out.println("\r\nBANCO\r\n" + "1. Crear cuenta\r\n" + "2. Ingresar dinero\r\n" + "3. Retirar dinero\r\n"
				+ "4. Consultar saldo\r\n" + "0. Salir");
	}

}
