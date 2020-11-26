package ejemplos_uso;

import java.util.Comparator;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Vehiculo;
import vehiculos.VehiculoConRuedas;

public class EjemploAnonima {

	private static String colorValido2 = "Verde";
	
	public static void main(String[] args) {
		Vehiculo original = new Vehiculo("Original", null);
		System.out.println(original.getClass());

		Vehiculo anonimo = new VehiculoConRuedas("Anonimo", null) {
			public String ancla = "Ancla standard";

			@Override
			public String getColor() {
				return super.getColor() + "*";
			}

			@Override
			public String toString() {
				return super.toString() + " " + ancla;
			}

			@Override
			public int getNumeroDeRuedas() {
				return 0;
			}

		};

		VehiculoConRuedas triciclo = new VehiculoConRuedas("Fisher-Price", "Multicolor") {
			int numeroRuedas = 0;
			
			@Override
			public int getNumeroDeRuedas() {
				return numeroRuedas++;
			}

		};
		
		System.out.println(anonimo.getClass());

		System.out.println(original);
		System.out.println(anonimo);
		System.out.println(triciclo);
		System.out.println(triciclo);
		System.out.println(triciclo);
		System.out.println(triciclo);
		
		String colorValido1 = "Azul";
//		String colorValido2 = "Verde";
		
		Moto harley = new Moto("Harley-Davidson", "Rojo") {

		    @Override
		    public void setColor(String color) {
		        if(!(color.equals(colorValido1) || color.equals(colorValido2))) {
		            System.out.println("No se permite ese color para " + getModelo());
		        }
		        else {
		            super.setColor(color);
		        }
		    }
		    
		  };
		  harley.setColor("Verde");
		  System.out.println(harley);
	}

}
