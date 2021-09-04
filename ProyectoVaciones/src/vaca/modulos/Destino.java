package vaca.modulos;

import java.util.Arrays;

public abstract class Destino {
//atributos
	public String nombre;
	public String clima;
	public String []actividades;
	public String []hoteles;
	public double precio;
	public String transporte;
	public String ubicacion;
	//métodos
	public Destino() {
		
	}
	public Destino(String nombre, String clima,String []actividades,
			String []hoteles, double precio, String transporte, String ubicacion) {
		this.nombre = nombre;
		this.clima = clima;
		this.actividades = actividades;
		this.hoteles = hoteles;
		this.precio = precio;
		this.transporte = transporte;
		this.ubicacion = ubicacion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public String[] getActividades() {
		return actividades;
	}
	public void setActividades(String[] actividades) {
		this.actividades = actividades;
	}
	public String[] getHoteles() {
		return hoteles;
	}
	public void setHoteles(String[] hoteles) {
		this.hoteles = hoteles;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTransporte() {
		return transporte;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "Destino [nombre=" + nombre + ", clima=" + clima + ", actividades=" + Arrays.toString(actividades)
				+ ", hoteles=" + Arrays.toString(hoteles) + ", precio=" + precio + ", transporte=" + transporte
				+ ", ubicacion=" + ubicacion + "]";
	}
	
}
