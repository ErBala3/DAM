package examenCorregido;

import java.util.Scanner;

public class ExamenFinalPrimerTrimestre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion, numero, entradas;
		double precioIndividual, precioIntermedio, precio;
		String codigo;
		char frecuente, estudiante, letra;
		System.out.println();
		do {
			System.out.println("=========EXAMEN FINAL 1 TRIMESTRE=========");
			System.out.println("1) Contar cuántas cifras tiene un número (iterativo y recursivo)");
			System.out.println("2) Calcular el precio final de un pedido (sobrecarga de métodos)");
			System.out.println("3) Comprobar si un número es Harshad");
			System.out.println("4) Dibujar un reloj de arena");
			System.out.println("5) Salir");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					do {
						System.out.print("Indique el número del que desea contar las cifras: ");
						numero = scanner.nextInt();
						if (numero <= 0)
							System.out.println("ERROR, el numero debe ser entero y positivo");
					} while (numero <= 0);

					System.out.println("Número introducidio: " + numero);
					System.out.println("Cifras mediante método iterativo: " + ContarCifrasIterativo(numero));
					System.out.println("Cifras mediante método recursivo: " + ContarCifrasRecursivo(numero));
					break;
				case 2:
					do {
						System.out.print("Cuántas entradas desea comprar? ");
						entradas = scanner.nextInt();
						if (entradas < 1)
							System.out.println("ERROR, debe comprar al menos una entrada");
					} while (entradas < 1);
					do {
						System.out.print("¿Cuánto vale cada entrada? ");
						precioIndividual = scanner.nextInt();
						if (precioIndividual <= 0)
							System.out.println("ERROR, Las entradas deben de tener algún tipo de valor");
					} while (precioIndividual <= 0);
					precio = precioIndividual * entradas;
					precioIntermedio = descuento(precio, entradas);

					System.out.println("Introduzca el código de descuento: ");
					scanner.nextLine();
					codigo = scanner.nextLine();
					codigo = codigo.toUpperCase();
					precioIntermedio = descuento(precioIntermedio, codigo);
					do {
						System.out.println("¿Es usted un cliente frecuente? ");
						frecuente = scanner.next().charAt(0);
						frecuente = Character.toUpperCase(frecuente);
						if (frecuente != 'S' && frecuente != 'N')
							System.out.println("ERROR, por favor indique si eres o no un cliente frecuente");
					} while (frecuente != 'S' && frecuente != 'N');
					do {
						System.out.println("¿Es usted un cliente frecuente? ");
						estudiante = scanner.next().charAt(0);
						estudiante = Character.toUpperCase(estudiante);
						if (estudiante != 'S' && estudiante != 'N')
							System.out.println("ERROR, por favor indique si eres o no un estudiante");
					} while (estudiante != 'S' && estudiante != 'N');

					System.out.printf("El precio final de sus billetes es de %.f",
							descuento(precioIntermedio, frecuente, estudiante));
					break;
				case 3:
					do {
						System.out.print("Indique el número del que desea saber si es o no harshad: ");
						numero = scanner.nextInt();
						if (numero <= 0)
							System.out.println("ERROR, el numero debe ser entero y positivo");
					} while (numero <= 0);
					Harshad(numero);
					break;
				case 4:
					do {
						System.out.print("Indique el número de longitud del reloj (impar y menor que 10): ");
						numero = scanner.nextInt();
						if (numero <= 0 || numero % 2 == 0 || numero / 10 != 0)
							System.out.println("ERROR, el numero debe ser entero, positivo, impar y de una sola cifra");
					} while (numero <= 0 || numero % 2 == 0 || numero / 10 != 0);
					System.out.println("Indique el carácter con el que desea hacer el reloj: ");

					letra = scanner.next().charAt(0);
					relojArena(numero, letra);
					break;
				case 5:
					System.out.println("\nGracias por confiar en nosotros, que tenga un buen día.");
					break;
				default:
			}

		} while (opcion != 5);
		scanner.close();
	}

	public static int ContarCifrasIterativo(int n) {
		int contador = 0;
		for (int i = n; i > 0; i /= 10) {
			contador++;
		}
		return contador;
	}

	public static int ContarCifrasRecursivo(int n) {
		int contador = 0;
		if (n < 10)
			contador = 1;
		else
			contador = 1 + ContarCifrasRecursivo(n / 10);
		return contador;
	}

	public static double descuento(double precio, int entradas) {

		if (entradas < 3) {
			precio *= 0.95;
			System.out.printf(
					"Se le ha aplicado un descuento del 5%% por comprar menos de 3 entradas, su precio actual es: %.2f€\n",
					precio);
		} else if (entradas < 5) {
			precio *= 0.9;
			System.out.printf(
					"Se le ha aplicado un descuento del 10%% por comprar menos de 5 entradas, su precio actual es: %.2f€\n",
					precio);

		} else {
			precio *= 0.85;
			System.out.printf(
					"Se le ha aplicado un descuento del 15%% por comprar 5 o más entradas, su precio actual es: %.2f€\n",
					precio);
		}
		return precio;
	}

	public static double descuento(double precio, String codigo) {
		if (codigo.equals("PROMO10")) {
			precio *= 0.9;
			System.out.printf(
					"Se le ha aplicado un descuento del 10%% por el código canjeado, su precio actual es: %.2f€\n",
					precio);

		} else if (codigo.equals("PROMO20")) {
			precio *= 0.8;
			System.out.printf(
					"Se le ha aplicado un descuento del 20%% por el código canjeado, su precio actual es: %.2f€\n",
					precio);

		} else
			System.out.println("Código no válido, no se le ha aplicado descuento");
		return precio;
	}

	public static double descuento(double precio, char frecuente, char estudiante) {
		double descuento = 0;
		if (frecuente == 'S') {
			descuento += precio * 0.10;
			System.out.printf(
					"Se le ha aplicado un descuento del 10%% por ser un cliente frecuente, su precio actual es: %.2f€\n",
					precio);
		} else
			System.out.println("Al no ser un cliente habitual, no se le ha aplicado ningún descuento");
		if (estudiante == 'S') {
			descuento += precio * 0.05;
			System.out.printf("Se le ha aplicado un descuento del 5%% por ser estudiante, su precio actual es: %.2f€\n",
					precio);
		} else
			System.out.println("Al no ser un cliente habitual, no se le ha aplicado ningún descuento");
		precio -= descuento;
		return precio;
	}

	public static void Harshad(int n) {
		int sumaDigitos = 0;
		String numeroStr = String.valueOf(n);
		for (int i = 0; i < numeroStr.length(); i++) {
			int digito = Character.getNumericValue(numeroStr.charAt(i));
			sumaDigitos += digito;
			if (i == numeroStr.length() - 1)
				System.out.println(digito + " = " + sumaDigitos);
			else
				System.out.print(digito + " + ");
		}
		if (n % sumaDigitos == 0)
			System.out.println(n + " dividido entre " + sumaDigitos + " da un numero entero (" + n / sumaDigitos
					+ "), por lo tanto el número " + n + " es un número Harshad");
		else
			System.out.println(n + " dividido entre " + sumaDigitos + " no da un numero entero ("
					+ (double) n / sumaDigitos + "), por lo tanto el número " + n + " no es un número Harshad");
	}

	public static void relojArena(int n, char a) {
		int caracteres = n, espacios = 0;
		while (caracteres >= 1) {
			for (int i = 0; i < espacios; i++)
				System.out.print(" ");
			for (int j = 0; j < caracteres; j++)
				System.out.print(a);
			System.out.println();
			espacios++;
			caracteres -= 2;
		}

		espacios = (n / 2) - 1;
		caracteres = 3;
		while (caracteres <= n) {
			for (int i = 0; i < espacios; i++)
				System.out.print(" ");
			for (int j = 0; j < caracteres; j++)
				System.out.print(a);
			System.out.println();
			espacios--;
			caracteres += 2;
		}
	}

}
