package ejemplos_uso;

import java.util.Arrays;
import java.util.List;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class EjemploComparable {

	public static void main(String[] args) {
		
		List<Vehiculo> vehiculos = Arrays.asList(
			    new Coche("Gris", "Volvo"),
			    new Vehiculo("Triciclo", "Rosa"),
			    new Moto("Aprilla", "Azul")
			  );

			vehiculos.forEach(System.out::println);
			vehiculos.sort(null);

			System.out.println("\nLista ordenada (por modelo):");
			vehiculos.forEach(System.out::println);
	}

}
