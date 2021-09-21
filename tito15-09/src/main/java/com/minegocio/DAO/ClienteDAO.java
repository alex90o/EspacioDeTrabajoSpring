
//DAO DATA ACCESS OBJECT
//ESTADOS, OPERACIONES PREPARADAS
//JTA -> transacciones


package com.minegocio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.minegocios.Conexion;
import com.minegocio.VO.ClienteVO;
import com.minegocio.interfaces.IOperaciones;

public class ClienteDAO implements IOperaciones {

	public void insertar(ClienteVO c) {
		Connection conexion = Conexion.conectar();
		try {
			conexion.setAutoCommit(false);// quitamos el moto autom�tico JTA
			String sql = "INSERT INTO clientes " + "(dni,nombre,apellido,correo)" + "VALUES (?,?,?,?)";
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, c.getDni());
			stmt.setString(2, c.getNombre());
			stmt.setString(3, c.getApellido());
			//stmt.setString(4, c.getCorreo());
			stmt.execute();
			System.out.println("guardado!");
			conexion.commit();// confirmamos en la bd JTA
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println("Ups no pude guardar");
			e.printStackTrace();
			try {
				System.out.println("haciendo rollback");
				conexion.rollback();//revertimos la operaci�n JTA
			} catch (SQLException e2) {
				System.out.println("Ups error con el rollback");
				System.out.println(e2.getMessage());
				e.printStackTrace();
			}
		}
	}

	public void buscarCliente(int dni) {
		try {
			String sql = "SELECT *FROM clientes WHERE dni = ?";
			Connection conexion = null;
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, dni);
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				System.out.println("dni: " + result.getInt("dni"));
				System.out.println("nombre: " + result.getString("nombre"));
				System.out.println("apellido: " + result.getString("apellido"));
				System.out.println("correo: " + result.getString("correo"));
			}
			conexion.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println("no podemos mostrar");
			e.printStackTrace();
		}
		
	}
	
	public void modificar (ClienteVO c) {
	 Connection conexion = com.minegocios.Conexion.conectar();
	 try {
		 String sql = "UPDATE cliente ser nombre = ?, apellido = ?, correo = ?"
				 +"WHERE dni =?";
		 PreparedStatement stmt = conexion.prepareStatement(sql);
		 stmt.setString(1,c.getNombre());
		 stmt.setString(2,c.getApellido());
		 stmt.setString(3,c.getCorreo());
		 stmt.setInt(4, c.getDni());
		 stmt.executeUpdate();
		 System.out.println("Se actualizaron los datos de "+ c.getNombre());
		 stmt.close();
		 conexion.close();
		 
	} catch (Exception e) {
		System.out.println("no puedo modificar");
		e.printStackTrace();
	}
	}
	
	public void eliminar(int dni) {
		Connection conexion = Conexion.conectar();
		try {
			String sql = "DELETE FROM clientes WHERE dni = ? ";
			PreparedStatement stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, dni);
			stmt.execute();
			System.out.println("Eliminado");
			stmt.close();
			conexion.close();
		}catch (Exception e) {
			System.out.println("no puedo eliminar");
			e.printStackTrace();
		}
	}
}





























/*package com.minegocio.DAO;
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

	
*/