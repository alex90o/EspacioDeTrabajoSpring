package proyectoStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class LectorBufferWeb {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("https://www.educacionit.com/");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
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
