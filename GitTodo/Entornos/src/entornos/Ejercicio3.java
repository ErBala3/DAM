package entornos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double IVA = 1.21;
		double precioBase;
		double precioDescuento;
		double precioFinal;

		System.out.print("Introduce el precio base del producto: ");
		precioBase = scanner.nextDouble();

		if (precioBase > 100)
			precioDescuento = precioBase * 0.90;
		else
			precioDescuento = precioBase;

		precioFinal = precioDescuento * IVA;
		System.out.println("El precio final es: " + precioFinal);
		scanner.close();
	}

}
