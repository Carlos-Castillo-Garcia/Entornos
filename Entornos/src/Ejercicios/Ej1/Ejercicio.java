/**
 * 
 */
package Ejercicios.Ej1;

/**
 * @author CARLOS
 *
 */
public class Ejercicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// llamada a contructor vacio
		Nif unnif = new Nif();
		
		//Llamada a contructor con valores
		Nif minif = new Nif(5296544, 'B');
		
		//Acceso a los atributos privados mediante metodos "get..." que son publicos
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		
		minif.setLetra('N');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());

	}

}
