package orosasp.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Ejercicio 78:  Ordena nombre de personas
 * 
 * @author J Oscar Rosas
 * */
public class OrdenaNombresPersonas {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("nombres.txt")); 
				BufferedWriter bw = new BufferedWriter(new FileWriter("nombresOrdenados.txt"))) {
			String linea = null;
			while ((linea = br.readLine()) != null) {
				nombres.add(linea);
			}
			Collections.sort(nombres);
			for (String nombre : nombres)
				bw.write(nombre + "\r\n");			
			System.out.println("Se han ordenado los nombres");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	} // end main
} // end OrdenaNombresPersonas
