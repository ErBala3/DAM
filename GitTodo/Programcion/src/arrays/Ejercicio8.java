package arrays;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int filas, columnas;

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

		int[][] multiplicacion = multiplicarMatrices(matriz1, matriz2);
		
		scanner.close();
	}

	public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
		int[][] multiplicacionMatrices = new int[0][0];
		if (matriz1[0].length == matriz2.length) {
			System.out.println("\nMultiplicacion de las matrices:\n");
			
			multiplicacionMatrices = new int[matriz1.length][matriz2[0].length];

			for (int i = 0; i < multiplicacionMatrices.length; i++)
				for (int j = 0; j < multiplicacionMatrices[i].length; j++) {
					for (int k = 0; k < matriz1.length; k++)
						multiplicacionMatrices[i][j] += matriz1[i][k] * matriz2[k][j];
				}
			Ejercicio6.mostrarMatriz(multiplicacionMatrices);
		} else
			System.out.println("Las matrices no se pueden multiplicar porque las columnas de la primera no son iguales a las filas de la segunda");

		return multiplicacionMatrices;
	}
	
	//i k !! k j
}
