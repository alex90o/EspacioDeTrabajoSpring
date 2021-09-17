package com.minegocios;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
static Connection conexion = null;
public static  Connection conectar() {
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		conexion = DriverManager.getConnection("jdbc:mariadb://localhost/equipo",
				"root", "");
		System.out.println("si conecto");
	}catch (Exception e) {
		
		System.out.println("no conecto");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return conexion;
}
}
