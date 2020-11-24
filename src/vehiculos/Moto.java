package vehiculos;

public class Moto extends VehiculoConRuedas {

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