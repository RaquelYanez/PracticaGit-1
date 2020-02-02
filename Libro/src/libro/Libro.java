package libro;
//cualquier palabra que empiece con S mayuscula son clases
public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int paginas;
	
	public Libro (String isbn, String titulo, String autor, int paginas ) {
		//librito.isbn = IES123456
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor =autor;
		this.paginas = paginas;
		
	}
/*
 * desde dode se llama al metodo
 * string
 * que tipo de dato va a retornar el metodo
 * string
 * poner un nombre significativo
 * Stirng getISBN
 * necesita el metodo lagun parametro info del exterior?
 */
	public String getIsbn () {
		return this.isbn;
	}
	
	public void setIsbn (String nuevoIsbn) {
		this.isbn = nuevoIsbn;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}

}
