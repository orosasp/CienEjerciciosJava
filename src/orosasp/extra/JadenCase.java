package orosasp.extra;

/**
 * Ejercicio: Poner a Mayuscula la primera letra de cada palabra en un oracion
 * 
 * @author J Oscar Rosas
 * */
public class JadenCase {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		
		String jadenCase = toJadenCase("most trees are blue");
		System.out.println(jadenCase);
		
		long fin = System.currentTimeMillis();

//		double tiempo = (double) ((fin - inicio) / 1000);
//		System.out.println(tiempo + " segundos");
		long tiempo = fin - inicio;
		System.out.println(tiempo + " milisegundos");
		
	} // end main

	public static String toJadenCase(String phrase) {
		String jadenPhrase = null;
		if (phrase != null && !phrase.isEmpty()) {
			String[] phraseLines = phrase.split(" ");
			jadenPhrase = "";
			for (String phraseLine : phraseLines )
				jadenPhrase += (jadenPhrase.isEmpty() ? jadenPhrase : " ") + phraseLine.substring(0, 1).toUpperCase() + phraseLine.substring(1, phraseLine.length());
		}
		return jadenPhrase;
	} // end toJadenCase
	
} // end JadenCase
