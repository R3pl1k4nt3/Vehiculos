package ejemplos_uso;

import static vehiculos.Coche.*;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Ejemplo {

	public static void main(String[] args) {

		String colorPorDefecto = "Rojo";
<<<<<<< HEAD:src/vehiculos/Ejemplo.java
		Vehiculo miCoche = new Coche("Verde");// .modelo("Mercedes Benz");;
		Vehiculo miCoche2 = new Coche("Azul");

		Moto moto1 = new Moto("Honda CBR", "Verde");
		moto1.setMatricula("0666 BNB");
		System.out.println(moto1);
=======
		Vehiculo miCoche = new Coche("Mercedes", "Verde", 4);// .modelo("Mercedes Benz");
		Vehiculo miMoto = new Moto("BMW", "Azul");
>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600:src/ejemplos_uso/Ejemplo.java
//		miCoche.modelo = "Ford Fiesta";
//		miCoche.color = colorPorDefecto;

//		miCoche.setColor(colorPorDefecto);
<<<<<<< HEAD:src/vehiculos/Ejemplo.java
		System.out.println(miCoche);

//		miCoche2 = Coche.crearConModelo("Seat Ibiza");

		miCoche = miCoche2;
=======
//		System.out.println(miCoche);

//		miCoche2 = Coche.crearConModelo("Seat Ibiza");

>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600:src/ejemplos_uso/Ejemplo.java
//		miCoche2.modelo = "Opel Astra";
//		miCoche2.color = "Azul";

//		miCoche2.color = colorPorDefecto;

		System.out.println(miCoche);
		System.out.println(miMoto);
	}

}
