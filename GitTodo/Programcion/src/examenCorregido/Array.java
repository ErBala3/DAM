package examenCorregido;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu, modulos, alumnos;
		boolean matrizCreada=false, meidasHechas=false, diagonalPrincipal=true;
		double [][] notas= new double[0][0];
		double [] mediasAlumnos = new double[0], mediasInvertidas = new double[0];
		char diagonal;



		do {
			System.out.println("\n\tMENU");
			System.out.println("1. Generar notas aleatorias (1 a 10 solo enteros)");
			System.out.println("2. Mostrar la matriz formateada con índices");
			System.out.println("3. Calcular la media de cada alumno (media de cada columna)");
			System.out.println("4. Operación con el vector:invertir el vector de medias");
			System.out.println("5. Incorporar vector invertido de medias en la diagonal principal/secundaria de la matriz notas y poner el resto de valores a 0.");
			System.out.println("6. Salir");
			System.out.print("Elija una opción: ");
			menu=scanner.nextInt();
			scanner.nextLine();

			switch(menu) {
			case 1:
				do {
					do {
						System.out.print("Indique la cantidad de módulos:");
						modulos=scanner.nextInt();
						if(modulos<1)
							System.out.println("Debe de haber por lo menos un módulo");
					}while(modulos<1);

					do {
						System.out.print("Indique la cantidad de alumnos:");
						alumnos=scanner.nextInt();
						if(alumnos<1)
							System.out.println("Debe de haber por lo menos un alumno");
					}while(alumnos<1);
					if(modulos!=alumnos)
						System.out.println("ERROR, la cantidad de módulos debe ser la misma que la cantidad de alumnos, vuelva a imtroducir los valores.");
				}while(modulos!=alumnos);
				notas=new double[alumnos][modulos];
				matrizCreada=true;
				rellenarMatriz(notas);
				break;
			case 2:if(matrizCreada)
				mostrarMatrizFormateada(notas);
			else
				System.out.println("ERROR, datos no creados. Introduzca los datos primero, seleccione la opción 1.");
			break;
			case 3: if(matrizCreada) {
				mediasAlumnos=calcularMediasColumnas(notas);
				mostrarVector(mediasAlumnos);
				meidasHechas=true;
			}else
				System.out.println("ERROR, datos no creados. Introduzca los datos primero, seleccione la opción 1.");
			break;
			case 4:  if(matrizCreada) {
				mediasInvertidas=invertirVector(mediasAlumnos);
				mostrarVector(mediasInvertidas);
			}else
				System.out.println("ERROR, datos no creados. Introduzca los datos primero, seleccione la opción 1.");
			break;
			case 5: if(matrizCreada) {
				if(meidasHechas) {
					do {
						System.out.print("Indique la diagonal en la que desea que se muestren las medias: ");
						diagonal=scanner.next().charAt(0);
						diagonal=Character.toLowerCase(diagonal);
						if(diagonal=='s')
							diagonalPrincipal=false;
						else if(diagonal!='p' && diagonal!='s')
							System.out.println("ERROR. indique si quiere introducir la media en la diagonal principal o secundaria.");
					}while(diagonal!='p' && diagonal!='s');

					notas=insertarValorEnDiagonal(notas, mediasAlumnos, diagonalPrincipal);
					mostrarMatrizFormateada(notas);
				}else System.out.println("ERROR, media no realizada. Seleccione la opción 3.");
			}else
				System.out.println("ERROR, datos no creados. Introduzca los datos primero, seleccione la opción 1.");
			break;
			case 6:
				System.out.println("Saliendo del programa....");
				break;
			}

			if(menu <1|| menu>6)
				System.out.println("ERROR, elija una opción correcta.");

		}while(menu!=6);

		scanner.close();
	}

	public static void rellenarMatriz(double [][]matriz) {
		Random random = new Random();

		for (int i=0;i<matriz.length;i++)
			for (int j=0;j<matriz[0].length;j++)
				matriz[i][j]=random.nextInt(10)+1;
	}
	
	public static void mostrarMatrizFormateada (double [][]matriz) {
		System.out.print("\t");
		for (int j=0;j<matriz[0].length;j++)
			System.out.print("A"+(j)+"\t");
		System.out.println();
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				if(j!=0)
					System.out.print(matriz[i][j]+"\t");
				else if(j==0)
					System.out.print("M"+(i)+"\t"+matriz[i][j]+"\t");
			}System.out.println();
		}
	}

	public static double[] calcularMediasColumnas(double[][]matriz) {
		double[] medias= new double[matriz.length];
		for (int i=0;i<matriz.length;i++)
			for (int j=0;j<matriz[0].length;j++)
				medias[j]+=matriz[j][i];

		for (int i=0;i<medias.length;i++)
			medias[i]/=medias.length;

		return medias;
	}

	public static void mostrarVector (double[] mediasAlumnos) {
		for (int i=0;i<mediasAlumnos.length;i++)
		System.out.print("Medias de los alumnos: "+Arrays.toString(mediasAlumnos));
	}

	public static double[]invertirVector(double[]vector){
		double[]vectorInvertido= new double [vector.length];
		int j=vector.length-1;
		for (int i=0;i<vector.length;i++){
			vectorInvertido[i]=vector[j];
			j--;
		}
		return vectorInvertido;
	}

	public static double [][]insertarValorEnDiagonal(double [][]matriz, double[]vector,boolean diagonal){
		int k=matriz[0].length-1;
		if(diagonal) {
			for (int i=0;i<matriz.length;i++) {
				for (int j=0;j<matriz[0].length;j++) {
					if(i==j)
						matriz[i][j]=vector[i];
					else
						matriz[i][j]=0;
				}
			}
		}else {
			for (int i=0;i<matriz.length;i++) {
				for (int j=0;j<matriz[0].length;j++){
					if(j==k)
						matriz[i][j]=vector[i];
					else
						matriz[i][j]=0;
				}
				k--;
			}
		}

		return matriz;
	}

}
