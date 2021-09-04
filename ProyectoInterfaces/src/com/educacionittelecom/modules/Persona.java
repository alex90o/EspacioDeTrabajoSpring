package com.educacionittelecom.modules;

public class Persona {
private String nombre;
private int codigo;
private String huella;
private String face;
public Persona(String nombre, int codigo, String huella, String face) {
	
	this.nombre = nombre;
	this.codigo = codigo;
	this.huella = huella;
	this.face = face;
}
public Persona() {
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getHuella() {
	return huella;
}
public void setHuella(String huella) {
	this.huella = huella;
}
public String getFace() {
	return face;
}
public void setFace(String face) {
	this.face = face;
}


}
