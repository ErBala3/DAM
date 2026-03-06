package arrays;

import java.util.Scanner;

public class Ejercicio9 {

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

		int[][] matriz = new int[filas][columnas];

		Ejercicio6.matrizAleatoria(matriz);
		System.out.println("\nPrimera matriz:\n");

		Ejercicio6.mostrarMatriz(matriz);

		int[][] traspuesta = new int[columnas][filas];

		System.out.println("\nTraspuesta de la matriz:\n");
		traspuesta = traspuestaMatriz(matriz);
		Ejercicio6.mostrarMatriz(traspuesta);

		scanner.close();
	}

	public static int[][] traspuestaMatriz(int[][] matriz) {
		int[][] traspuesta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				traspuesta[j][i] = matriz[i][j];
			}
		}
		return traspuesta;
	}

}
