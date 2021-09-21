package aPPprincipal;

import java.util.ArrayList;

import com.minegocio.DAO.ClienteDAO;
import com.minegocio.VO.ClienteVO;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conexion.conectar();
		/*ArrayList<String> p = new ArrayList<String>();
		p.add("lapicera");
		p.add("borrador");
		p.add("regla");
		ClienteVO c1= new ClienteVO(123,"Pepe","Perez","pepe@correo.com",p);
		ClienteDAO cd1=new ClienteDAO();
		cd1.insertar(c1);
		*/
		//ClienteDAO cd2 = new ClienteDAO();
		//cd2.buscarPersona(123);
		/*ClienteVO c4 = new ClienteVO(123,"Petra","Gomez", "p@web.com");
		ClienteDAO cd3 = new ClienteDAO();
		cd3.modificar(c4);
		*/
		ClienteDAO cd4 = new ClienteDAO();
		cd4.eliminar(123);
		
	}

}
