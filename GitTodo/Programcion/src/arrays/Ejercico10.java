package arrays;
import java.util.Scanner;
public class Ejercico10 {

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
		System.out.println("\nMatriz original:\n");

		Ejercicio6.mostrarMatriz(matriz);

		if(filas!=columnas)
			System.out.println("Como el número de filas no coincide con el número de columnas, por lo que no es ni simétrica o antisimétrica.");
		else {
			int[][] traspuesta = new int[columnas][filas];

			System.out.println("\nTraspuesta de la matriz:\n");
			traspuesta = Ejercicio9.traspuestaMatriz(matriz);
			Ejercicio6.mostrarMatriz(traspuesta);

			matrizSimetrica(matriz);
				


		}		
		scanner.close();

	}
	public static void matrizSimetrica(int[][] matriz) {
		boolean algo=true, simetrica=true, antisimetrica=true;

		for (int i=0;i<matriz.length;i++)
			for (int j=0;j<matriz.length;j++)
				if(matriz[i][j]!=matriz[j][i])
					simetrica=false;
				else if(i==j&& matriz[i][j]!=0)
					antisimetrica=false;
				else if(matriz[i][j]!=matriz[j][i]*(-1))
					antisimetrica=false;


		if(simetrica)
			System.out.println("Su matriz es simétrica.");
		else if(antisimetrica)
			System.out.println("Su matriz es antisimétrica.");
		else if(!simetrica && !antisimetrica)
			System.out.println("Su matriz no es ni simétrica ni Antisimétrica");
		
	}

}
