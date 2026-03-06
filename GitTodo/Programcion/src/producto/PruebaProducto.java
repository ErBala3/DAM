package producto;

public class PruebaProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Toallitas", 2.57);
		p1.mostrarInformacion();
		p1.setPrecio(5.03);
		System.out.println();
		p1.mostrarInformacion();
		System.out.println();
		p1.setPrecio(-3.64);
		p1.mostrarInformacion();
	}

}
