package proyectoStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritor {

	public static void main(String[] args) throws IOException {
		File outputFile = new File("archivos/destino.txt");
		FileWriter out = new FileWriter(outputFile);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el texto del libro");
		String texto = teclado.nextLine();
		for (int i = 0; i < texto.length(); i++) {
			out.write(texto.charAt(i));
		}
		out.close();
		System.out.println("Ya termine de escribir el libro");

	}

}
