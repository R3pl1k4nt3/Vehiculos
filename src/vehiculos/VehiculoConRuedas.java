package vehiculos;

<<<<<<< HEAD
public abstract class VehiculoConRuedas extends Vehiculo {
=======
public abstract class VehiculoConRuedas extends Vehiculo implements Arrancable {
>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600

	public VehiculoConRuedas() {
		super();
	}

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}

<<<<<<< HEAD
	public abstract int getNumerodeRuedas();

	@Override
	public String toString() {
		return super.toString() + ", " + getNumerodeRuedas() + " ruedas.";
	}
}
=======
	public abstract int getNumeroDeRuedas();

	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}

//	@Override
//	public void arrancar() {
//		System.out.println("Vehiculo con ruedas arrancado");
//		
//	}
	
	

}
>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600
