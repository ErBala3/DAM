package cuentaCorriente;

public class Gestor {

	public String nombre;
	private static int telefono=0;
	double importeMaximo=10000;

	public Gestor(String nombre, int telefono, double importeMaximo) {
		this.nombre=nombre;
		if(telefono<=0)
			this.telefono=0;
		this.telefono=telefono;
		if(importeMaximo>=0)
			this.importeMaximo=importeMaximo;
	}

	public Gestor(String nombre, int telefono) {
		this(nombre,telefono,10000);
	}

	
	
	public int getTelefono() {
		return this.telefono;
	}
	
	public double getImporteMaximo() {
		return this.importeMaximo;
	}
}
