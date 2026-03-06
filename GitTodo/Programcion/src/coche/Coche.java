package coche;

public class Coche {
	String marca;
	String modelo;
	int año;
	int velocidad=0;

	public Coche(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}	

	public void acelerar(int velocidad) {
		if(velocidad<0)
			System.out.println("La aceleración no puede ser negativa.");
		else
			this.velocidad += velocidad;
	}

	public void frenar(int velocidad) {
		if(this.velocidad-velocidad<0)
			this.velocidad=0;
		else if(velocidad>0)
			System.out.println("El frenado no puede ser positivo");
		else
			this.velocidad -= velocidad;
		
	}

	public void SetMarca(String marca){
		this.marca=marca;
	}

	public void SetModelo(String modelo){
		this.modelo=modelo;
	}

	public void SetAño(int año){
		this.año=año;
	}

	public void SetVelocidad(int velocidad){
		this.velocidad=velocidad;
	}

	public int GetVelocidad(){
		return this.velocidad;
	}

	public String GetMarca(){
		return this.marca;
	}

	public String GetModelo(){
		return this.modelo;
	}

	public int GetAño(){
		return this.año;
	}

	public void mostrarInfo() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Año: " + this.año);
		System.out.println("Velocidad: " + this.velocidad);
	}
}
