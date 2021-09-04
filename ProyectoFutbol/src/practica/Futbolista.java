package practica;



public class Futbolista extends SeleccionFutbol {
//atributos
private int dorsal;
private String demarcarcion;
//constructor
public Futbolista (int dorsal, String demarcacion) {
	
}
public Futbolista (int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellido;
	this.edad = edad;
	this.dorsal = dorsal;
	this.demarcarcion = demarcacion;
}
public void jugarPartido() {
	System.out.println("jugndo partido");
}
public void entrenar() {
	System.out.println("jugador entrenando");
}
@Override
public String toString() {
	return "Futbolista [dorsal=" + dorsal + ", demarcarcion=" + demarcarcion + "]"+super.toString();
}
public int getDorsal() {
	return dorsal;
}
public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}
public String getDemarcarcion() {
	return demarcarcion;
}
public void setDemarcarcion(String demarcarcion) {
	this.demarcarcion = demarcarcion;
}

}
