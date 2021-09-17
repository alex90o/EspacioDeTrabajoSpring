package appprincipal;

import com.educacionittelecom.conexiones.Conexion;
import com.educacionittelecom.modulos.Comida;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Conexion.conectar();
		 //Comida c1 = new Comida(123,"Asado", 200, "El Asado de Candela");
		 //c1.insertar(c1);
		 
		//Comida c2 = new Comida(4,"Lentejas",100,"Las lentejas de Lourdes");
		//c2.insertar(c2);
		//Comida.borrar(1);
		
		//editar comida
		Comida c3 = new Comida(3, "Milanesas de Pollo", 200, "Don Tito");
		c3.editar(c3); // ver si puedo arreglar el precio
		 //Comida c4 = new Comida(3, "sopa", 200, "Don Tito");
		 //c4.editar(c4);
		// Comida.listar();
		 
	}

}
