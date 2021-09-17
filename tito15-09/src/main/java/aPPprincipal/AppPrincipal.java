package aPPprincipal;

import java.util.ArrayList;

import com.minegocio.DAO.ClienteDAO;
import com.minegocio.VO.ClienteVO;
import com.minegocios.Conexion;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conexion.conectar();
		ArrayList<String> p = new ArrayList<String>();
		p.add("lapicera");
		p.add("borrador");
		p.add("regla");
		ClienteVO c1= new ClienteVO(123,"Pepe","Perez","pepe@correo.com",p);
		ClienteDAO cd1=new ClienteDAO();
		cd1.insertar(c1);
		
	}

}
