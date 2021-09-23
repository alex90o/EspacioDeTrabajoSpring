package com.educacionittelecom.datosVO;

public class ClienteVO {
	private int dni;
	private String nombre;
	private String apellido;
	private String correo;
	public ClienteVO(int dni, String nombre, String apellido, String correo) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}
	public ClienteVO() {
		
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "ClienteVO [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + "]";
	}
	
}
