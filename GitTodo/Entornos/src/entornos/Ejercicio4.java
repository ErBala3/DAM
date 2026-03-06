package entornos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.print("Introduce el nombre del empleado: ");
		String nombre = scanner.nextLine();
		System.out.print("Introduce el salario base:");
		double salarioBase = scanner.nextDouble();
		System.out.print("Introduce el numero de horas extras trabajadas: ");
		int horas = scanner.nextInt();
		System.out.print("Introduce la tasa por hora: ");
		double tasa = scanner.nextDouble();

		double salarioBruto = salarioBase + (horas * tasa);

		double irpf = 0;
		if (salarioBruto < 2000)
			irpf = salarioBruto * 0.15;
		else if (salarioBruto >= 1000 && salarioBruto <= 2000)
			irpf = salarioBruto * 0.10;
		else
			irpf = salarioBruto * 0.05;

		double seguroSocial = salarioBruto * 0.065;

		double salarioNeto = salarioBruto - irpf - seguroSocial;

		System.out.println("Nombre: " + nombre);
		System.out.println("Salario base: " + salarioBase);
		System.out.println("Horas extras: " + horas);
		System.out.println("Tasa por hora: " + tasa);
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("IRPF: " + irpf);
		System.out.println("Seguro social: " + seguroSocial);
		System.out.println("Salario neto: " + salarioNeto);
		scanner.close();
	}

}
