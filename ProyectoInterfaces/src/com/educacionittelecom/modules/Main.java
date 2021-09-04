package com.educacionittelecom.modules;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Uno a = new Uno();
		a.saludar();
		Dos b = new Dos();
		b.cantar();
		b.mostrar();
		*/
		Persona Y = new Persona();
		Y.setNombre("Yanina");
		Y.setCodigo(123);
		Motorola my = new Motorola("Edge", Y, 123);
		System.out.println("Telefono de "+ Y.getNombre()+" , estado "+my.validar(Y)); 
		
	}

}
