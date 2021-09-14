package practicaBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
public static Connection Conectar() throws Exception{
	Class.forName("org.mariadb.jdbc.Driver");
	Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost/equipo", "root", "");
	return conexion;
}
}
