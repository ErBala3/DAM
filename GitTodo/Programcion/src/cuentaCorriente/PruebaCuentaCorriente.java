package cuentaCorriente;

import java.util.Scanner;

public class PruebaCuentaCorriente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu, telefonoGestor=0, numeroCuenta;
		double importeMaximo=0, saldo, ingreso;
		char importeSi, retiro;
		String nombreGestor;
		boolean cuentaCreada=false,gestorCreado=false, gestorAsignado=false;
		Gestor gestor=null;
		CuentaCorriente cuenta=null;
		do {
		System.out.println("Menu");
		System.out.println("1. Crear nuevo gestor");
		System.out.println("2. Crear una cuenta corriente");
		System.out.println("3. Asignar un gestor a la cuenta");
		System.out.println("4. Realizar una operación");
		System.out.println("5. Mostrar información de la cuenta y del gestor");
		System.out.println("6. Salir");
		menu=scanner.nextInt();
		scanner.nextLine();
		if(menu>6)
			System.out.println("Error, selecione una opción válida.");
		else
		
			switch (menu) {
			case 1: 
				System.out.println("Cómo se llama su gestor? ");
				do {
				nombreGestor=scanner.next();
				if(nombreGestor.isEmpty())
					System.out.println("Debe introducir el nombre del gestor:");
			}while(nombreGestor.isEmpty());
				System.out.println("Cuál es el número de teléfono del gestor ");
				nombreGestor=scanner.next();
			System.out.println("Desea asignar un importe máximo personalizado? si no, será 10000€");
			do {
				importeSi=scanner.next().charAt(0);
				importeSi=Character.toLowerCase(importeSi);
				if(importeSi!='n'||importeSi!='s')
					System.out.println("Por favor, indique si desea modificar el importe máximo");
			}while(importeSi!='n'||importeSi!='s');
			if(importeSi=='s') {
				System.out.println("Indique el importe máximo que desees poner: ");
				do {
				importeMaximo=scanner.nextDouble();
				if(importeMaximo<=0)
					System.out.println("El importe debe ser un número positivo");
			}while(importeMaximo<=0);
			}
				  gestor=new Gestor(nombreGestor, telefonoGestor, importeMaximo);
			gestorCreado=true;
			break;
			case 2:
				System.out.println("Indique su número de cuenta: ");
				do {
				numeroCuenta=scanner.nextInt();
				if(numeroCuenta<=0)
					System.out.println("El número de cuenta introducido es erróneo, vuelva a introducirlo:");
			}while(numeroCuenta<=0);
				System.out.println("Indique el saldo inicial: ");
				do {
				saldo=scanner.nextInt();
				if(saldo<=0)
					System.out.println("El saldo introducido es erróneo, vuelva a introducirlo:");
			}while(saldo<=0);
				 cuenta = new CuentaCorriente(numeroCuenta, saldo);
				cuentaCreada=true;
				break;
			case 3:
				if(cuentaCreada&& gestorCreado)
				cuenta.asignarGestor(gestor);
				else if(!cuentaCreada&&gestorCreado)
					System.out.println("Cuenta no creada");
				else if(cuentaCreada&&!gestorCreado)
					System.out.println("Gestor no creado");
				else
					System.out.println("No se ha creado ni la cuenta ni el gestor");
			 break;
			case 4: System.out.println("Desea retirar o ingresar dinero?");
			do {
				retiro=scanner.next().charAt(0);
				retiro=Character.toLowerCase(retiro);
				if(retiro!='r'||retiro!='i')
					System.out.println("Por favor, indique si desea retirar o ingresar dinero: ");
			}while(retiro!='r'||retiro!='i');
			System.out.println("Indique la cantidad a retirar: ");
			if(retiro=='r')
				ingreso=-scanner.nextDouble();
			else
				ingreso=-scanner.nextDouble();
			cuenta.realizarOperacion(ingreso);
			break;
			case 5:
				cuenta.mostrarInformacion();
			}}while(menu!=6);
	}
}
