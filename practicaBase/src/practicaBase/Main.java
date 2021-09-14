package practicaBase;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Connection conexion = DataBase.Conectar();
		if(conexion != null)
			System.out.println("conectamos");
		else 
			System.out.println("no conectamos");
	}

}
