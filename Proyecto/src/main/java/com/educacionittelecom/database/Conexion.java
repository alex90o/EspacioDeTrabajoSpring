package com.educacionittelecom.database;



import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	static Connection conexion = null;
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/minegocio","root","");
			System.out.println("si conecto");
		}catch(Exception e) {
			System.out.println("no conecto");
			e.printStackTrace();
		}
		return conexion;
	}
}
