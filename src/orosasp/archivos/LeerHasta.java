package orosasp.archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerHasta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el numero de lineas");
		System.out.println("Debe ser positivo y no mas de las lineas que hay en el archivo");
		int numLineasLeer = sc.nextInt();
		
		try (BufferedReader br = new BufferedReader(new FileReader("archivoE75.txt"))) {
			int numLineasFichero = cuentaLineas("archivoE75.txt");
			
			if (numLineasLeer < 0 || numLineasLeer > numLineasFichero)
				throw new IOException("No puedes leer " + numLineasLeer + " lineas");
			
			// Si llego aqui es que todo es correcto
			String linea = "";
			for (int i = 0; i < numLineasLeer && (linea = br.readLine()) != null; i++)
				System.out.println(linea);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int cuentaLineas(String archivo) throws IOException {
		int contador = 0;
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String linea = "";
		while ((linea = br.readLine()) != null) {
			contador++;
		}
		return contador;
	} // end leerArchivo
}
