package exep2;

//import sun.jvm.hotspot.debugger.posix.elf.ELFException;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ejemplo1
		try {
			System.out.println("Creando una exepcion");
			int x = 3;
			if(x == 3)
				throw new Exception();
			System.out.println("soy el c�digo despu�s");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("capturada");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("fin");
		}
		*/
		//ejemplo2
		/*
		try {
			System.out.println("Inicio");
			Operar obj= new Operar();
			System.out.println(obj.ejecutar(10, 10));
			System.out.println(obj.ejecutar(10, 20));
			System.out.println(obj.ejecutar(10, 4));
			System.out.println("medio");
		} catch (NuestraException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("fin");
		}
		*/
		//ENUMERADOS 
		/*
		Comidas comida = Comidas.valueOf("A");
		System.out.println(comida.getDato());
		comida.setDato("giso");
		System.out.println(comida.getDato());
	*/
		//GENERICOS
		GDatos<String> x = new GDatos<>();
		x.setDato("hola lunes");
		System.out.println(x.getDato());
		
		GDatos<Integer> y = new GDatos<>();
		y.setDato(258);
		System.out.println(y.getDato());
		
	}
	

}
