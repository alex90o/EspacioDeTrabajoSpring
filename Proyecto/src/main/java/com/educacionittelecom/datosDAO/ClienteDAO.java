package com.educacionittelecom.datosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.educacionittelecom.database.Conexion;
import com.educacionittelecom.datosVO.ClienteVO;

public class ClienteDAO {
	public static void insertar(ClienteVO c) {
		Connection conexion = Conexion.conectar();
		try {
			conexion.setAutoCommit(false);
			String sql = "INSERT INTO clientes (dni,nombre,apellido,correo) VALUES (?,?,?,?)";
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, c.getDni());
			stmt.setString(2, c.getNombre());
			stmt.setString(3, c.getApellido());
			stmt.setString(4, c.getCorreo());
			stmt.execute();
			System.out.println("insertamos bien");
			conexion.commit();
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println("errores");
			e.printStackTrace();
			try {
				System.out.println("iniciando mi rollback");
				conexion.rollback();
			} catch (SQLException e2) {
				System.out.println("ERROR DE ROLLBACK");
				e2.printStackTrace();
			}
		}
	}
}
