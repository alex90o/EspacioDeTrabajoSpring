package com.educacionittelecom.modulos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.educacionittelecom.conexiones.Conexion;

public class Comida {
	// atributos
	private int id;
	private String nombre;
	private double precio;
	private String descripcion;

	// constructor
	public Comida(int id, String nombre, double precio, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public Comida() {

	}

	// m�todos
	// setters y getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Comida [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + "]";
	}

	public void insertar(Comida c) {
		try {
			// paso 1 tener la conexi�n
			Connection conexion = Conexion.conectar();
			// paso 2 armar el query
			String sql = "INSERT INTO comidas (id,nombre,precio,descripcion) VALUES" + "(" + c.getId() + ",'"
					+ c.getNombre() + "'," + c.getPrecio() + "" + ",'" + c.getDescripcion() + "')";
			// paso 3 crear el estado
			Statement stmt = conexion.createStatement();
			// paso 4 ejecutamos
			stmt.execute(sql);
			System.out.println("guardado");
			// paso 5 cerrar todo
			stmt.close();// cerramos el estado
			conexion.close();//cerramos la conexi�n
		} catch (Exception e) {
			System.out.println("no pude guardar");
			e.printStackTrace();
		}
	}
	
	public static void borrar(int id) {
		try {
			Connection conexion = Conexion.conectar();
			String sql = "DELETE FROM comidas WHERE id = '"+ id +"'";
			Statement stmt = conexion.createStatement();
			stmt.execute(sql);
			System.out.println("Eliminado");
			stmt.close();
			conexion.close();
		}catch(Exception e) {
			System.out.println("Error no pude borrar");
			e.printStackTrace();
		}
	}

/*
	public void editar(Comida c) {
		try {
			Connection conexion = Conexion.conectar();
			String sql = "UPDATE comidas SET nombre = '"+ c.getNombre() 
			+"',descripcion = '"+ c.getDescripcion() 
			+"' WHERE id = '"+ c.getId() +"'";
			Statement stmt = conexion.createStatement();
			stmt.execute(sql);
			System.out.println("Editado!");
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println("Error no pude editar");
			e.printStackTrace();
		}
	}
*/	
	public void editar(Comida c) {
		try {
			Connection conexion = Conexion.conectar();
			String sql = "UPDATE comidas SET nombre = '"+ c.getNombre() +"' ,precio = '"+ c.getPrecio() + ""
			+"',descripcion = '"+ c.getDescripcion() 
			+"' WHERE id = '"+ c.getId() +"'";
			Statement stmt = conexion.createStatement();
			stmt.execute(sql);
			System.out.println("Editado!");
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println("Error no pude editar");
			e.printStackTrace();
		}
	}
	
	public static void listar() {
		try {
			Connection conexion = Conexion.conectar();
			String sql = "SELECT *FROM comidas";
			Statement stmt = conexion.createStatement();
			ResultSet datos = stmt.executeQuery(sql);
			System.out.println("mostrando datos:");
			while (datos.next()) {
				System.out.println("Id: " +datos.getInt("id"));
				System.out.println("Nombre: "+ datos.getString("nombre"));
				System.out.println("Precio: " +datos.getDouble("precio"));
				System.out.println("Descripción: "+ datos.getString("descripcion"));
				System.out.println("\t************\n");
				
			}
			
		
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println("Error no pude editar");
			e.printStackTrace();
		}
	}
}
