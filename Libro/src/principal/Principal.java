package principal;

import autor.Autor;
import libro.Libro;

public class Principal {

	public static void main(String[] args) {
		
		//Object objeto; este es generico por eso hacemos el siguientes crando el objeto libro
		
		Libro librito = new Libro ("IES123456", "Clases Java", "Miguel Unamuno", 1000);
		Libro tocho = new Libro ("IES5555", "Clases bases", "Miguel Cervantes", 80000);
		Libro tochete = new Libro ("IES55", "Clases entornos", "Miguel Bauhaus", 805000);
		Autor autor1 = new Autor ("Javier", "Guisasola", 80);
				System.out.println(librito.toString());
		
		System.out.println(librito.getIsbn()); 
		
		librito.setIsbn ("IES999999999");
		tocho.setIsbn("TRE55555455");
		tochete.setIsbn ("TRE1563");
	}

}
