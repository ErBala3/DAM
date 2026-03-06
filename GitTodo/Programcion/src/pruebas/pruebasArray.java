package pruebas;

import java.util.Scanner;

import arrays.Ejercicio6;

import java.util.Random;

public class pruebasArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//int[][] matriz = {1,2,3}
						// {4,5,6};

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

		rellenarMatriz(matriz);

		System.out.println("\nPrimera matriz:\n");

		mostrarMatriz(matriz);

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

		int[][] matriz2 = new int[filas][columnas];

		rellenarMatriz(matriz2);

		System.out.println("\nSegunda matriz:\n");

		mostrarMatriz(matriz2);

		if(matriz.length!= matriz2.length || matriz[0].length != matriz[0].length)
			System.out.println("No se puede sumar, porque no tienen las mismas dimensiones");
		else {
			int [][] suma=sumarMatrices(matriz, matriz2);
			
			System.out.println("\nLa suma de las matrices es:\n");

			mostrarMatriz(suma);
		}
		
		if(matriz.length!= matriz2.length || matriz[0].length != matriz[0].length)
			System.out.println("No se puede restar, porque no tienen las mismas dimensiones");
		else {
			int [][] resta=restaMatrices(matriz, matriz2);
			
			System.out.println("\nLa resta de las matrices es:\n");

			mostrarMatriz(resta);
		}
		
		

		scanner.close();
	}


	public static void rellenarMatriz(int[][]array) {
		Scanner scanner= new Scanner(System.in);
		//Random random = new Random();

		for (int i=0; i < array.length; i++)
			for(int j=0; j < array[0].length; j++) {
				//array[i][j]= random.nextInt(100)+1;
				System.out.println("Introduzca un número: ");
				array[i][j]=scanner.nextInt();
			}
	}


	public static void mostrarMatriz(int[][]array) {

		for (int i=0; i < array.length; i++)
			for(int j=0; j < array[0].length; j++) {
				System.out.println(array[i][j]+"\t");
			}System.out.println("\n");
	}

	public static int [][] sumarMatrices(int[][] a, int [][] b){
		int [][]suma= new int [a.length][a[0].length];
		
		for (int i=0; i < suma.length; i++)
			for(int j=0; j < suma[0].length; j++)
				suma[i][j]=a[i][j]+b[i][j];
		
		return suma;
	}
	
	public static int [][] restaMatrices(int[][] a, int [][] b){
		int [][]resta= new int [a.length][a[0].length];
		
		for (int i=0; i < resta.length; i++)
			for(int j=0; j < resta[0].length; j++)
				resta[i][j]=a[i][j]-b[i][j];
		
		return resta;
	}
	
	public static int [][] traspuestaMatrices(int[][] matriz){
		int [][]traspuesta= new int [matriz.length][matriz[0].length];
		
		for (int i=0; i < traspuesta.length; i++)
			for(int j=0; j < traspuesta[0].length; j++)
			traspuesta[i][j]=matriz[j][i];
		
		return traspuesta;
	}
	

}
