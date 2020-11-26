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
<<<<<<< HEAD
		return modelo == null ? MODELO_NO_DISPONIBLE : modelo;
//		return modelo;
=======
		return modelo == null ? MODELO_NO_DISPONIBLE : modelo + " (" + getColor() + ")";
>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600
	}

	public Vehiculo() {
	}

	public Vehiculo(String modelo, String color) {
		this.modelo = modelo;
		setColor(color);
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return getModelo() + "(" + getColor() + ")";
=======
		return modelo + " (" + getColor() + ")";
	}

	@Override
	public float getVelocidad() {
		return velocidad ;
	}

	@Override
	public float getAceleracion() {
		return 2;
>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600
	}

}