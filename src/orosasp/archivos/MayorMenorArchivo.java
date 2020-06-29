package orosasp.archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author J Oscar Rosas
 * */
public class MayorMenorArchivo {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("archivo77.txt"))){
			int numLineas = cuentaLineas("archivo77.txt");
			int[] numeros = new int[numLineas];
			
			String linea = "";
			
			for(int i = 0; (linea = br.readLine()) != null; i++)
				numeros[i] = Integer.parseInt(linea);
			Arrays.sort(numeros);
			System.out.println("El menor es: " + numeros[0]);
			System.out.println("El mayor es: " + numeros[numeros.length - 1]);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("No se puede convertir ningun dato en numero. Reviza el archivo. " + e.getMessage());
		}
	} // end main

	public static int cuentaLineas(String archivo) throws IOException {
		int contador = 0;
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String linea = "";
		while ((linea = br.readLine()) != null)
			contador++;
		return contador;
	} // end leerArchivo
} // end MayorMenorArchivo
