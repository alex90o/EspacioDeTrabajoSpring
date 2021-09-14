package practicas;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

	public DataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/equipo", "root", "");
			if(conexion!=null)
				System.out.println("Conectado ; )");
			
		}catch(Exception e) {
			System.out.println("Up no conecta : (");
			e.printStackTrace();
		}
	}
}
