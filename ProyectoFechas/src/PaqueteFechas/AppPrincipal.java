package PaqueteFechas;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Fecha unafecha = new Fecha();
		unafecha.generarDia();
		System.out.println(unafecha.getDia());
		
		//---
		Fecha f2 = new Fecha(18,4,2015);
		System.out.println(f2.getDia()+" - "+f2.getMes()+" - "+f2.getAnio());
		
		Fecha f3 = new Fecha();
		System.out.println("Escribe un día del mes");
		int n = teclado.nextInt();
		f3.generarFecha(n);
		System.out.println(f3.getDia() + " - " 
				 + f3.getMes() + " - " + f3.getAnio());
		
		Fecha f4 = new Fecha();
		System.out.println("Escribe un día");
		n = teclado.nextInt();
		System.out.println("Escribe el mes");
		int m = teclado.nextInt();
		f4.generarFecha(n, m);
		System.out.println(f4.getDia() + " - " 
				 + f4.getMes() + " - " + f4.getAnio());
	}

}
