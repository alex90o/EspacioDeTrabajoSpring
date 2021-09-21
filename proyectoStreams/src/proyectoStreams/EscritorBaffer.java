package proyectoStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class EscritorBaffer {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("archivos/destino.txt");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el primer texto");
		String texto1 = teclado.nextLine();
		System.out.println("Escribe el segundo texto");
		String texto2 = teclado.nextLine();
		System.out.println("Escribe el tercer texto");
		String texto3 = teclado.nextLine();
		
		BufferedWriter in = new BufferedWriter(new FileWriter(inputFile));
		in.write(texto1, 0, texto1.length());
		in.newLine(); // cambia de linea
		in.write(texto2, 0, texto2.length());
		in.newLine(); 
		in.write(texto3, 0, texto3.length());
		in.newLine(); 
		in.close();
		System.out.println("Escribiendo .......");
	}
}
