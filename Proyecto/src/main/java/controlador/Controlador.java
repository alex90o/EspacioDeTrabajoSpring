package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionittelecom.datosDAO.ClienteDAO;
import com.educacionittelecom.datosVO.ClienteVO;

/**
 * Servlet implementation class Controlador
 */
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PARA MOSTRAR EN LA PANTALLA
		PrintWriter textos = response.getWriter();
		textos.print("Nombre: " + request.getParameter("nombre"));
		textos.print("Apellido: " + request.getParameter("apellido"));
		textos.print("Dni: " + request.getParameter("dni"));
		textos.print("Correo: " + request.getParameter("correo"));
		//GUARDANDO VARIABLES
		try {
			int dni = Integer.parseInt(request.getParameter("dni"));
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String correo = request.getParameter("correo");
			ClienteVO c = new ClienteVO(dni,nombre,apellido,correo);
			ClienteDAO.insertar(c);
			textos.print("guardado correctamente!");
		}catch(Exception e) {
			System.out.println("no guarda");
			textos.print("no puedo guardar");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}