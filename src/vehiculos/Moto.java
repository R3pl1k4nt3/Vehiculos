package vehiculos;

public class Moto extends VehiculoConRuedas {

<<<<<<< HEAD
	private int numeroDeRuedas;
	private String matricula;

	public void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Moto(String modelo, String color) {
		this(modelo, color, 2);
	}

	public Moto(String modelo, String color, int ruedas) {
		super(modelo, color);
		numeroDeRuedas = ruedas;
	}

	@Override
	public String toString() {
		return "Placa " + matricula + " - " + super.toString() + ", " + numeroDeRuedas + " ruedas";
	}

	public void setModelo(String modelo) {
	}

	@Override
	public int getNumerodeRuedas() {
		return 2;
	}

}
=======
	public Moto(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public int getNumeroDeRuedas() {
		return 2;
	}

	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}

}
>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600
