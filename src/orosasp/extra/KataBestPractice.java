package orosasp.extra;

import java.util.Arrays;

/**
 * Ejercicio: Mayor y menor de un String con numeros separados por espacio
 * 
 * Descripcion: En esta peque�a tarea, se le da una serie de n�meros separados
 * por espacios y debe devolver el n�mero m�s alto y el m�s bajo.
 * 
 * Example: 
 * highAndLow("1 2 3 4 5") // return "5 1" 
 * highAndLow("1 2 -3 4 5") //
 * return "5 -3" highAndLow("1 9 3 4 -5") // return "9 -5"
 * 
 * Notas: Todos los n�meros son Int32 v�lidos, no es necesario validarlos.
 * Siempre habr� al menos un n�mero en la cadena de entrada. La cadena de salida
 * debe tener dos n�meros separados por un solo espacio, y el n�mero m�s alto es
 * el primero.
 * 
 * @author J Oscar Rosas
 */
public class KataBestPractice {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		
		System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
		
		long fin = System.currentTimeMillis();
		long tiempo = fin - inicio;
		System.out.println(tiempo + " milisegundos");
	} // end main
	
	public static String highAndLow(String numbers) {
		int min = Arrays.stream(numbers.split(" ")).mapToInt(i -> Integer.parseInt(i)).min().getAsInt();
		int max = Arrays.stream(numbers.split(" ")).mapToInt(i -> Integer.parseInt(i)).max().getAsInt();
		return String.format("%d %d", max, min);
	} // end highAndLow
}
