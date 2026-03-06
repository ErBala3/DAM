package producto;

public class Producto {
	private String nombre;
	private double precio=0;

	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		if(precio<0)
		{
			System.out.println("El precio no puede ser negativo, se ha asignado a 0 de manera automática");
		}else
		this.precio=precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double precio) {
		if(precio<=0)
			System.out.println("Error, no se puede cambiar el precio porque no puede ser negativo.");
		else
		this.precio=precio;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Precio: "+ this.precio);
	}
}
