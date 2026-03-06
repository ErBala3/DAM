package arrays;

import java.util.Scanner;
import arrays.Ejercicio6;

public class Ejercicio7 {

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

		int [][] suma= new int [filas][columnas];
		suma=sumarMatrices(matriz1, matriz2);
		scanner.close();
	}

	public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
		int[][] sumaMatrices=null;

		if (matriz1.length == matriz2.length && matriz1[1].length == matriz2[1].length) {
			System.out.println("\nSuma de las matrices:\n");
			sumaMatrices = new int[matriz1.length][matriz1[1].length];
			for (int i = 0; i < matriz1.length; i++) 
				for (int j = 0; j < matriz1[i].length; j++) 
					sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
			Ejercicio6.mostrarMatriz(sumaMatrices);

		} else if (matriz1.length != matriz2.length && matriz1[1].length != matriz2[1].length) 
			System.out.println("Las matrices no se pueden sumar porque no tienen el mismo número de filas y de columnas");
			else if (matriz1.length != matriz2.length)
			System.out.println("Las matrices no se pueden sumar porque no tienen el mismo número de filas");
			else if (matriz1[1].length != matriz2[1].length) 
			System.out.println("Las matrices no se pueden sumar porque no tienen el mismo número de columnas");
			
		return sumaMatrices;
	}

}
