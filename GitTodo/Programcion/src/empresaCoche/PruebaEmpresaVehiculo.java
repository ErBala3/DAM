package empresaCoche;
import java.util.Scanner;

public class PruebaEmpresaVehiculo {

	public static void main(String[] args) {
		int menu;
		Empresa empresa = null;
		Scanner scanner = new Scanner(System.in);

		
			do{
				System.out.println("1. Dar de alta empresa");
				System.out.println("2. Dar de alta vehículo");
				System.out.println("3. Listar todos los vehículos");
				System.out.println("4. Listar vehículos disponibles");
				System.out.println("5. Listar vehículos alquilados");
				System.out.println("6. Buscar vehículo por identificador");
				System.out.println("7. Alquilar vehículo");
				System.out.println("8. Devolver vehículo");
				System.out.println("9. Eliminar vehículo");
				System.out.println("10.Salir");
				menu = scanner.nextInt();
				try{
				switch(menu){
				case 1->empresa = new Empresa();
				case 2->empresa.nuevoVehiculo();
				case 3->empresa.mostrarInfo();
				case 4->empresa.mostrarDisponibles();
				case 5->empresa.mostrarAlquilados();
				case 6->empresa.buscarVehiculo();
				case 7->empresa.alquilarVehiculo();
				case 8->empresa.devolverVehiculo();
				case 9->empresa.eliminarVehiculo();
				case 10->System.out.println("Gracias por su visita: ");
				default->throw new IllegalArgumentException("Opcion no valida, vuelva a introducir una opción: ");
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}while(menu!=10);

		scanner.close();
	}
}
