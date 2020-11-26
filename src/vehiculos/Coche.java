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
		velocidad = 5;
	}

<<<<<<< HEAD
	@Override
	public String toString() {
		return "Placa " + matricula + " - " + super.toString() + ", " + numeroDeRuedas + " ruedas";
=======
//	public Coche color(String color) {
//		setColor(color);
//		return this;
//	}
//	
//	public Coche modelo(String modelo) {
//		this.modelo = modelo;
//		return this;
//	}

//	public static Coche crearConModelo(String modelo) {
//		Coche coche = new Coche();
//		coche.modelo = modelo;
//		return coche;
//	}

	@Override
	public String toString() {
		return "Placa " + matricula + " - " + super.toString();
>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600
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
<<<<<<< HEAD
	public int getNumerodeRuedas() {
		return 4;
=======
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
	
	@Override
	public void arrancar() {
		System.out.println("Coche arrancado");
>>>>>>> 12d799a2ef3d76e0fdb76e46413b1c9b954d7600
	}

}
