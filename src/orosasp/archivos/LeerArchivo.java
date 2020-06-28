package orosasp.archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author J Oscar Rosas 
 * */
public class LeerArchivo {

	public static void main(String[] args) {
		try {
			leerArchivo("archivoTest.txt");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	} // end main
	
	public static void leerArchivo(String archivo) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String linea = "";
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}
	} // end leerArchivo
}
