package orosasp.extra;

/**
 * Ejercicio: Funci�n que realiza cuatro operaciones matem�ticas b�sicas.
 * 
 * Descripcion: La funci�n debe tomar tres argumentos: operaci�n (cadena /
 * car�cter), valor1 (n�mero), valor2 (n�mero). La funci�n debe devolver el
 * resultado despu�s de aplicar la operaci�n elegida.
 * 
 * Example: 
 * basicOp('+', 4, 7) // Output: 11 
 * basicOp('-', 15, 18) // Output: -3
 * basicOp('*', 5, 5) // Output: 25 
 * basicOp('/', 49, 7) // Output: 7
 * 
 * @author J Oscar Rosas
 */
public class BasicOperationsBestPractice {

	public static void main(String[] args) {
		int result = basicMath("/", 40, 5); 
		System.out.println(result);
	} // end main
	
	public static Integer basicMath(String op, int v1, int v2) {
		switch (op) {
	    case "-":
	      return v1 - v2;
	    case "+":
	      return v1 + v2;
	    case "*":
	      return v1 * v2;
	    case "/": {
	      if (v2 == 0)
	        throw new IllegalArgumentException("Division by zero");
	      return v1 / v2;
	    }
	    default:
	      throw new IllegalArgumentException("Unknown operation: " + op);
	    }
	} // end basicMath

} // end BasicOperations
