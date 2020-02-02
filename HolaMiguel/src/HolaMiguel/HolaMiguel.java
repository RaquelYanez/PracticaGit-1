package HolaMiguel;

import java.util.Scanner;

public class HolaMiguel {

	public static void main(String[] args) {
		//pedirle el nombre al usuario
		pedirNombre ();/*llamar a un metodo desde main empeiza con
		minuscula la segunda palabra mayus*/
		//leer nombre del usuaario y guardarlo en una variable
		String nombreUsuario = leerNombre();//nombre de ususario es variable y string es una variable de tipo clase
		//que muestre el mensaje en pantalla 
		mostrarMensaje(nombreUsuario);
	}

	private static void mostrarMensaje(String nombreUsuario) {
		System.out.println("WelcomeToTheJungle" + nombreUsuario + "!");		
	}

	private static String leerNombre() {
		Scanner scan = new Scanner(System.in);/*sourcclase escaner, se utiliza para 
		escuchar al teclado y guardar lso datos cunado tecleemos */
		String nombreUsuario = scan.nextLine();
		return nombreUsuario; //como no sabe que string quiere devolver nos da un null
	
	}

	private static void pedirNombre() {
		System.out.print("Escriba su nombre: "); //print hace lo mismo que el ln pero lee donde el ususario dejo d escribir
	
	}

}
