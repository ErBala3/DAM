package persona;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona p1= new Persona("Pepe", 26);
		p1.mostrarInfo();
		System.out.println();
		
		p1.setNombre("Juan");
		p1.setEdad(18);
		p1.mostrarInfo();
		
		System.out.println("\nLa persona se llama "+p1.getNombre()+" y tiene "+p1.getEdad());
		
		Persona p2 =p1;
		p2.setNombre("Marcos");
		p2.setEdad(22);
		p1.mostrarInfo();
		System.out.println();
		
		p2 = new Persona("Carlos", 99);
		p2.mostrarInfo();
		
	} 

}
