package exep2;

public class NuestraException extends Exception{
private String mensaje;
public NuestraException(String mensaje) {
	setMensaje(mensaje);
}
public void setMensaje(String mensaje) {
	this.mensaje=mensaje;
}
public String getMensaje() {
	return this.mensaje;
}
public String getMessage() {
	return getMensaje();
}
}
