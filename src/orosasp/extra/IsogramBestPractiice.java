package orosasp.extra;

/**
 * Ejercicio: Indicar si una palabra es isograma
 * 
 * Description
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram.
 * Assume the empty string is an isogram. Ignore letter case.
 * 
 * Examples
 * isIsogram "Dermatoglyphics" == true
 * isIsogram "aba" == false
 * isIsogram "moOse" == false -- ignore letter case
 * 
 * @author J Oscar Rosas
 * */
public class IsogramBestPractiice {

	public static void main(String[] args) {
		boolean isogram = isIsogram("aba");
		
		System.out.println(isogram);
	} // end main
	
	public static boolean isIsogram(String word) {
		return word.length() == word.toLowerCase().chars().distinct().count();
    } // end isIsogram 

} // end Isogram
