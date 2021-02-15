/**
 * 
 */
package UT5.actividad_5;

/**
 * @author CARLOS
 *
 */
public class p_complex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex prueba = new Complex(50, 30);
		Complex prueba2 = new Complex(20, 5);
		
		
		System.out.println(prueba.sumar(prueba2));
		System.out.println(prueba.multiplicar(prueba));
		System.out.println(prueba.multiplicar(35));
	}

}
