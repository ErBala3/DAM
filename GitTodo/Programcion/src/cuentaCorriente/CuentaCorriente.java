package cuentaCorriente;

public class CuentaCorriente {
	int numeroCuenta=0;
	double saldo=0;
	Gestor gestor;

	public CuentaCorriente(int numeroCuenta, double saldo) {
		if(numeroCuenta<=0)
			System.out.println("El número de cuenta no puede ser negativo, se ha puesto a 0 de manera automática.");
		else
			this.numeroCuenta=numeroCuenta;
		if(saldo<=0)
			System.out.println("El saldo de la cuenta no puede ser negativo, se ha puesto a 0 de manera automática.");
		else
			this.saldo=saldo;
	}

	public void asignarGestor(Gestor gestor) {
		this.gestor=gestor;
	}

	public void mostrarInformacion() {
		System.out.println("Numero de cuenta: "+ this.numeroCuenta);
		System.out.println("Saldo: "+ this.saldo);
		System.out.println("Nombre del gestor: "+ gestor.nombre);
		if(gestor.getTelefono()==0)
			System.out.println("No tiene teléfono asocuado");
		else
			System.out.println("Numero de cuenta: "+ gestor.getTelefono());
	}
	
	public void realizarOperacion (double importe) {
		if(importe<0 && this.saldo+importe<0)
			System.out.println("No se puede realizar, dado a que no tiene tanto dinero");
		else if(importe>gestor.importeMaximo||importe<-gestor.importeMaximo)
			System.out.println("No puede ingresar más de 10000€");
		else
			this.saldo+=importe;
	}
}
