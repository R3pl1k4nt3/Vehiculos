package vehiculos;

public interface Arrancable {
	
	default void arrancar() {
		System.out.println("Ha arrancado");
	}
	
	
}
