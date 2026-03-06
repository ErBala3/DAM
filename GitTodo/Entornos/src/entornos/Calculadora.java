package entornos;
/* @author sergio
@version 1.0 */
public class Calculadora {
	/* suma dos enteros 
	@param a primer entero
	@param b segundo entero
	@return suma de a y b */
	public static int suma(int a, int b) {
		return a + b;
	}
	/* resta dos enteros 
	@param a primer entero
	@param b segundo entero
	@return resta de a y b */
	public static int resta(int a, int b) {
		return a - b;
	}
	/* multiplica dos enteros 
	@param a primer entero
	@param b segundo entero
	@return multiplicacion de a y b */
	public static int multiplicacion(int a, int b) {
		return a * b;
	}	
	/* divide dos enteros despues de comprobar que el divisor no es cero
	@param a primer entero
	@param b segundo entero
	@return division de a y b */
	public static int division(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("El divisor no puede ser cero");
		}
		return a / b;
	}

}
