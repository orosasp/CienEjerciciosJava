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
public class Isogram {

	public static void main(String[] args) {
		boolean isogram = isIsogram("aba");
		
		System.out.println(isogram);
	} // end main
	
	public static boolean isIsogram(String word) {
		char[] charArray = word.toCharArray();
		
		boolean isIsogram = true;
		for (int i = 0; isIsogram && i < charArray.length; i++)
			for (int j = 0; isIsogram && j < charArray.length; j++) {
				if (i != j) {
					if (Character.toLowerCase(charArray[i]) !=  Character.toLowerCase(charArray[j]))
						isIsogram = true;
					else
						isIsogram = false;
				}
			}
		return isIsogram;
    } // end isIsogram 

} // end Isogram
