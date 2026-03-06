package biblioteca;

import java.util.Scanner;

public class BibliotecadeHash {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int menu;
		Biblioteca biblioteca = new Biblioteca();
		try{
			do{
				System.out.println("1. Agregar libro");
				System.out.println("2. Mostrar catalogo");
				System.out.println("3. Buscar libro");
				System.out.println("4. Eliminar libro");
				System.out.println("5. Mostrar libros de un autor");
				System.out.println("6. Salir");
				menu = scanner.nextInt();
				switch(menu){
				case 1->biblioteca.agregarLibro(leerIsbn(),leerTitulo(),leerAutor(),leerAñoPublicacion(),leerEditorial());
				case 2->biblioteca.mostrarCatalogo();
				case 3->biblioteca.buscarLibro(leerIsbn());
				case 4->biblioteca.eliminarLibro(leerIsbn());
				case 5->biblioteca.mostrarLibrosAutor(leerAutor());
				case 6->System.out.println("Gracias por su visita: ");
				default->throw new IllegalArgumentException("Opcion no valida, vuelva a introducir una opcion: ");
				}
			}while(menu!=6);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

	private static String leerIsbn() {
		System.out.println("Introduce el isbn: ");
		return scanner.nextLine();
	}

	private static String leerTitulo() {
		System.out.println("Introduce el titulo: ");
		return scanner.nextLine();
	}

	private static String leerAutor() {
		System.out.println("Introduce el autor: ");
		return scanner.nextLine();
	}

	private static int leerAñoPublicacion() {
		System.out.println("Introduce el año de publicacion: ");
		return scanner.nextInt();
	}

	private static String leerEditorial() {
		System.out.println("Introduce la editorial: ");
		return scanner.nextLine();
	}

}

