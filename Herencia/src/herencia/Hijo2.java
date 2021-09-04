package herencia;

public class Hijo2 extends Padre {
	public int notas;
	public String viaje;
	public Hijo2(String n, int e, int not, String v) {
		super(n,e);
		notas = not;
		viaje = v;
	}
	public int mostrarNotas() {
		return notas;
	}
	public void informar() {
		super.informar();
		System.out.println("le gusta viajar por "+ viaje);
	}
}
