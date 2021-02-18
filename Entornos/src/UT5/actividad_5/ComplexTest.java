package UT5.actividad_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	@DisplayName ("Suma 1")
	void testSumar() {
		Complex prueba1 = new Complex(15, 60);
		Complex prueba2 = new Complex(95, 30);
		
		Complex resultado = prueba1.sumar(prueba2); 
		Complex r_esperado = new Complex(110, 90);
		assertEquals(resultado, r_esperado);
	}

	@Test
	@DisplayName ("Multiplicacion con numeros complejos 1")
	void testMultiplicarComplex() {
		Complex prueba1 = new Complex(52, 9);
		Complex prueba2 = new Complex(30, 6);
		
		Complex resultado = prueba1.multiplicar(prueba2); 
		Complex r_esperado = new Complex(1506, 582);
		assertEquals(resultado, r_esperado);
	}

	@Test
	@DisplayName (" Multiplicacion con numeros dobles 1")
	void testMultiplicarDouble() {
		Complex prueba1 = new Complex(95, 30);
		Complex resultado = prueba1.multiplicar(35); 
		Complex r_esperado = new Complex(3325, 1050);
		assertEquals(resultado, r_esperado);
	}

	@Test
	@DisplayName ("Division 1")
	void testDividir1() {
		Complex prueba1 = new Complex(52, 9);
		Complex prueba2 = new Complex(30, 6);
		
		Complex resultado = prueba1.dividir(prueba2); 
		Complex r_esperado = new Complex(1.7243589743589745, -0.04487179487179487);
		assertEquals(resultado, r_esperado);
	}
	@Test
	@DisplayName ("Division 2")
	void testDividir2() {
		Complex prueba1 = new Complex(4, 5);
		Complex prueba2 = new Complex(2, 2);
		
		Complex resultado = prueba1.dividir(prueba2); 
		Complex r_esperado = new Complex(2.25, 0.25);
		assertEquals(resultado, r_esperado);
	}
	@Test
	@DisplayName ("Division 3")
	void testDividir3() {
		Complex prueba1 = new Complex(0, 2);
		Complex prueba2 = new Complex(1, 0);
		
		Complex resultado = prueba1.dividir(prueba2); 
		Complex r_esperado = new Complex(0, 2);
		assertEquals(resultado, r_esperado);
	}
	
	@Test
	@DisplayName ("Resta 1")
	void testRestar1() {
		Complex prueba1 = new Complex(-1, 9);
		Complex prueba2 = new Complex(-35, 6);
		
		Complex resultado = prueba1.restar(prueba2); 
		Complex r_esperado = new Complex(34, 3);
		assertEquals(resultado, r_esperado);
	}
	@Test
	@DisplayName ("Resta 2")
	void testRestar2() {
		Complex prueba1 = new Complex(0, 35);
		Complex prueba2 = new Complex(-1, 35);
		
		Complex resultado = prueba1.restar(prueba2); 
		Complex r_esperado = new Complex(1, 0);
		assertEquals(resultado, r_esperado);
	}
	@Test
	@DisplayName ("Resta 3")
	void testRestar3() {
		Complex prueba1 = new Complex();
		Complex prueba2 = new Complex();
		
		Complex resultado = prueba1.restar(prueba2); 
		Complex r_esperado = new Complex(0,0);
		assertEquals(resultado, r_esperado);
	}

	@Test
	@DisplayName ("Equals 1")
	void testEqualsObject1() {
		Complex prueba1 = new Complex(0, 1);
		Complex prueba2 = new Complex(1, 0);
		boolean resultado = prueba1.equals(prueba2);
		assertEquals(resultado, false);
	}
	@Test
	@DisplayName ("Equals 2")
	void testEqualsObject2() {
		Complex prueba1 = new Complex(0, 0);
		Complex prueba2 = new Complex(0, 0);
		boolean resultado = prueba1.equals(prueba2);
		assertEquals(resultado, true);
	}

}
