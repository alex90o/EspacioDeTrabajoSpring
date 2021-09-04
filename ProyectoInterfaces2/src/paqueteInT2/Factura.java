package paqueteInT2;

public class Factura implements IContantes,IMetodos{
private double precio;
public final static double IVA = 0.21;
public double calcularTotal() {
	return this.precio * IVA;
}
public void setPrecio(double precio) {
	this.precio= precio;
}
public double calcularTotalConDesc() {
	return (this.precio * IVA)*0.95;
}
public void asignaValor() {
	
	if(this.precio>B) {
		System.out.println(calcularTotalConDesc());
	}
	else
		System.out.println(calcularTotal());
}
public String mostraMensaje() {
	return "Los totales son: ";
}
}
