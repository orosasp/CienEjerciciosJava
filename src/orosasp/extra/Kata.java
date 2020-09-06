package orosasp.extra;

import java.util.Arrays;

/**
 * Ejercicio: Mayor y menor de un String con numeros separados por espacio
 * 
 * Descripcion: En esta pequeña tarea, se le da una serie de números separados
 * por espacios y debe devolver el número más alto y el más bajo.
 * 
 * Example: 
 * highAndLow("1 2 3 4 5") // return "5 1" 
 * highAndLow("1 2 -3 4 5") //
 * return "5 -3" highAndLow("1 9 3 4 -5") // return "9 -5"
 * 
 * Notas: Todos los números son Int32 válidos, no es necesario validarlos.
 * Siempre habrá al menos un número en la cadena de entrada. La cadena de salida
 * debe tener dos números separados por un solo espacio, y el número más alto es
 * el primero.
 * 
 * @author J Oscar Rosas
 */
public class Kata {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		
		System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
		
		long fin = System.currentTimeMillis();
		long tiempo = fin - inicio;
		System.out.println(tiempo + " milisegundos");
		
	} // end main
	
	public static String highAndLow(String numbers) {
		String[] arrayStringNum = numbers.split(" ");
		int[] arrayIntNum = new int[arrayStringNum.length];
		for (int i = 0; i < arrayStringNum.length; i++)
			arrayIntNum[i] = Integer.parseInt(arrayStringNum[i]);
		Arrays.sort(arrayIntNum);
		return arrayIntNum[arrayIntNum.length - 1] + " " + arrayIntNum[0];
	} // end highAndLow
}
