package examenCorregido;

import java.util.Arrays;
import java.util.Scanner;

public class hola {

    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
int[] array= {5,2,9,1,6,3};
int[] nuevoArray={5,2,9,1,6,3};
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
			menu =scanner.nextInt();
			switch (menu) {
			case 1: 
				ordenarArray(array);
				break;
			case 2:
				System.out.print("Indique el numero que desea buscar: ");
				numero=scanner.nextInt();
				int posicion=buscarNumero(array, numero);
				if(posicion==-1)
					System.out.println("El numero no se encuentra en el array");
				else
					System.out.println("El numero se encuentra en la posicion " + (posicion+1));
				break;
			case 3:
				System.out.print("Indique el numero con el que desea rellenar el array: ");
				numero=scanner.nextInt();
				rellenarArray(array, numero);
				break;
			case 4:
				do{
				System.out.print("Indique cuántos números desea copiar: ");
				numero=scanner.nextInt();
				if (numero<0||numero>array.length)
					System.out.println("ERROR, introduzca otra vez una opción ");
				else
				 nuevoArray=copiarArray(array, numero);
				}
				while (numero<0||numero>array.length);
				break;
			case 5:
				if(compararLongitudArray(array, nuevoArray)){
					System.out.print("Los arrays tienen la misma longitud ");
					if(compararContenidoArray(array, nuevoArray))
						System.out.println("y tienen el mismo contenido, por lo que son iguales");
					else
						System.out.println("y no tienen el mismo contenido, por lo que no son iguales");
				}
				else
					System.out.println("Los arrays no tienen la misma longitud, por lo que no son iguales");
				break;
			case 6:
				mostrarArray(array);
				break;
			}
		}while (menu!=7);

		scanner.close();
	}

    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }

    public static int buscarNumero(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero)
                return i;
        }
        return -1;
    }

    public static void rellenarArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numero;
        }
    }

    public static int[] copiarArray(int[] array, int numero) {
        int[] nuevoArray = new int[numero];
        for (int i = 0; i < numero; i++) {
            nuevoArray[i] = array[i];
        }
        return nuevoArray;
    }

    public static boolean compararLongitudArray(int[] array, int[] nuevoArray) {
        return array.length == nuevoArray.length;
    }

    public static boolean compararContenidoArray(int[] array, int[] nuevoArray) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != nuevoArray[i])
                return false;
        }
        return true;
    }

    public static void mostrarArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // metodo para copiar un array en uno nuecvo y meterle un numero
    public static void copiarArrayEnUnoMasLargo(int[] array, int numero) {
        int[] nuevoArray = new int[array.length + 1];

        for (int i = 0; i < nuevoArray.length; i++) {
            if (i < array.length)
                nuevoArray[i] = array[i];
            else
                nuevoArray[i] = numero;
        }
        array = nuevoArray;
    }

}
