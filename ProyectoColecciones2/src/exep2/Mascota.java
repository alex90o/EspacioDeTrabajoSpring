package exep2;

public class Mascota implements Comparable<Mascota> {
private int edad;
private String tipo;
private String nombre;
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Mascota(int edad, String tipo, String nombre) {
	this.edad = edad;
	this.tipo = tipo;
	this.nombre = nombre;
}
public Mascota() {
	
}
@Override
public String toString() {
	return "Mascota [edad=" + edad + ", tipo=" + tipo + ", nombre=" + nombre + "]";
}
@Override
public int compareTo(Mascota o) {
	// TODO Auto-generated method stub
	return this.edad - o.edad;
}
public int compareTo1(Mascota o) {
	// TODO Auto-generated method stub
	return this.nombre.compareTo(o.nombre);
}


}
