package PaqueteFechas;

import java.util.Calendar;

public class Fecha {
private int dia;
private int mes;
private int anio;
//contructor
public Fecha(int dia, int mes, int anio) {
	this.dia = dia;
	this.mes = mes;
	this.anio = anio;
}
public Fecha() {
	
}
//setter getter
public int getDia() {
	return dia;
}
public void setDia(int dia) {
	this.dia = dia;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public int getAnio() {
	return anio;
}
public void setAnio(int anio) {
	this.anio = anio;
}
//toString
@Override
public String toString() {
	return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
}
public void generarDia() {
	Calendar fechaSys = Calendar.getInstance();
	setDia(fechaSys.get(Calendar.DAY_OF_MONTH));
}
public void generarMes() {
	Calendar fechaSys = Calendar.getInstance();
	setMes(fechaSys.get(Calendar.MONTH)+1);
}
public void generarAnio() {
	Calendar fechaSys = Calendar.getInstance();
	setAnio(fechaSys.get(Calendar.YEAR));
}
public void generarFecha() {
	Calendar fechaSys = Calendar.getInstance();
	setDia(fechaSys.get(Calendar.DAY_OF_MONTH));
	setMes(fechaSys.get(Calendar.MONTH) + 1);
	setAnio(fechaSys.get(Calendar.YEAR));

}
public void generarFecha(int d) {
	Calendar fechaSys = Calendar.getInstance();
	setDia(d);
	setMes(fechaSys.get(Calendar.MONTH) + 1);
	setAnio(fechaSys.get(Calendar.YEAR));
}
public void generarFecha(int d, int m) {
	Calendar fechaSys = Calendar.getInstance();
	setDia(d);
	setMes(m);
	setAnio(fechaSys.get(Calendar.YEAR));
	
}

}
