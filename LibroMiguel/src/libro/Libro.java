package libro;

import autor.Autor;

public class Libro {
//Principalmente deben añadirse atributos encapsulados para evitar el acceso de otras clases a estos
	// Recordad que todo lo que empiece por mayúscula también son clases clase
	// String en este caso
	private String isbn;
	private String titulo;
	private Autor autor;
	private int paginas;
	//---------------AÑADIDO luz-----------
	public Enum tipo;
	

	// Debe crearse el constructor para hacer la llamada desde la clase >principal<
	// siempre publico para accder a este
	public Libro(String isbn, String titulo, Autor autor, int paginas, Enum tipo) {
		// para poder llamarlo usamos >this< para hacer referencia a lo que está
		// llamando desde la principal
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.tipo = tipo;
	}
	public Libro (Autor autor, int paginas) {
		this.autor = autor;
		this.paginas = paginas;

		/*
		 * Llamada al metodo String > toString Que tipo de dato nos retorna el metodo >
		 * String Usar un nombre identificativo para no liarnos y publico > String
		 * getIsbn El metodo necesita de algún parametro? No, se lo estamos dando desde
		 * la principal
		 */

	}

	
	
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", tipo="
				+ tipo + "]";
	}
	public String getIsbn() {
		return this.isbn;/*
 * Recordar que los gettes and settes son bloques individuales
 * Siempre deben retornar algo en esto caso un this.isbn que será 
 * el encargado de pedir el devolver el ISBN que está parametrizado 
 */
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String bautizarLibro(String titulo) {
	this.titulo = titulo;
		return this.titulo;
}
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Enum getTipo() {
		return tipo;
	}
	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	
	}

}
