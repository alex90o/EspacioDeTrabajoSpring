package com.educacionittelecom.modules;

public  class Motorola extends Telefono implements IValidar {
private int codigo;

public Motorola() {
	super();
	
}

public Motorola(String modelo, Persona persona, int codigo) {
	super(modelo, persona);
	this.codigo = codigo;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

@Override
public String toString() {
	super.toString();
	return "Motorola [codigo=" + codigo + "]";
}
public boolean validar(Persona persona){
	return persona.getCodigo()==this.codigo;
}
}
