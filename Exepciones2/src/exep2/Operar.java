package exep2;

public class Operar {
public int ejecutar(int x, int y) 
		throws NuestraException {
	if(x == y)
		throw new NuestraException("no pueden ser iguales");
	if(x < y)
		throw new NuestraException(x+" no puede ser menor");
	return x+y;
}
}
