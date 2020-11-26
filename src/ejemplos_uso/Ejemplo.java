package ejemplos_uso;

import static vehiculos.Coche.*;

import java.util.ArrayList;
import java.util.Collection;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Ejemplo {

	public static void main(String[] args) {

//		String colorPorDefecto = "Rojo";
//		Vehiculo miCoche = new Coche("Mercedes", "Verde", 4);// .modelo("Mercedes Benz");
//		Vehiculo miMoto = new Moto("BMW", "Azul");
////		miCoche.modelo = "Ford Fiesta";
////		miCoche.color = colorPorDefecto;
//
////		miCoche.setColor(colorPorDefecto);
////		System.out.println(miCoche);
//
////		miCoche2 = Coche.crearConModelo("Seat Ibiza");
//
////		miCoche2.modelo = "Opel Astra";
////		miCoche2.color = "Azul";
//
////		miCoche2.color = colorPorDefecto;
//
//		System.out.println(miCoche);
//		System.out.println(miMoto);
		String matricula = "1234ABC";
		Coche coche = new Coche("Rojo", "Ford Fiesta"); // ¿por que no usar variable Vehiculo?
		coche.setMatricula(matricula);
		Vehiculo moto = new Moto("Suzuki", "Verde");
		Collection<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(coche);
		vehiculos.add(moto);
		System.out.println(vehiculos);
		vehiculos.forEach(System.out::println);
		System.out.println("\nQuito la moto");
		vehiculos.remove(moto);
		vehiculos.forEach(System.out::println);
		
		
		//
		
		coche = new Coche("Blanco", "Ford Fiesta");
		coche.setMatricula(matricula);
		
		System.out.println("\nAñado nuevo coche");
		vehiculos.add(coche);
		vehiculos.forEach(System.out::println);
		
		System.out.println("\nQuito coche " + coche);
		vehiculos.remove(coche);
		vehiculos.forEach(System.out::println);
		
		
	}

}
