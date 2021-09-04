package exep2;

public enum Comidas {
	A("asado"),B("pizza"),C("ensalada"),D("milanesa");
	private String dato;
	Comidas(String dato){
		this.dato= dato;
	}
	public void setDato(String dato) {
		this.dato= dato;
	}
	public String getDato() {
		return this.dato;
	}
}
