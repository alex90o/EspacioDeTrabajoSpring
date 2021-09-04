package com.educacionittelecom.modules;

public abstract class Telefono implements IEncender {
private String modelo;
private Persona persona;

public Telefono(String modelo, Persona persona) {
	this.modelo = modelo;
	this.persona = persona;
}
public Telefono() {
	
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public Persona getPersona() {
	return persona;
}
public void setPersona(Persona persona) {
	this.persona = persona;
}

public void encender() {
	System.out.println(EN);
}
public void apagar() {
	System.out.println(AP);
}
}
