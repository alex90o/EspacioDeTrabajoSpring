package appPrinc;

import com.educacionittelecom.database.Conexion;
import com.educacionittelecom.datosDAO.ClienteDAO;
import com.educacionittelecom.datosVO.ClienteVO;


public class Main {

	public static void main(String[] args) {
		//Conexion.conectar();
		//ClienteVO c = new ClienteVO(123,"Austry","Castillo","castilloaustry@gmail.com");
		//ClienteDAO.insertar(c);
		//ClienteVO c = new ClienteVO(505,"Tito","Lindo","TITO@gmail.com");
		//ClienteDAO.insertar(c);
		//desde el formuluario no me toma todavia
		ClienteVO c = new ClienteVO(2409,"Desde","Spring","Spring@live.com.ar");
		ClienteDAO.insertar(c);
	}

}
