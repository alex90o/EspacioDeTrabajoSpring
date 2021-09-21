package proyectoStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.nio.Buffer;
import java.io.IOException;

public class LectorBuffer {
	public static void main(String[] args) throws IOException {
		
	
	File inputFile = new File("archivos/archivos.txt");
	BufferedReader in = new BufferedReader(new FileReader(inputFile));
	boolean ban = false;
	String lineaLeida = " ";
	while (!ban) {
		lineaLeida = in.readLine();
		if(lineaLeida!=null) {
			System.out.println(lineaLeida);
		}else {
			ban = true;
		}
		
	}
	in.close();
	}
}
