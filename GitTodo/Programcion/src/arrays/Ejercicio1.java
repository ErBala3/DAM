package arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = { 5, 2, 9, 1, 6, 3 };
		int[] nuevoArray = null; // Initialize outside switch
		int menu, numero;
		do {
			System.out.println("menu");
			System.out.println("1. Ordenar");
			System.out.println("2. Buscar numero");
			System.out.println("3. Rellenar array");
			System.out.println("4. Copiar array");
			System.out.println("5. Comparar array");
			System.out.println("6. Mostrar array");
			System.out.println("7. Salir");
			menu = scanner.nextInt();
			switch (menu) {
				case 1:
					ordenarArray(array);
					break;
				case 2:
					System.out.print("Indique el numero que desea buscar: ");
					numero = scanner.nextInt();
					int posicion = buscarNumero(array, numero);
					if (posicion == -1)
						System.out.println("El numero no se encuentra en el array");
					else
						System.out.println("El numero se encuentra en la posicion " + (posicion + 1));
					break;
				case 3:
					System.out.print("Indique el numero con el que desea rellenar el array: ");
					numero = scanner.nextInt();
					rellenarArray(array, numero);
					break;
				case 4:
					do {
						System.out.print("Indique cuántos números desea copiar: ");
						numero = scanner.nextInt();
						if (numero < 0 || numero > array.length) // Corrected logic: usually we want to allow new size
																	// to be different, but let's keep user intent or
																	// make it safe
							System.out.println("ERROR, introduzca otra vez una opción ");
						else
							nuevoArray = copiarArray(array, numero);
					} while (numero < 0 || numero > array.length); // Assuming user wants valid subset size
					break;
				case 5:
					if (nuevoArray != null && compararLongitudArray(array, nuevoArray)) {
						System.out.print("Los arrays tienen la misma longitud ");
						if (compararContenidoArray(array, nuevoArray))
							System.out.println("y tienen el mismo contenido, por lo que son iguales");
						else
							System.out.println("y no tienen el mismo contenido, por lo que no son iguales");
					} else
						System.out.println(
								"Los arrays no tienen la misma longitud (o no ha copiado ninguno), por lo que no son iguales");
					break;
				case 6:
					mostrarArray(array);
					break;
			}
		} while (menu != 7);

		scanner.close();
	}

	public static void ordenarArray(int[] array) {
		int aux, min;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
			aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
	}

	public static int buscarNumero(int[] array, int numero) {
		int posicion = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero)
				posicion = i;
		}
		return posicion;
	}

	public static void rellenarArray(int[] array, int valor) {
		for (int i = 0; i < array.length; i++) {
			array[i] = valor;
		}
	}

	public static int[] copiarArray(int[] array, int numero) {
		int[] array2 = new int[numero];
		for (int i = 0; i < numero; i++) {
			if (i < array.length) {
				array2[i] = array[i];
			}
		}
		return array2;
	}

	public static boolean compararContenidoArray(int[] array, int[] array2) {
		boolean iguales = true;
		if (array.length != array2.length)
			return false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array2[i])
				iguales = false;
		}
		return iguales;
	}

	public static boolean compararLongitudArray(int[] array, int[] array2) {
		boolean iguales = false;
		if (array.length == array2.length)
			iguales = true;
		return iguales;
	}

	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}

}
