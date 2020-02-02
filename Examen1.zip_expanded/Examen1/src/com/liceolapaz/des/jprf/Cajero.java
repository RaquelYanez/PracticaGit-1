package com.liceolapaz.des.jprf;

import java.util.Scanner;

public class Cajero {



	

	


//---------------------------------------------------------------------------
	public static void main(String[] args) {
		CuentaBancaria cuenta = null;
		while (true) {
			escribirMenu();
			pedirOpcion();
			int opcion = leerOpcion();
			
			switch (opcion) {
			case 0:
				System.exit(0);
			
			case 1:
				escribirSubmenu();
				pedirOpcion();
				int opcion2 = leerOpcion();
				
				switch (opcion2) {
				case 1:
					pedirSaldoInicial();
					double saldoInicialNormal = leerCantidad();
					cuenta = new CuentaNormal(saldoInicialNormal);
					break;
			
				case 2:
					pedirSaldoInicial();
					double saldoInicialPremium = leerCantidad();
					cuenta = new CuentaPremium(saldoInicialPremium);
					break;
				
				case 0:
					break;
				default:
					System.out.println("Opcion no valida");
				}
				break;
			
			case 2:
				if (cuenta == null) {
					System.out.println("No hay ninguna cuenta activa");
				} else {
					pedirCantidadIngresar();
					double cantidad = leerCantidad();
					cuenta.ingresarDinero(cantidad);
					System.out.println("El saldo de la cuenta es " + cuenta.consultarSaldo());
				}
				break;
			case 3:
				if (cuenta == null) {
					System.out.println("No hay ninguna cuenta activa");
				} else {
					pedirCantidadRetirar();
					double cantidad = leerCantidad();
					cuenta.retirarDinero(cantidad);
					System.out.println("El saldo de la cuenta es " + cuenta.consultarSaldo());
				}
				break;
			case 4:
				if (cuenta == null) {
					System.out.println("No hay ninguna cuenta activa");
				} else {
					System.out.println("El saldo de la cuenta es " + cuenta.consultarSaldo());
				}
				break;
			default:
				System.out.println("Opcion no volida");
			}
		}
	}

	private static void pedirCantidadIngresar() {
		System.out.print("Escriba la cantidad a ingresar: ");
	}

	private static void pedirCantidadRetirar() {
		System.out.print("Escriba la cantidad a retirar: ");
	}
	private static double leerCantidad() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
	private static void pedirSaldoInicial() {
		System.out.print("Escriba el saldo inicial: ");
	}
	private static void escribirSubmenu() {
		System.out.println("\r\nTipo de cuenta\r\n" + "1. Cuenta normal\r\n" + "2. Cuenta Premium\r\n" + "0. Cancelar");
	}
	
	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	private static void pedirOpcion() {
		System.out.print("Escoja una opcion: ");
	}

	private static void escribirMenu() {
		System.out.println("\r\nBANCO\r\n" + "1. Crear cuenta\r\n" + "2. Ingresar dinero\r\n" + "3. Retirar dinero\r\n"
				+ "4. Consultar saldo\r\n" + "0. Salir");
	}
}
