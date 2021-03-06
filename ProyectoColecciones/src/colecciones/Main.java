package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//colecciones
		//set -> HashSet: no duplicados, es m?s eficiente
	
		HashSet<String> nombres = new HashSet<>();
		nombres.add("Martin");
		nombres.add("Alexis");
		nombres.add("Candela");
		nombres.add("Leonardo");
		nombres.add("Sofia");
		System.out.println(nombres.size());
		nombres.add("Martin");
		System.out.println(nombres.size());
		System.out.println(nombres.contains("Sofia"));
		nombres.remove("Martin");
		System.out.println(nombres.size());
		HashSet<String>nombres2 = new HashSet<>();
		nombres2.addAll(nombres);
		System.out.println(nombres.size());
		System.out.println(nombres2.size());
		System.out.println(nombres2.containsAll(nombres));
		System.out.println(nombres2.equals(nombres));
		nombres2.removeAll(nombres);
		System.out.println(nombres.size());
		System.out.println(nombres2.size());
		for (String x : nombres ) {
			System.out.println(x);
		}
		System.out.println("**************");
		Iterator<String> it =nombres.iterator();
		while (it.hasNext()) {
			String nombre = it.next();
			if (nombre.equals("Sofia"))
				it.remove();
			else
				System.out.println(nombre);
		}
		System.out.println(nombres.size());
		System.out.println(nombres.isEmpty());
		System.out.println(nombres2.isEmpty());
		nombres.clear();
		System.out.println(nombres.isEmpty());
		
		//creando objetos
		//Persona p1 = new Persona();
		Persona p1;
		Persona p2 = new Persona(456,"Ana",28,"Canada");
		Persona p3 = new Persona(789,"Juan",50,"Argentina");
		Persona p4 = new Persona(321,"Cleopatra", 16, "Suiza");
		//creando una coleccion de objetos
		HashSet<Persona> person = new HashSet<>();
		person.add(p1= new Persona(123,"Pepe",28,"Estados Unidos"));
		person.add(p2);
		person.add(p3);
		person.add(p4);
		//ver tama?o, recorrer con for, iterrar,eliminar todo, ver tama?o
		System.out.println(person.size());
		for (Persona p : person) {
			System.out.println(p);
		}
		person.clear();
		System.out.println(person.size());
		//***************
		System.out.println("TERCER EJEMPLO");
		HashSet<Float> nun = new HashSet<>();
		nun.add(2.5f);
		nun.add(8.8f);
		nun.add(74.6f);
		System.out.println(nun.size());
		for (Float n : nun) {
			System.out.println(n);
		}
		System.out.println("**********TREESET********");
		TreeSet<Integer> valores = new TreeSet<>();
		valores.add(1);
		valores.add(10);
		valores.add(100);
		valores.add(1000);
		valores.add(10000);
		valores.add(100000);
		valores.add(1000000);
		System.out.println(valores.size());
		for (Integer i : valores) {
			System.out.println(i);
		} 
		valores.add(1);
		System.out.println(valores.size());
		for (Integer i : valores) {
			System.out.println(i);
		}
		/*
		TreeSet<Persona> valoresP = new TreeSet<>();
		valoresP.add(p1);
		valoresP.add(p4);
		valoresP.add(p2);
		valoresP.add(p3);
		System.out.println(valoresP.size());
		Iterator<Persona>iiP= valoresP.iterator();
		valoresP.descendingIterator();
		while (iiP.hasNext()) {
			Persona persona = iiP.next();
			System.out.println(persona);
		*/
		System.out.println("-*** Linked HashSet");
		LinkedHashSet<String> provincias = new LinkedHashSet<>();
		provincias.add("Buesnos Aires");
		provincias.add("Mendoza");
		provincias.add("C?rdoba");
		System.out.println(provincias.isEmpty());
		for (String p : provincias) {
			System.out.println(p);
		}
		System.out.println(provincias.size());
		provincias.clear();
		System.out.println(provincias.isEmpty());
		
		System.out.println("*****LIST********");
		System.out.println("******ARRAYLIST*****");
		ArrayList<String> colores = new ArrayList<>();
		colores.add("azul");
		colores.add("amarillo");
		colores.add("negro");
		System.out.println(colores.size());
		colores.add("amarillo");
		System.out.println(colores.size());
		for (String c : colores) {
			System.out.println(c);
		}
		colores.remove("amarillo");
		System.out.println(colores.size());
		for (String c : colores) {
			System.out.println(c);
		}
		System.out.println("Posicional");
		System.out.println(colores.get(0));
		System.out.println("Iterator");
		Iterator<String> cI= colores.iterator();
		while(cI.hasNext()) {
			System.out.println(cI.next());
		}
	}

}
