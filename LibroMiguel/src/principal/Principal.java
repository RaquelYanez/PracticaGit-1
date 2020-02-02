package principal;

import autor.Autor;
import editorial.Editorial;
import libro.Libro;

/*  Propuesta:
	 *  Crear getters and setter de la clase libro
	 *   modificar clase libro para que la propiedad
	 *  "ator" no sea un string, hay que hacer que sea de tipo Autor
	 *  => nos olbiga a cambiar codigo en el contruscoy
	 *  y en los getters and setterns en la propiedad "autor"
	 */
public class Principal {

	public static void main(String[] args) {
//Para crear objetos > declaración de variable y asignar a new y llamar al contructor
		//Declaración de variable =  asignamos a new y llamada al constructorau
		Autor autorcillo          = new Autor ("Plutarco", "Butes", 89);
		Autor autorMaster = new Autor ("Manuel", "Rico Lopez", 74);
		Autor autorPlagio = new Autor ("Manolo", "deOlivera", 80);
		//Debemos crear un objeto libro puesto que no existe en java
		//será parametrizado        this.isbn   (objetos autor)this.titulo  this...............
		Libro libreto = new Libro ( autorcillo ,100);
		Libro librillo = new Libro ( autorMaster, 1000);
		Libro libraco = new Libro ( autorPlagio, 9000);
		//Recordar que se debe importar la clase libro para poder llamarla
		//No olvidar guardar la clase libro, sino no podremos llamarla
		
		
		
		/*System.out.println(autorcillo.escribir("clases jodidas", 9000));
		Libro libroJodido = autorcillo.escribir("clases puñeteras", 1111111);
		libroJodido.setIsbn("ggg4444");
		*/
		
		//System.out.println("libro despues de dar valor a su propiedad ISBN: " + libroJodido);
		
		Editorial gallo = new Editorial ("Gallo", 200000);
		Editorial editorial2 = new Editorial ("Pollo", 100000);
		
		System.out.println("autorcillo antes de escribir libro 4: " + autorcillo);
		System.out.println("editorial antes de encargar libro 4: " + gallo);
		Libro libro4 = gallo.encargarLibro(autorcillo, 10000, "comedia");
		
		autorcillo.bautizarObra( "Primera obra", libro4);
		System.out.println(libro4);
		System.out.println("autorcillo despues de escribir liro4: " + autorcillo);
		System.out.println("editorial despues de encargar libro4: " + gallo);
		libro4.setIsbn("EEE1544545");
		System.out.println("libro4 con nuevo sibn: " + libro4);
		
		//---------AÑADIDIO DEspues de corte deluz-----
		editorial2.encargarLibro(autorcillo, 1000, "novela");
		System.out.println("autorcillo después de trabajar con editorial2: " + autorcillo);
		
		editorial2.encargarLibro(autorcillo, 100, "novela");
		autorcillo.bautizarObra("segunda obra", libro4 );
		System.out.println("autora1 después de trabajar con editorial2: "+ autorcillo);
		//System.out.println(gallo.encargarLibro(autorcillo, "Muchacha de dos cabezas", 500));
		
		
		
		/*
		//Usar el toString en el print para que nos devuelva los valores requeridos
		System.out.println(libreto.toString());
		
		
		//imprimir la llamada al isbn mediante un get
		System.out.println(libreto.getIsbn());
		
		//modificar mediante el set al libro su isbn
		*/
	
	}

}
