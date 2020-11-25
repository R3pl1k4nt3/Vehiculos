package vehiculos;

import ejemplos_uso.Acelerable;
import ejemplos_uso.Movible;

public class Vehiculo implements Acelerable {

	private static final String MODELO_NO_DISPONIBLE = "N/A";
	private String modelo;
	private String color;
	protected float velocidad = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	protected String getModelo() {
		return modelo == null ? MODELO_NO_DISPONIBLE : modelo + " (" + getColor() + ")";
	}

	public Vehiculo() {
	}

	public Vehiculo(String modelo, String color) {
		this.modelo = modelo;
		setColor(color);
	}

	@Override
	public String toString() {
		return modelo + " (" + getColor() + ")";
	}

	@Override
	public float getVelocidad() {
		return velocidad ;
	}

	@Override
	public float getAceleracion() {
		return 2;
	}

}