package com.educacionittelecom.database;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	static Connection conexion = null;

	public static Connection conectar() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mariadb://localhost/minegocio","root", "");
			System.out.println("Si conecta");
		} catch (Exception e) {
			System.out.println("no conecta");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return conexion;
	}
}
