package orosasp.extra;

/**
 * Ejercicio: Función que realiza cuatro operaciones matemáticas básicas.
 * 
 * Descripcion: La función debe tomar tres argumentos: operación (cadena /
 * carácter), valor1 (número), valor2 (número). La función debe devolver el
 * resultado después de aplicar la operación elegida.
 * 
 * Example: 
 * basicOp('+', 4, 7) // Output: 11 
 * basicOp('-', 15, 18) // Output: -3
 * basicOp('*', 5, 5) // Output: 25 
 * basicOp('/', 49, 7) // Output: 7
 * 
 * @author J Oscar Rosas
 */
public class BasicOperations {

	public static void main(String[] args) {
		int result = basicMath("/", 40, 5); 
		System.out.println(result);
	} // end main
	
	public static Integer basicMath(String op, int v1, int v2) {
		int result = 0;
		switch (op) {
		case "+":
			result = v1 + v2;
			break;
		case "-":
			result = v1 - v2;
			break;
		case "*":
			result = v1 * v2;
			break;
		case "/":
			result = v1 / v2;
			break;
		}
		return result;
	} // end basicMath

} // end BasicOperations
