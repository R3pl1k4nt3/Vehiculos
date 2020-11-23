package vehiculos;

public abstract class VehiculoConRuedas extends Vehiculo {
	
	public VehiculoConRuedas() {
		super();
	}

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}
	
	public abstract int getNumerodeRuedas();

	@Override
	public String toString() {
		return super.toString() + ", " + getNumerodeRuedas() + " ruedas.";
	}
}
