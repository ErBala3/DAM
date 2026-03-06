package biblioteca;

import java.util.Objects;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int añoPublicacion;
	private String editorial;

	public Libro(String isbn, String titulo, String autor, int añoPublicacion, String editorial) {
		if(isbn.trim().isEmpty())
			throw new IllegalArgumentException("El isbn no puede estar vacio");
		if(titulo.trim().isEmpty())
			throw new IllegalArgumentException("El titulo no puede estar vacio");
		if(autor.trim().isEmpty())
			throw new IllegalArgumentException("El autor no puede estar vacio");
		if(editorial.trim().isEmpty())
			throw new IllegalArgumentException("La editorial no puede estar vacia");
		if(añoPublicacion < -3000 || añoPublicacion > 2026)
			throw new IllegalArgumentException("El año de publicacion no puede ser menor a -3000 o mayor a 2026");
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.editorial = editorial;
	}

	// getters 
	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void mostrarLibro() {
		System.out.println("Isbn: " + isbn);
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		if(añoPublicacion != 0 && añoPublicacion >0)
			System.out.println("Año de publicacion: " + añoPublicacion);
		else if(añoPublicacion < 0)
			System.out.println("Año de publicacion: " + Math.abs(añoPublicacion) + " Antes de Cristo");
		else if(añoPublicacion == 0)
			System.out.println(" No se sabe el año de publicacion");
		System.out.println("Editorial: " + editorial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Libro libro = (Libro) obj;
		return Objects.equals(isbn, libro.isbn);
	}

	@Override
	public int hashCode() {

		return Objects.hash(isbn);
	}
	
		

}
