package arrays;

import java.util.Scanner;

public class Ejercico11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int filas, columnas;
		char orientacion;
		int[][] concatenada = new int[0][0];

		do {
			System.out.print("Cuántas filas desea que tenga la primera matriz? ");
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

		int[][] matriz1 = new int[filas][columnas];

		Ejercicio6.matrizAleatoria(matriz1);
		System.out.println("\nPrimera matriz:\n");

		Ejercicio6.mostrarMatriz(matriz1);

		do {
			System.out.print("Cuántas filas desea que tenga la segunda matriz? ");
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

		int[][] matriz2 = new int[filas][columnas];

		Ejercicio6.matrizAleatoria(matriz2);
		System.out.println("\nSegunda matriz:\n");

		Ejercicio6.mostrarMatriz(matriz2);

		do {
			System.out.print("¿Desea concatenarlas de manera horizontal o verticaal? ");
			orientacion = scanner.next().charAt(0);
			orientacion = Character.toLowerCase(orientacion);
			if (orientacion != 'h' && orientacion != 'v')
				System.out.println("ERROR, Indica si quieres concatenarlas de manera horizontal o vertical.");
		} while (orientacion != 'h' && orientacion != 'v');

		concatenada = concatenacionMatrices(matriz1, matriz2, orientacion);
		if (concatenada.length != 0) {
			System.out.println("\nMatriz concatenada:\n");
			Ejercicio6.mostrarMatriz(concatenada);
		}

		scanner.close();

	}

	private static int[][] concatenacionMatrices(int[][] matriz1, int[][] matriz2, char orientacion) {
		int[][] concatenada = new int[0][0];
		if (orientacion == 'h') {
			if (matriz1.length != matriz2.length) {
				System.out.println("ERROR, las matrices no tienen el mismo número de filas, no se pueden concatenar");
			} else {
				concatenada = new int[matriz1.length][matriz1[0].length + matriz2[0].length];
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz1[0].length; j++) {
						concatenada[i][j] = matriz1[i][j];
					}
					for (int j = 0; j < matriz2[0].length; j++) {
						concatenada[i][matriz1[0].length + j] = matriz2[i][j];
					}
				}
			}
		} else {
			if (matriz1[0].length != matriz2[0].length) {
				System.out
						.println("ERROR, las matrices no tienen el mismo número de columnas, no se pueden concatenar");
			} else {
				concatenada = new int[matriz1.length + matriz2.length][matriz1[0].length];
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz1[0].length; j++) {
						concatenada[i][j] = matriz1[i][j];
					}
				}
				for (int i = 0; i < matriz2.length; i++) {
					for (int j = 0; j < matriz2[0].length; j++) {
						concatenada[matriz1.length + i][j] = matriz2[i][j];
					}
				}
			}
		}
		return concatenada;
	}

}
