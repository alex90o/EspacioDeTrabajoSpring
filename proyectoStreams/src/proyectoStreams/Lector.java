package proyectoStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("archivos/archivos.txt");
		FileReader in = new FileReader(inputFile);
		int unCaracter;
		while ((unCaracter = in.read())!=-1) {
			System.out.print((char)unCaracter);;
			
		}
		in.close();
		
	}
}
