import java.util.LinkedList;

public class Persona {
	private int dni;
	private String nombre;
	private boolean albumLleno;
	private LinkedList<Figurita> coleccion;
	
	Persona(int dni, String nombre){
		
	}
	
	Persona(int dni, String nombre,boolean albumLleno,LinkedList<Figurita> coleccion){
		if (dni < 0) {
			throw new RuntimeException("Error: el dni no puede ser "+ dni);
		}
		if (nombre == null) {
			throw new RuntimeException("Error: debe introducir un nombre");
		}
		
		this.coleccion = coleccion;
		this.albumLleno = albumLleno;
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Nombre: ").append(nombre);
		sb.append(" | ").append("DNI: ").append(dni);
		return sb.toString();
	}

	
	
	
}
