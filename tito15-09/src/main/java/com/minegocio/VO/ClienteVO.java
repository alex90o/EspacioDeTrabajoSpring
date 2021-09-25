package com.minegocio.VO;

import java.util.ArrayList;
import java.util.Iterator;

public class ClienteVO {
private int dni;
private String nombre;
private String apellido;
private String correo;

private ArrayList<String>productos = new ArrayList<String>();

public ClienteVO(int dni, String nombre, String apellido, String correo, ArrayList<String> productos) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
	this.productos = productos;
}

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
public ArrayList<String> getProductos() {
	return productos;
}
public void setProductos(ArrayList<String> productos) {
	this.productos = productos;
}
@Override
public String toString() {
	return "ClienteVo2 [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
			+ ", productos=" + productos + "]";
}

public void listar() {
	Iterator<String> it = productos.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());;
	}	
	}
}
