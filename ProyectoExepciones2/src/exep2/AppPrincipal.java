package exep2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> d = new HashSet<>();
		d.add(5);
		d.add(1);
		d.add(10);
		System.out.println(d);
		/*for(Integer dato:d){
		 * System.out.println(dato);
		 * }
		 */
		Iterator<Integer> ite = d.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		HashSet<String> d2 = new HashSet<>();
		//d2.add("Ale");
		d2.add("Candela");
		d2.add("Dianela");
		d2.add("Martin");
		d2.add("Martin");
		System.out.println(d2);
		
		Mascota m1 = new Mascota(6,"perro","tito");
		Mascota m2 = new Mascota(0,"gato","Isa");
		Mascota m3 = new Mascota(2,"Rottwailer","Vito");
		Mascota m4 = new Mascota(3,"gato","Bola de nieve");
		Mascota m5 = new Mascota(4,"Caniche","Benito");
		HashSet<Mascota> d3 = new HashSet<>();
		d3.add(m1);
		d3.add(m2);
		d3.add(m3);
		d3.add(m4);
		d3.add(m5);
		System.out.println(d3);
		
		System.out.println("******TREESET*********");
		TreeSet<Integer> d4 = new TreeSet<>();
		d4.add(10);
		d4.add(2);
		d4.add(150);
		System.out.println(d4);
		
		TreeSet<String> d5 = new TreeSet<>();
		d5.add("Rosado");
		d5.add("Negro");
		d5.add("Amarillo");
		System.out.println(d5);
		d5.add("Negro");
		System.out.println(d5.contains("azul"));
		d5.remove("Negro");
		System.out.println(d5);
		
		TreeSet<Mascota> d6 = new TreeSet<>();
		d6.add(m1);
		d6.add(m2);
		d6.add(m3);
		d6.add(m4);
		d6.add(m5);
		System.out.println(d6);
		
		System.out.println("*******ARRAYLIST*********");
		ArrayList<Integer> d7 = new ArrayList<>();
		d7.add(8);
		d7.add(1);
		d7.add(8);
		d7.add(100);
		System.out.println(d7);
		d7.set(0, 89);
		System.out.println(d7);
		System.out.println(d7.get(0));
		System.out.println(d7.size());
		System.out.println(d7.contains(100));
		d7.remove(0);
		System.out.println(d7);
		Object [] arreglo = d7.toArray();
		for (Object obj : arreglo) {
			System.out.println(obj);
		}
		d7.add(100);
		d7.add(100);
		System.out.println(d7);
		System.out.println(d7.indexOf(100));//infroma solo el primero
		Collections.sort(d7);
		d7.add(3);
		System.out.println(d7);
		
		ArrayList<String> d8 = new ArrayList<>();
		d8.add("lunes");
		d8.add("martes");
		d8.add("miercoles");
		d8.add("jueves");
		d8.add("viernes");
		Collections.sort(d8);
		System.out.println(d8);
		
		ArrayList<Mascota> d9 = new ArrayList<>();
 		d9.add(m1);
 		d9.add(m2);
 		d9.add(m3);
 		d9.add(m4);
 		d9.add(m5);
 		d9.add(m1);
 		d9.add(m2);
 		System.out.println(d9);
 		Collections.sort(d9);
		System.out.println(d9);
		
		System.out.println("******hacer linkedlist***********");
		System.out.println("********linkedlist de queue **********");
		Queue d10 = new LinkedList<>();
		d10.add("uno");
		d10.add("dos");
		d10.add("tres");
		System.out.println(d10);
		d10.offer("cuatro");
		System.out.println(d10);
		System.out.println(d10.contains("cuatro"));
		d10.remove();
		System.out.println(d10);
		System.out.println(d10.peek());
		d10.poll();
		System.out.println(d10);
		d10.add(m1);
		System.out.println(d10);
		
		System.out.println("******MAP*******");
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(1, "Buenos Aires");
		mapa.put(2, "Mendoza");
		mapa.put(3, "Jujuy");
		mapa.put(4, "Salta");
		System.out.println(mapa);
		//mapa.put(4, null)
	}

}
