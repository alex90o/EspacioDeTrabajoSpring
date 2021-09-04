package herencia;

public class Padre {
	public String nombre;
	public int edad;
	public Padre(String n, int e) {
		nombre = n;
		edad = e;
	}
	public Padre() {}
	public void informar() {
		System.out.println("Nombre " + nombre + " Edad " + edad);
	}
}
