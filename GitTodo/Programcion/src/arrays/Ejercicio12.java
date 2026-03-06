package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int filas;

		do {
			System.out.print("Cuántas filas desea que tenga la primera matriz? ");
			filas = scanner.nextInt();
			if (filas < 1)
				System.out.println("ERROR, la matriz debe de tener al menos una fila.");
		} while (filas < 1);

		int[][] matriz = new int[filas][filas];

		rellenarMatriz(matriz);

		System.out.println("\nMatriz original:\n");
		
		mostrarMatriz(matriz);
		
		System.out.println("\nSuma de las diagonales:\n");

		mostrarMatrizDiagonal(matriz);
		
		sumaDiagonales(matriz);
		scanner.close();

	}

	public static void rellenarMatriz(int[][]array) {
		Random random = new Random();

		for (int i=0; i < array.length; i++)
			for(int j=0; j < array[0].length; j++) 
				array[i][j]= random.nextInt(100)+1;

	}


	public static void mostrarMatriz(int[][]array) {

		for (int i=0; i < array.length; i++)
			for(int j=0; j < array[0].length; j++) {
				System.out.println(array[i][j]+"\t");
			}System.out.println("\n");
	}

	public static void sumaDiagonales (int[] []array) {
		int sumaPrincipal=0, sumaSecundaria=0, j=0;;

		if(array.length%2==0) {
			for (int i=0; i < array.length; i++)
				sumaPrincipal+= array[i][i];

			for (int i=array.length-1; i >=0; i--) {
				sumaSecundaria+= array[i][j];
				j++;
			}
		}else {
			for (int i=0; i < array.length; i++)
				sumaPrincipal+= array[i][i];
			j=0;

			for (int i=array.length-1; i >=0; i--) {
				if(i!=j)
					sumaSecundaria+= array[i][j];
				j++;
			}
		}

		System.out.println("La suma de la diagonal principal es: "+ sumaPrincipal);
		System.out.println("La suma de la diagonal secundaria es: "+ sumaSecundaria);
	}

	public static void mostrarMatrizDiagonal (int[][] array) {
		int a=array.length-1;
		for (int i=0; i < array.length; i++) {
			for(int j=0; j < array[0].length; j++) {
				if(j==a)
					System.out.print("["+array[i][j]+"]\t");
				else if(i!=j)
					System.out.print(array[i][j]+"\t");
				else
					System.out.print("["+array[i][j]+"]\t");

			}a--; System.out.println("\n");
	}
		}


}
