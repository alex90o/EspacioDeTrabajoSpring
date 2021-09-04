package practica;

public class Entrenador extends SeleccionFutbol {
private String idFederacion;

public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
	super(id, nombre, apellidos, edad);
	this.idFederacion = idFederacion;
}
public Entrenador() {
	
}
public String getIdFederacion() {
	return idFederacion;
}
public void setIdFederacion(String idFederacion) {
	this.idFederacion = idFederacion;
}
public void dirigirPartido() {
	System.out.println("Iniciamos equipo!");
}
public void dirigirEntrenamiento() {
	System.out.println("Vamos!");
}
@Override
public String toString() {
	super.toString();
	return "Entrenador [idEntrenador=" + idFederacion + "]";
}
}
