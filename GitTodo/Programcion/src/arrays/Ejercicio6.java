package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int filas, columnas;
		do {
			System.out.print("Cuántas filas desea que tenga la matriz? ");
			filas = scanner.nextInt();
			if (filas < 1)
				System.out.println("ERROR, la matriz debe de tener al menos una fila.");
		} while (filas < 1);

		do {
			System.out.print("Cuántas columnas desea que tenga la matriz? ");
			columnas = scanner.nextInt();
			if (columnas < 1)
				System.out.println("ERROR, la matriz debe de tener al menos una columna.");
		} while (columnas < 1);

		int[][] array = new int[filas][columnas];

		matrizAleatoria(array);
		System.out.println();
		
		mostrarMatriz(array);
		scanner.close();
	}

	public static void matrizAleatoria(int[][] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = random.nextInt(100) + 1;

	}

	public static void mostrarMatriz(int[][] array) {

		// System.out.println(Arrays.deepToString(array));
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + "\t");
			System.out.println("\n");
		}
	}
}
