package a;

public class Bicicleta {
//atributos
	public int velocidadActual;
	public int platoActual;
	public int pinionActual;
	public Bicicleta(int velo, int pla, int pin) {
		velocidadActual = velo;
		platoActual = pla;
		pinionActual = pin;
		}
	public Bicicleta () {
		
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	//metodos 
	public void informar() {
		System.out.println("La velocidad actual es de "+
	velocidadActual+ ", platos "+platoActual + " y piñon "+pinionActual);
	}
	public void acelerar() {
	velocidadActual*=2;
	System.out.println("Acelerando "+ velocidadActual);
	}
	public void frenar() {
		velocidadActual/=2;
		System.out.println("Frenando "+ velocidadActual);
	}
	public void cambiarPlato(int plato) {
		platoActual = plato;
	}
	public void cambiarPinion(int pinion) {
		pinionActual = pinion;
	}
}
