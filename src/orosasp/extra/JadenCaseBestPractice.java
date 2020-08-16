package orosasp.extra;

/**
 * Ejercicio: Poner a Mayuscula la primera letra de cada palabra en un oracion
 * 
 * @author J Oscar Rosas
 * */
public class JadenCaseBestPractice {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		
		String jadenCase = toJadenCase("most trees are blue");
		System.out.println(jadenCase);
		
		long fin = System.currentTimeMillis();
		
		long tiempo = fin - inicio;
		System.out.println(tiempo + " milisegundos");
	}

	public static String toJadenCase(String phrase) {
	    if(phrase == null || phrase.equals("")) return null;
	    
	    char[] array = phrase.toCharArray();
	    
	    for(int x = 0; x < array.length; x++) {
	      if(x == 0 || array[x-1] == ' ') {
	        array[x] = Character.toUpperCase(array[x]);
	      }
	    }
	    
	    return new String(array);
	} // end toJadenCase
	
} // end JadenCase
