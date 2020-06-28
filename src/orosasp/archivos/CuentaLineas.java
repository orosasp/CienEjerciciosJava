package orosasp.archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CuentaLineas {

	public static void main(String[] args) {
		try {
			System.out.println("Numero de lineas: " + leerArchivo("archivoE75.txt"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	} // end main
	
	public static int leerArchivo(String archivo) throws IOException {
		int contador = 0;
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String linea = "";
		while ((linea = br.readLine()) != null) {
			contador++;
		}
		return contador;
	} // end leerArchivo
}
