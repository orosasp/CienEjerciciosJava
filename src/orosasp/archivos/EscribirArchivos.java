package orosasp.archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author J Oscar Rosas
 */
public class EscribirArchivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		
		System.out.println("Introduce un texto");
		String texto = sc.next();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true))) {
			bw.write(texto + "\r\n");
		} catch (IOException ex) {
			Logger.getLogger(EscribirArchivos.class.getName()).log(Level.SEVERE, null, ex);
		}
	} // end main

} // end EscribirArchivos
