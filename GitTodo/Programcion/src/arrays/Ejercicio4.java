package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = { 10, 20, 30, 40, 0, 0, 0, 0, 0, 0 };
		int menu, numero;
		int posicion;
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1. Meter un número en un array desordenado");
			System.out.println("2. Meter un número en un array ordenado");
			System.out.println("3. Mostrar el array");
			System.out.println("4. Salir");
			menu = scanner.nextInt();
			if (menu < 1 || menu > 4)
				System.out.println("ERROR, introduzca otra vez una opción ");
			else {
				switch (menu) {
				case 1:
					System.out.print("Indique el número que desea inroducir: ");
					numero = scanner.nextInt();
					do {
						System.out.print("Indique la posición que desea inroducir: ");
						posicion = scanner.nextInt();
						if (posicion < 0 || posicion > array.length)
							System.out.println(
									"ERROR no hay hueco, la posición debe estar entre 1 y " + array.length);
						else {
							array = MeterEnArray(array, numero, posicion - 1);
							System.out.println("Número introducido correctamente");
						}
					} while (posicion < 0 || posicion > array.length);
					break;
				case 2:
					System.out.print("Indique el número que desea inroducir: ");
					numero = scanner.nextInt();
					array = MeterEnArrayOrdenado(array, numero);
					System.out.println("Número introducido correctamente");
					break;
				case 3:
					System.out.println(Arrays.toString(array));
					break;
				}
			}
		} while (menu != 4);
		scanner.close();
	}

	public static int[] MeterEnArray(int[] array, int n, int posicion) {
		for (int i = array.length - 1; i >= posicion; i--) {
			if (array[i] == posicion)
				array[i] = n;
			else
				array[i] = array[i - 1];
		}
		return array;
	}

	public static int[] MeterEnArrayOrdenado(int[] array, int n) {
		int posicion = 0;

		/*
		 * for (int i = 0; i < array.length; i++) {
		 * if (array[i] > n) {
		 * posicion = i;
		 * i=array.length;
		 * }
		 * }
		 */

		// he probado a hacerlo con un while para variar
		while (array[posicion] != 0 && array[posicion] < n || posicion == array.length - 1) {
			posicion++;
		}

		for (int i = array.length - 1; i >= posicion; i--) {
			if (i == posicion)
				array[i] = n;
			else
				array[i] = array[i - 1];
		}
		return array;
	}

}
