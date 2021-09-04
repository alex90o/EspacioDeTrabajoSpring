package a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicicleta bRogger = new Bicicleta();
		bRogger.velocidadActual = 20;
		System.out.println(bRogger.getVelocidadActual());
		bRogger.acelerar();
		//segundo objeto
		Bicicleta bLeonardo= new Bicicleta (40, 3, 4);
		bLeonardo.informar();
		bLeonardo.cambiarPlato(1);
		bLeonardo.cambiarPinion(6);
		bLeonardo.acelerar();
		bLeonardo.informar();
		
	}

}
