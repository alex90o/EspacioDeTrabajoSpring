package vaca.modulos;

import java.util.Arrays;

public class Desierto extends Destino {
public String TipoDeDesierto;
public String [] Oasis;
public Desierto() {
	super();
	
}
public Desierto(String nombre, String clima, String[] actividades, String[] hoteles, double precio, String transporte,
		String ubicacion) {
	super(nombre, clima, actividades, hoteles, precio, transporte, ubicacion);
	
}
public Desierto(String tipoDeDesierto, String[] oasis) {
	super();
	TipoDeDesierto = tipoDeDesierto;
	Oasis = oasis;
}
public String getTipoDeDesierto() {
	return TipoDeDesierto;
}
public void setTipoDeDesierto(String tipoDeDesierto) {
	TipoDeDesierto = tipoDeDesierto;
}
public String[] getOasis() {
	return Oasis;
}
public void setOasis(String[] oasis) {
	Oasis = oasis;
}


}
