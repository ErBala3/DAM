package coche;

public class PruebaCoche {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Mustang", "gt", 2015);
		c1.mostrarInfo();
		
		System.out.println();
		c1.acelerar(10);
		System.out.println("Velocidad actual: " + c1.GetVelocidad());
		c1.frenar(5);
		System.out.println("Velocidad actual: " + c1.GetVelocidad());
		c1.frenar(10);
		System.out.println("Velocidad actual: " + c1.GetVelocidad());
		
		System.out.println();
		c1.mostrarInfo();

	}

}
