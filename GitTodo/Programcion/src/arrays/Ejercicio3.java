package arrays;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=0, contadorPositivo=0,sumaPositivo=0, contadorNegativo=0, sumaNegativo=0, contadorCeros=0;
		System.out.print("Introduzca la cantidad de digitos que desea meter: ");
		n=scanner.nextInt();
		int [] array= new int[n];

		for (int i=0;i<n;i++) {
			System.out.print("Introduzca el dígito en la posición "+(i+1)+": ");
			array[i]=scanner.nextInt();	
			System.out.println();
		}
		for (int i=0;i<n;i++) {
			if(array[i]>0) {
				contadorPositivo++;
				sumaPositivo+=array[i];
			}else if(array[i]<0) {
				contadorNegativo++;
				sumaNegativo+=array[i];
			}else
				contadorCeros++;
		}
		
		if(contadorPositivo>0)
			System.out.println("Hay "+contadorPositivo+" números positivos y su media  es:" +(double)sumaPositivo/contadorPositivo);
		else
			System.out.println("No hay números positivos");
		if(contadorNegativo>0)
			System.out.println("Hay "+contadorNegativo+" números negativos y su media  es:" +(double)sumaNegativo/contadorNegativo);
		else
			System.out.println("No hay números negativos");
		
			System.out.println("Hay "+contadorCeros+" ceros");
	}
	

}
