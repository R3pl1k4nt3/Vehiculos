package vehiculos;

import java.util.Comparator;

import ejemplos_uso.Acelerable;
import ejemplos_uso.Movible;

public class Vehiculo implements Acelerable, Comparable<Vehiculo> {

	private static final String MODELO_NO_DISPONIBLE = "N/A";
	public static final Comparator<Vehiculo> COMPARADOR_LONGITUD_MODELO = new Comparator<Vehiculo>() {
		@Override
		public int compare(Vehiculo arg0, Vehiculo arg1) {
			return arg0.getModelo().length() - arg1.getModelo().length();
		}
	};
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

	@Override
	public int compareTo(Vehiculo other) {
		int resultado = COMPARADOR_LONGITUD_MODELO.compare(this, other);
		if(resultado == 0) {
			resultado = getColor().compareTo(other.getColor());
		}
		if(resultado == 0) {
			
		}
		
		return resultado;
		//return getModelo().compareTo(other.getModelo());
	}

}