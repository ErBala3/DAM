package arrays;

import java.util.Arrays;

public class Ejecicio5 {

	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50, 60, 0, 0, 0, 0 };
		int[] array2 = { 10, 20, 30, 40, 50, 60, 0, 0, 0, 0 };

		eliminarElemento(array1, 2);
		eliminarElementoOrdenado(array2, 2);
		System.out.println("Array 1: ");
		System.out.println(Arrays.toString(array1));
		System.out.println("Array 2: ");
		System.out.println(Arrays.toString(array2));

	}

	public static void eliminarElemento(int[] array, int posicion) {
		int n = array.length - 1;
		for (int i = array.length - 1; i > posicion && array[i] == 0; i--) {
			n--;
		}
		array[posicion] = array[n];
		array[n] = 0;

		/*
		 * for (int i = 0; i < array.length - 1 ; i++) {
		 * 
		 * if(array[i]==numero){
		 * array[posicion] = array[n];
		 * array[n] = 0;
		 * n--
		 * }
		 * }
		 */
	}

	public static void eliminarElementoOrdenado(int[] array, int posicion) {
		for (int i = posicion; i < array.length - 1; i++) {
			if (i == array.length - 1)
				array[array.length - 1] = 0;
			else
				array[i] = array[i + 1];
		}
	}

}
