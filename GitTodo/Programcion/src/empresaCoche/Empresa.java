package empresaCoche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

	private final List<Vehiculo> flota;
	Scanner scanner = new Scanner(System.in);

	public Empresa() {
		this.flota = new ArrayList<>();
		System.out.println("Empresa dada de alta.");
	}

	public void nuevoVehiculo() {    
		Vehiculo v = null;
		do{
			try{
				System.out.println("Introduce los datos del vehiculo:");
				System.out.println("Identificador: ");
				String identificador = scanner.nextLine();
				System.out.println("Marca: ");
				String marca = scanner.nextLine();
				System.out.println("Modelo: ");
				String modelo = scanner.nextLine();
				System.out.println("Kilometraje: ");
				int kilometraje = scanner.nextInt();
				System.out.println("Disponible (disponible/alquilado): ");
				String disponible = scanner.nextLine();
				v = new Vehiculo(identificador, marca, modelo, kilometraje, disponible);
				try{
					if(flota.contains(v.getIdentificador()))
						throw new IllegalArgumentException("El vehiculo ya existe");
					this.flota.add(v);
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}while(v==null);
	}

	public void mostrarInfo() {
		try{
			if(flota.isEmpty())
				throw new NullPointerException("La flota esta vacia");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Vehiculos en la flota:");
		for (Vehiculo v : flota) {
			v.mostrarInfo();
		}
	}

	public void mostrarDisponibles() {
		try{
			if(flota.isEmpty())
				throw new NullPointerException("La flota esta vacia");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Vehiculos disponibles:");
		for (Vehiculo v : flota) {
			if (v.getDisponible().equals("disponible")) {
				v.mostrarInfo();
			}
		}
	}

	public void mostrarAlquilados(){
		try{
			if(flota.isEmpty())
				throw new NullPointerException("La flota esta vacia");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Vehiculos alquilados:");
		for (Vehiculo v : flota) {
			if (v.getDisponible().equals("alquilado")) {
				v.mostrarInfo();
			}
		}
	}

	public Vehiculo buscarVehiculo(){
		Vehiculo v = null;
		try{
			System.out.println("Introduce el identificador del vehiculo: ");
			String identificador = scanner.nextLine();
			if(identificador.trim().isEmpty())
				throw new IllegalArgumentException("El identificador no puede estar vacio");
			return buscarVehiculo(identificador);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return v;
	}

	public Vehiculo buscarVehiculo(String identificador){
		Vehiculo v = null;
		boolean encontrado=false;
		try{
			for (int i=0;i<flota.size();i++) {
				if (flota.get(i).getIdentificador().equals(identificador)) {
					v=flota.get(i);
					encontrado=true;
				}
			}
			if(!encontrado){
				throw new IllegalArgumentException("Vehiculo no encontrado");
			}else
				return v;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return v;
	}

	public void eliminarVehiculo (){
		try{
			Vehiculo v = buscarVehiculo();
			flota.remove(v);
			System.out.println("Vehiculo eliminado");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void alquilarVehiculo (){
		try{
			Vehiculo v = buscarVehiculo();
			v.setDisponible("alquilado");
			System.out.println("Vehiculo alquilado");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void devolverVehiculo (){
		try{
			Vehiculo v = buscarVehiculo();
			v.setDisponible("disponible");
			System.out.println("Vehiculo devuelto");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}

