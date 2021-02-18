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
		
		Complex prueba = new Complex(4, 40);
		Complex prueba2 = new Complex(2, 2);
		Complex prueba3 = new Complex(0, 1);
		Complex prueba4 = new Complex(1, 0);
		
		
		System.out.println(prueba.sumar(prueba2));
		System.out.println(prueba.multiplicar(prueba2));
		System.out.println(prueba.multiplicar(35));
		System.out.println(prueba.dividir(prueba2));
		System.out.println(prueba.restar(prueba2));
		System.out.println(prueba3.equals(prueba4));

	}

}
