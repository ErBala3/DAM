package examenCorregido;

import java.util.Scanner;

public class ExamenSimlacro {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int menu, numero;

		do {
			System.out.println("=========EXAMEN FINAL 1 TRIMESTRE=========");
			System.out.println("1) Contar cuántas cifras tiene un número (iterativo y recursivo)");
			System.out.println("2) Calcular el precio final de un pedido (sobrecarga de métodos)");
			System.out.println("3) Comprobar si un número es Harshad");
			System.out.println("4) Dibujar un reloj de arena");
			System.out.println("5) Salir");
			menu=scanner.nextInt();

			switch (menu) {
			case 1:
				do {
					System.out.print("Indique el numero para contar las cifras: ");
					numero=scanner.nextInt();
					if(numero<=0)
						System.out.println("EROR vuelve a introducir el numero.");
				}while(numero<=0);

				System.out.println("Cifras contadas de manera iterativa "+ iterativo(numero));

				System.out.println("Cifras contadas de manera recursivo "+ recursivo(numero));
				break;

			case 2:
				break;
			case 3:
				do {
					System.out.print("Indiquue un nuumero para saber si es Harshad: ");
					numero=scanner.nextInt();
					if(numero<=0)
						System.out.println("EROR vuelve a introducir el numero.");
				}while(numero<=0);

				hashard(numero);

				break;
			case 4:
				break;
			}

		}	while(menu!=5);

		scanner.close();
	}//final main 

	public static int iterativo (int a) {
		int resultado=0;// estamos sumando 1 si muultiplicando

		for(int i=a;i>0;i=i/10)//i-- i/=10
			resultado=resultado+1;//resulado++

		return resultado;
	}

	public static int recursivo (int a) {
		int resultado=0;

		if (a==0)//
			resultado=0;//resultado=1
		else
			resultado=recursivo(a/10)+1;//a--

		return resultado;
	}

	public static void hashard(int a) {
		int sumarDigitos=0;
		for (int i=a; i>0;i/=10)
			sumarDigitos+=i%10;

		if (a%sumarDigitos==0)
			System.out.println("Su numero es Harshad.");
		else
			System.out.println("Su numero no es Harshad.");
	}

	public static void relojArena (int n, char a) {
		int caracteres=n, espacios=0;

		while (caracteres>=1) {
			for (int i=0;i<espacios;i++)
				System.out.print(" ");
			for (int j=0;j<caracteres;j++)
				System.out.print(a);
			System.out.println();
			espacios++;
			caracteres-=2;
		}

		espacios=(n/2)-1;
		caracteres=3;
		while (caracteres<=n) {
			for (int i=0;i<espacios;i++)
				System.out.print(" ");
			for (int j=0;j<caracteres;j++)
				System.out.print(a);
			System.out.println();
			espacios--;
			caracteres+=2;
		}
	}



	public static int Vuelta (int a) {
		int b=0;

		for(int i=a;i>0;i=i/10) {
			b+=i%10;
			if(i>=10)
				b*=10;
		}

		return b;
	}


	public static int fibonacciRecursivo (int a) {
		int resultado=0;
		
		if(a<=1)
			resultado=0;
		else if (a<=3)
			resultado=1;
		else
			resultado=fibonacciRecursivo(a-1)+fibonacciRecursivo(a-2);

		return resultado;
	}
	
	public static int fibonacciIterativo (int a) {
		int primero=1, anterior=0;
		int fibonacci=0;

		for(int i=a;i>1;i--) {//1+1
			fibonacci=primero+anterior;
			anterior=primero;// anterior 2, resultado 1
			primero=fibonacci;//resultado =resultado+anterior
			
		}
		return fibonacci;
	}


}
