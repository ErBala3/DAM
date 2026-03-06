package biblioteca;

import java.util.HashSet;

public class Biblioteca {

	private  HashSet <Libro> libros=null;

	public Biblioteca() {
		if(libros != null)
			throw new IllegalArgumentException("Biblioteca ya creada");
		libros= new HashSet<Libro>();
	}

	public Libro nuevoLibro(String isbn, String titulo, String autor, int añoPublicacion, String editorial) {
		Libro libro = new Libro(isbn, titulo, autor, añoPublicacion, editorial);
		return libro;
	}
	public void agregarLibro(String isbn, String titulo, String autor, int añoPublicacion, String editorial) {
		Libro libro = nuevoLibro(isbn, titulo, autor, añoPublicacion, editorial);
		if(libro == null)
			throw new IllegalArgumentException("Libro no puede estar vacío");
		if(libros.contains(libro))
			throw new IllegalArgumentException("Libro ya existe");
		libros.add(libro);
	}

	public void mostrarCatalogo() {
		if(libros.isEmpty())
			throw new IllegalArgumentException("El catalogo esta vacio");
		System.out.println(libros);
	}

	public Libro buscarLibro(String isbn) {
		if(isbn.trim().isEmpty())
			throw new IllegalArgumentException("El isbn no puede estar vacío");
		for(Libro libro : libros){
			if(libro.getIsbn().equals(isbn)){
				return libro;
			}
		}
		return null;
	}

	public void eliminarLibro(String isbn) {
		if(isbn.trim().isEmpty())
			throw new IllegalArgumentException("El isbn no puede estar vacío");
		Libro libro = buscarLibro(isbn);
		if(libro == null)
			throw new IllegalArgumentException("Libro no encontrado");
		libros.remove(libro);
	}

	public void mostrarLibrosAutor(String autor) {
		if(autor.trim().isEmpty())
			throw new IllegalArgumentException("El autor no puede estar vacío");
		for(Libro libro : libros){
			if(libro.getAutor().equals(autor)){
				System.out.println(libro);
			}
		}
	}

}
