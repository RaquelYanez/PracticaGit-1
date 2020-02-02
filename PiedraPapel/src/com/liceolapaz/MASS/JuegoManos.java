package com.liceolapaz.MASS;
import java.util.Random;
import java.util.Scanner;

public class JuegoManos {

	public static void main(String[] args) {
		while(true) {
		//Escribir menu 1 jugar 0 salir
		escribirMenu();
		//Perdir opcion piedra papel tijera lagarto spock
		pedirOpcion();
		//Leer opcion  elegida de las 5 y guardar en variable 
		int opcion = leerOpcion();
		//----------------------------------------------------------------//

		//opcion uno 
		if (opcion == 1) {
			int Piedra = 0;
			int Papel = 1;
			int Tijeras = 2;
			int Lagarto = 3;
			int Spock = 4;
			
			int manoAleatoria = generarManoAleatoria(Piedra, Papel, Tijeras, Lagarto, Spock);{
				//Variable para que la máquina elija alguna de las manos declaradas anteriormente
				
			}
		escribirMano(); //Submenú manos
		pedirMano(); //selcciona una mano mediante un número
		int manoUsuario = leerNumero(); 
		
		switch (manoUsuario) {
		case 0: //En los 4 casos cada caso comparará la mano seleccionada con la "random" de la máquina
			if (manoAleatoria == 0) { System.out.println("Empate, el ordenador habia jugado: Piedra" ); }
		 	if (manoAleatoria == 1) { System.out.println("Derrota, el ordenador habia jugado: Papel");}
			if (manoAleatoria == 2) { System.out.println("Victoria, el ordenador habia jugado: Tijeras"); }
			if (manoAleatoria == 3) { System.out.println("Victoria, el ordenador habia jugado: Lagarto"); }
			if (manoAleatoria == 4) { System.out.println("Derrota, el ordenador habia jugado: Spock");}
			break;
			
		case 1:
			if (manoAleatoria == 0) { System.out.println("Victoria, el ordenador había jugado: Piedra" ); }
		 	if (manoAleatoria == 1) { System.out.println("Empate, el ordenador había jugado: Pape" );}
			if (manoAleatoria == 2) { System.out.println("Derrota, el ordenador había jugado: Tijeras" ); }
			if (manoAleatoria == 3) { System.out.println("Derrota, el ordenador había jugado: Lagarto" ); }
			if (manoAleatoria == 4) { System.out.println("Victoria, el ordenador había jugado: Spock" );}
			break;
		case 2:
			if (manoAleatoria == 0) { System.out.println("Derrota, el ordenador había jugado: Piedra"); }
		 	if (manoAleatoria == 1) { System.out.println("Victoria, el ordenador había jugado: Pape");}
			if (manoAleatoria == 2) { System.out.println("Empate, el ordenador había jugado: Tijeras" ); }
			if (manoAleatoria == 3) { System.out.println("Victoria, el ordenador había jugado: Lagarto" ); }
			if (manoAleatoria == 4) { System.out.println("Derrota, el ordenador había jugado: Spock");}
			break;
		case 3:
			if (manoAleatoria == 0) { System.out.println("Derrota, el ordenador había jugado: Piedra" ); }
		 	if (manoAleatoria == 1) { System.out.println("Victoria, el ordenador había jugado: Pape" );}
			if (manoAleatoria == 2) { System.out.println("Derrota, el ordenador había jugado: Tijeras" ); }
			if (manoAleatoria == 3) { System.out.println("Empate, el ordenador había jugado: Lagarto"); }
			if (manoAleatoria == 4) { System.out.println("Victoria, el ordenador había jugado: Spock");}
			break;
		case 4:
			if (manoAleatoria == 0) { System.out.println("Victoria, el ordenador había jugado: Piedra" ); }
		 	if (manoAleatoria == 1) { System.out.println("Derrota, el ordenador había jugado: Pape" );}
			if (manoAleatoria == 2) { System.out.println("Victoria, el ordenador había jugado: Tijeras" ); }
			if (manoAleatoria == 3) { System.out.println("Derrota, el ordenador había jugado: Lagarto" ); }
			if (manoAleatoria == 4) { System.out.println("Empate, el ordenador había jugado: Spock");}
			break;
			
			
			//----------------------------------------------------------------//

		default:{
			switch (manoAleatoria) {
			case 0:{
				System.out.println("Jugada no permitida. El ordenado había jugado: piedra");}
				break ;
				case 1:{
					System.out.println("Jugada no permitida. El ordenado había jugado: papel");
				} break;
				case 2: {
					System.out.println("Jugada no permitida. El ordenado había jugado: tijera");
				}
				case 3: {
					System.out.println("Jugada no permitida. El ordenado había jugado: lagarto");
				}
				case 4:{
					System.out.println("Jugada no permitida. El ordenado había jugado: spock");
				}
				default:
					
				}
			
			}
		} }
		else if(opcion == 2) {
			menuTodo();
			}
	
		else if (opcion == 0) {
			System.out.println("SAYONARA BABY");
			System.exit(0);
		} else {
			System.out.println("Opcion no valida");
		}
		
		}
	
	}


	
	private static void menuTodo() {
		System.out.println("cosas");
		
	}



	private static void pedirMano() {
		System.out.println("“Escriba su jugada: ");
		
	}




	private static int generarManoAleatoria(int Piedra, int Papel, int Tijeras, int Lagarto, int Spock) {
		Random rand = new Random();
		return rand.nextInt(4);
	}

	private static int leerNumero() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

		
	

	private static void escribirMano() {
		System.out.println("ESCOJA SU MANO\r\n" +
				"0. Piedra\r\n"+
				"1. Papel\r\n"+
				"2. Tijeras\r\n" +
				"3. Lagarto\r\n" +
				"4. Spok\r\n");
				
		
	}
//----------------------------------------------------------------//
	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt(); 
		return opcion;
	}

	private static void pedirOpcion() {
		System.out.println("Escoja una opción: ");
		
	}

	private static void escribirMenu() {
		System.out.println("PIEDRA PAPEL TIJERAS LAGARTO SPOCK\r\n" + 
				"1. Jugar\r\n" + 
				"0. Salir\r\n");
	}

}