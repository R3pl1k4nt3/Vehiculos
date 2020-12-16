package ejemplos_uso;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Motor;
import vehiculos.Vehiculo;

public class EjemploOrdenacion {

	public static void main(String[] args) {
		List<String> listaStrings = Arrays.asList("a", "c", "b", "ab");
		Collection<String> strings = listaStrings;
		System.out.println(strings);
		
		listaStrings.sort(null);
		// strings.sort() // Error
//		((List<String>)strings).sort(null);
		listaStrings.sort(Comparator.reverseOrder());
		Collection<String> listaOrdenada = ordenar(strings);
		
		System.out.println(strings);
		System.out.println(listaOrdenada);
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Coche("B", "Rojo"));
		vehiculos.add(new Coche("C", "Blanco"));
		vehiculos.add(new Coche("A", "Verde"));
		
		Comparator<Vehiculo> comparador = new Comparator<Vehiculo>() {

			@Override
			public int compare(Vehiculo v1, Vehiculo v2) {
				return v1.getColor().compareTo(v2.getColor());
			}
		};
		
		// En lambda es:
		// comparador = (v1, v2) -> v1.getColor().compareTo(v2.getColor());
		
		System.out.println(vehiculos);
		vehiculos.sort(null);
		System.out.println(vehiculos);
		
		vehiculos = Arrays.asList(
			    new Coche("Volvo", "Gris"),
			    new Vehiculo("Tricico", "Rosa"),
			    new Moto("Aprilla", "Azul")
			  );

		vehiculos.forEach(System.out::println);
		vehiculos.sort(null);//Vehiculo.COMPARADOR_LONGITUD_MODELO);

		System.out.println("\nLista ordenada (por modelo):");
		vehiculos.forEach(System.out::println);
		
//		Coche c = new Coche(null, "B", 4, new Motor("C", 90.4f));
//		System.out.println(c);
//		System.out.println(c.getMotor());
		
//		try {
//			Method method = c.getClass().getDeclaredMethod("getModelo");
//			System.out.println(method.invoke(c));
//		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//			e.printStackTrace();
//		}
	}

	public static <T> List<T> ordenar(Collection<T> collection) {
		List<T> list = new ArrayList<T>(collection);
		list.sort(null);
		return list;
	}
}
