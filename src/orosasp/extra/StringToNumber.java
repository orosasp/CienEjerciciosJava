package orosasp.extra;

/**
 * Ejercicio: Convertir un String en un numero
 * 
 * Description
 * We need a function that can transform a string into a number. What ways of achieving this do you know?
 * 
 * Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
 * 
 * Examples
 * stringToNumber("1234") == 1234
 * stringToNumber("605" ) == 605
 * stringToNumber("1405") == 1405
 * stringToNumber("-7"  ) == -7
 * 
 * @author J Oscar Rosas
 * */
public class StringToNumber {

	public static void main(String[] args) {
		int stringToNumber = stringToNumber("5");

		System.out.println(stringToNumber + 5);
	} // end main

	public static int stringToNumber(String str) {
		return Integer.parseInt(str);
	} // end stringToNumber

} // end StringToNumber
