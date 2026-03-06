package perro;

public class Perro {
	private String nombre, raza;
	private int altura;
	
	public Perro (String nombre, String raza, int altura) {
		this.nombre=nombre;
		this.raza=raza;
		this.altura=altura;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getRaza() {
		return this.raza;
	} 
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setRaza(String raza) {
		this.raza=raza;
	}
	
	public void setAltura(int altura) {
		this.altura=altura;
	}
	
	public void mostrarInfo() {
		System.out.println(this.nombre);
		System.out.println(this.raza);
		System.out.println(this.altura);
	}
	
	public void comer() {
		System.out.println(this.nombre+" está comiendo");
	}
	
	public void dormir() {
		System.out.println(this.nombre+" está durmiendo");
	}
	
	public void ladrar() {
		System.out.println(this.nombre+" está ladrando");
	}
}
