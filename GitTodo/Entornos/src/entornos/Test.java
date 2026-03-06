package entornos;
import java.util.Scanner;
public class Test {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un número: ");
	        int numero = sc.nextInt();

	        int resultado = sumarPares(numero);

	        System.out.println("La suma de los números pares es: " + resultado);

	        sc.close();
	    }

	    public static int sumarPares(int limite) {
	        int suma = 0;

	        for (int i = 1; i <= limite; i++) {
	            if (i % 2 == 0) {
	                suma = suma + i;
	            }
	        }

	        return suma;
	    }
	}
