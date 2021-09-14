package practicas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		//1 - crear una lista que tenga los meses del año
		ArrayList<String> meses = new ArrayList<>();
		meses.add("septiembre");
		meses.add("abril");
		meses.add("diciembre");
		meses.add("agosto");
		meses.add("enero");
		meses.add("noviembre");
		meses.add("mayo");
		meses.add("junio");
		meses.add("octubre");
		meses.add("febrero");
		meses.add("julio");
		meses.add("marzo");
		
		
		//2 - insetar un elemeto
		meses.add(4, "festichola");
		
		//3 - copiar en otra coleccion
		ArrayList<String> mesesCopia = new ArrayList<>();
		mesesCopia.addAll(meses);
		//4 - buscar si existe un elemento
		System.out.println("Exite july? " + meses.contains("july"));
		//5 - ordenar y mostrar
		Collections.sort(meses);
		System.out.println(meses);
		System.out.println("********");
		System.out.println(mesesCopia);
		System.out.println("********");
		for (String x : meses) {
			System.out.println(x);
		}
		//6 - iterar los elementos
		System.out.println("Iterando");
		Iterator it = meses.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		//7 - borrar
		meses.clear();
		System.out.println(meses.isEmpty());
*/
		DataBase conn = new DataBase();
	}

}
