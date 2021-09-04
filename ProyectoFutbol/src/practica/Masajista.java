package practica;

public class Masajista extends SeleccionFutbol {
	private String titulacion;
	private int aniosExperiencia;
	
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	public Masajista() {}
	public void darMasaje() {
		System.out.println("Masajeando");
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		super.toString();
		return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
		
	}
	
}
