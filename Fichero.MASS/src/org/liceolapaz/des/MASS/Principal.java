package org.liceolapaz.des.MASS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
import javax.tools.ForwardingJavaFileObject;

public class Principal {

	public static void main(String[] args) {
		while (true) {
			menuPrincipal(); // hacemos metodo con el menu principal
			int opcion = leerOpcion(); // guardamos en la variable

			switch (opcion) {
			case 0:
				System.exit(0);

			case 1:
				pedirRuta();
				String ruta = leerRuta();
				File fichero = new File(ruta); // psamos la ruta que esta ya en nuestro directorio

				if (!fichero.isFile()) {// es una booleana que nos dirá si es cierto o no que exite el fichero. La
										// exclamacion es negacion
					System.out.println("La ruta: " + ruta + "no es un fichero");

				} else {
					ArrayList<String> contenido = leerTextoFichero(fichero); // Usamos array para que sea más facil
																				// recorret y copiar las lineas
					mostrarContenido(contenido);

				}
				break;
			case 2:
				escribirSubmenu();
				int opcion2 = leerOpcion(); // guardamos en la variable
				if (opcion >= 1 && opcion <= 2) {// si esta entre unod y dos bien

					pedirRutaFicheroOrigen();
					String rutaOrigen = leerRuta();// usamos los mismos metodos de leer ruta y ahorramos lineas
					File ficheroOrigen = new File(rutaOrigen);
					// comprobamos si el fichero existe o no
					if (!ficheroOrigen.isFile())
						; // si no existe imprime
					System.out.println("La ruta: " + rutaOrigen + "no es un fichero");

					pedirRutaFicheroDestino();
					String rutaDestino = leerRuta();
					File ficheroDestino = new File(rutaDestino);
					if (opcion2 == 1) {
						ArrayList<String> contenido = leerTextoFichero(ficheroOrigen);
						// le pasamos el fichero y el destino para que lo escriba y lego hacemos metodo
						escribirFicheroTexto(contenido, ficheroDestino);
					} else {
						// Array list de bytes
						ArrayList<Byte> contenido = leerFicheroBinario(ficheroOrigen);

					}

				} else {
					if (opcion == 0) {
						continue;// no hace falta pero lo dejamos por si quisieramos meter algo en el futuro
					} else {
						System.out.println("Opcion no valida");
						continue;
					}
				}
				break;
			}
		}
	}

	private static ArrayList<Byte> leerFicheroBinario(File ficheroOrigen) {
		ArrayList<Byte> contenido;
		return contenido;
	}

	private static void escribirFicheroTexto(ArrayList<String> contenido, File ficheroDestino) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter(ficheroDestino);
			bw = new BufferedWriter(bw);
			pw = new PrintWriter(bw);

			for (int i = 0; i < contenido.size(); i++) {
				String linea = contenido.get(i);
				pw.print(linea);
				if (i < contenido.size() - 1) {
					pw.println();
				}

			}

			pw.flush();

		} catch (IOException e) {
			System.out.println("Error al escribir el fichero");
		} finally {
			try {
				if (fw == null) {
					fw.close();

				}
			} catch (IOException e) {
				System.out.println("ERROR al escribir el fichero");
			} finally {

			}
		}

	}

	private static void pedirRutaFicheroDestino() {
		System.out.println("Escriba ruta fichero de destino: ");

	}

	private static void pedirRutaFicheroOrigen() {
		System.out.println("Escriba ruta fichero de origen: ");
	}

	private static void escribirSubmenu() {
		System.out.println("Tipo de fichero a copiar\n" + "1. Fichero de texto\n" + "2. Fichero binario\n"
				+ "0. Cancelar\n" + "Escoja una opción:\n" + "");
	}

	private static void mostrarContenido(ArrayList<String> contenido) {
		for (String linea : contenido) { // como es aray lis foreach
			System.out.println(linea);
		}
	}

	private static ArrayList<String> leerTextoFichero(File fichero) {
		ArrayList<String> contenido = new ArrayList<>();
		// ahora hay que leer linea a linea File y meter en el array
		Scanner scan = null;

		try {
			scan = new Scanner(fichero);
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				// añadimos la linea al contenido
				contenido.add(line);

			}

		} catch (FileNotFoundException e) {// si no encuentra este fichero nos lanzará una escepcion
			System.out.println("Error! Fichero no encontrado");

		} finally {
			if (scan == null) { // si scan es distinto a null cierra

				scan.close();
			}
		}
		return contenido;
	}

	private static String leerRuta() {
		Scanner scan = new Scanner(System.in);

		return scan.nextLine();
	}

	private static void pedirRuta() {
		System.out.println("Introduzca ruta del fichero: ");
	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void menuPrincipal() {
		System.out.println("FICHEROS\n" + "1. Leer fichero de texto\n" + "2. Copiar fichero\n"
				+ "3. Listar archivos de directorio\n" + "0. Salir\n" + "Escoja una opción:");
	}

}
