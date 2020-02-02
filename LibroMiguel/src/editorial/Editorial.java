package editorial;

import autor.Autor;
import libro.Libro;

/*  Crear una clase Editorial con las siguientes propiedades: 
 *  1 Propiedades (encapsuladas): * - Nombre * - Presupuesto 
 *  2 Constructor vacío. 
 *  3 Constructor parametrizado. 
 *  4 Getters y Setters (a mano). 
 *
 *  5 EncargarUnLibro => un autor 
 *  El método "EncargarUnLibro" será llamado desde la clase 
 *  principal. 
 *  - Hay que recordar que a un método lo invocará un objeto 
 * de la clase a la que pertenezca ese método.
 *   - A la hora de pensar qué información necesitaremos tenemos 
 *   que preguntarnos: 
 *   => ¿Qué autor va a escribir el libro? 
 *   => ¿Cuál será el título que quiere darle la editorial? 
 *   => ¿Cuántas páginas tendrá que tener el libro?
 *    Estas preguntas se resolverán pasando la información por parámetro 
 *    Modificar el valor de la propiedad ISBN del objeto libro creado y 
 *    que tenga un valor distinto a null. 
 *   6 hacer que al encargar un libro al autor, la editoria
 *   debapagar x dinero al autor
 *   7 hacer que los autores tenga un convenico ocletcitvo por el que cobraran por cda trabajo en funcion delnumero de paginas
 *   que encarguen las editoriales, ademas se reservaran el derecho de escogfer el titulo de la obra
 * ------------------------AÑADIDO LUZ-----------------------------------
 * Convenio colectivo > si el libro e suna novela: (recordar numerdo)
 * 					pagina sera 1 euro
 * 				si el librp es una comedia
 * 					pagina sera 1.5e
 * 				si el libro es una obra de teatro
 * 					pagina sera 0.25e
 * 
 * PROPUESTA
 * 8 Arreglar el codigo para qu cuando la editorial pidan un libro aparezca, y este libro
 * sea escrito por el autor aparezca el tipo de libro seteado en la propiedad den objeto libro
 * 
 * 9 hacer que la propiedad tipo de la clase Lbibro sea un enumerado
 * 
 * 10 Crear una clase revista con isbn, titulo, editorial, y tipo
 * con constructor parametrizado y vacio., getters y setters
 * 
 */
public class Editorial {

	private String nombre;
	private double presuspuesto;

	public Editorial() {

	}

	public Editorial(String nombre, double presupuesto) {
		this.nombre = nombre;
		this.presuspuesto = presupuesto;

	}

	public String getNombre() {
		return this.nombre;

	}

	public void setNombre() {
		this.nombre = nombre;
	}

	public double getPresuspuesto() {
		return this.presuspuesto;

	}

	public void setPresuspuesto(double presuspuesto) {
		this.presuspuesto = presuspuesto;
	}

	public Libro encargarLibro(Autor autor, int paginas, String tipo) {
		//autor.ingresarPorTrabajo(paginas, tipo);
		this.presuspuesto = this.presuspuesto - autor.ingresarPorTrabajo(paginas, tipo); 
		// esto de debajo nos devuelve un libro
		return autor.escribir(paginas);

	}

	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", presuspuesto=" + presuspuesto + "]";
	}

}
