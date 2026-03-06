package examen;

import java.util.Scanner;

public class Sergio_Jiménez_DelOjo_P1_Debug {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("¿Cuántas notas vas a introducir? ");
	        int n = sc.nextInt();

	        double[] notas = leerNotas(sc, n);

	        double media = calcularMedia(notas);
	        int aprobados = calcularAprobados(notas);

	        System.out.println("\nResultados:");
	        System.out.println("Media: " + media);
	        System.out.println("Aprobados: " + aprobados);

	        sc.close();
	    }

	    public static double[] leerNotas(Scanner sc, int n) {
	        double[] notas = new double[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Nota " + (i + 1) + ": ");
	            notas[i] = sc.nextDouble();
	        }
	        return notas;
	    }

	    public static double calcularMedia(double[] notas) {
	        int suma = 0;
	        for (double nota : notas) {
	            suma += nota;
	        }
	        return (double)suma / notas.length;
	    }

	    public static int calcularAprobados(double[] notas) {
	        int cont = 0;
	        for (double nota : notas) {
	            if (nota >= 5) {
	                cont++;
	            }
	        }
	        return cont;
	    }
}
