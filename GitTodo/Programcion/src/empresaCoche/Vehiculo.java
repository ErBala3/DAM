package empresaCoche;

public class Vehiculo {

	private String identificador;
	private String marca;
	private String modelo;
	private int Kilometraje;
	private boolean disponible;

	public Vehiculo(String identificador, String marca, String modelo, int Kilometraje, String disponible) {
		try{
			setIdentificador(identificador);
			setMarca(marca);
			setModelo(modelo);
			setKilometraje(Kilometraje);
			setDisponible(disponible);
			System.out.println("Vehículo añadido correctamente");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

	public void setIdentificador(String identificador) {
		try {
			if (identificador.trim().isEmpty() || !identificador.trim().toUpperCase().matches("^[V/F][A-Z]{4}[0-9]{4}$"))
				throw new IllegalArgumentException("El identificador está mal formado");
			this.identificador = identificador.trim().toUpperCase();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public void setMarca(String marca) {
		try {
			if (marca.trim().isEmpty())
				throw new IllegalArgumentException("La marca no es correcta");
			this.marca = marca;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public void setModelo(String modelo) {
		try {
			if (modelo.trim().isEmpty())
				throw new IllegalArgumentException("El modelo no es correcto");
			this.modelo = modelo;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public void setKilometraje(int Kilometraje) {
		try {
			if (Kilometraje < 0)
				throw new IllegalArgumentException("El kilometraje no es correcto");
			this.Kilometraje = Kilometraje;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public void setDisponible(String disponible) {
		try {
			if (disponible.trim().equalsIgnoreCase("disponible")) {
				this.disponible = true;
			} else if (disponible.trim().equalsIgnoreCase("alquilado")) {
				this.disponible = false;
			} else {
				throw new IllegalArgumentException("El valor de disponible no es correcto");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getKilometraje() {
		return this.Kilometraje;
	}

	public String getDisponible() {
		String disponible;
		if (this.disponible)
			disponible = "disponible";
		else
			disponible = "alquilado";
		return disponible;
	}

	public void mostrarInfo() {
		System.out.println("Identificador: " + this.identificador);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Kilometraje: " + this.Kilometraje);
		System.out.println("Disponible: " + getDisponible());
	}

}
