package herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre ed = new Padre ("Eddy", 70);
		ed.informar();
		Hijo au = new Hijo("Austry" , 39, "hora del código");
		System.out.println(au.nombre);
		au.informar();
	}

}
