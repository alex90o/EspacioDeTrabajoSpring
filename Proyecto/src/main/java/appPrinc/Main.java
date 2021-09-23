package appPrinc;

import com.educacionittelecom.database.Conexion;
import com.educacionittelecom.datosDAO.datosDAO.ClienteDAO;
import com.educacionittelecom.datosDAO.datosVO.ClienteVO;

public class Main {

	public static void main(String[] args) {
		//Conexion.conectar();
		ClienteVO c = new ClienteVO(123,"Austry","Castillo","castilloaustry@gmail.com");
		ClienteDAO.insertar(c);
	}

}
