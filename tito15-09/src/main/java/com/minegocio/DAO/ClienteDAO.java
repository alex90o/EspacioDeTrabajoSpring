package com.minegocio.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


import com.minegocio.VO.ClienteVO;
import com.minegocio.interfaces.IOperaciones;
import com.minegocios.Conexion;

public class ClienteDAO implements IOperaciones{
	
	public void insertar(ClienteVO c) {
		// TODO Auto-generated method stub
		Connection conexion = Conexion.conectar();
		try {
			String sql = "INSET INTO clientes "+
					"(dni,nombre,apellido,correo"
					+"VALUES (?,?,?,?)";
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1,c.getDni());
			stmt.setString(2, c.getNombre());
			stmt.setString(3, c.getApellido());
			stmt.setString(4,c.getCorreo());
			stmt.execute();
			System.out.println("guardado !!!");
			stmt.close();
			
		}catch (Exception e) {
			System.out.println("UPSSS no puede guardar");
			e.printStackTrace();
		}
		}
		
	}

	
