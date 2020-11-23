package vehiculos;

import static vehiculos.Coche.*;

public class Ejemplo {

	public static void main(String[] args) {

		String colorPorDefecto = "Rojo";
		Vehiculo miCoche = new Coche("Verde");// .modelo("Mercedes Benz");;
		Vehiculo miCoche2 = new Coche("Azul");

		Moto moto1 = new Moto("Honda CBR", "Verde");
		moto1.setMatricula("0666 BNB");
		System.out.println(moto1);
//		miCoche.modelo = "Ford Fiesta";
//		miCoche.color = colorPorDefecto;

//		miCoche.setColor(colorPorDefecto);
		System.out.println(miCoche);

//		miCoche2 = Coche.crearConModelo("Seat Ibiza");

		miCoche = miCoche2;
//		miCoche2.modelo = "Opel Astra";
//		miCoche2.color = "Azul";

//		miCoche2.color = colorPorDefecto;

		System.out.println(miCoche);
		System.out.println(miCoche2);
	}

}
