package perro;

public class PruebaPerro {

	public static void main(String[] args) {
		Perro p1= new Perro("Lolo", "Yorksire", 15);
		
		p1.mostrarInfo();
		p1.setNombre("Franco");
		p1.setRaza("Francisco");
		p1.setAltura(95);
		
		p1.getRaza();
		p1.getNombre();
		p1.getAltura();
		
		p1.comer();
		p1.dormir();
		p1.ladrar();
	}

}
