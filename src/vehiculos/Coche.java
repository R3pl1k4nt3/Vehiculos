package vehiculos;

public class Coche extends VehiculoConRuedas {

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

	public Coche() {
		this("Blanco");
	}

	public Coche(String color) {
		this(null, color);
	}

	public Coche(String modelo, String color) {
		this(modelo, color, 4);
	}

	public Coche(String modelo, String color, int ruedas) {
		super(modelo, color);
		numeroDeRuedas = ruedas;
	}

	@Override
	public String toString() {
		return "Placa " + matricula + " - " + super.toString() + ", " + numeroDeRuedas + " ruedas";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((getModelo() == null) ? 0 : getModelo().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (getModelo() == null) {
			if (other.getModelo() != null)
				return false;
		} else if (!getModelo().equals(other.getModelo()))
			return false;
		return true;
	}

	@Override
	public int getNumerodeRuedas() {
		return 4;
	}

}
