package UT5.actividad_5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	void testSumar() {
		Complex prueba1 = new Complex(15, 60);
		Complex prueba2 = new Complex(95, 30);
		
		Complex resultado = prueba1.sumar(prueba2); 
		Complex r_esperado = new Complex(110, 90);
		assertEquals(resultado, r_esperado);
	}

	@Test
	void testRestar() {
		Complex prueba1 = new Complex(15, 60);
		Complex prueba2 = new Complex(95, 30);
		
		Complex resultado = prueba1.restar(prueba2); 
		Complex r_esperado = new Complex(80, 30);
		assertEquals(resultado, r_esperado);
	}

	@Test
	void testMultiplicarComplex() {
		Complex prueba1 = new Complex(15, 60);
		Complex prueba2 = new Complex(95, 30);
		
		Complex resultado = prueba1.multiplicar(prueba2); 
		Complex r_esperado = new Complex(1600, 3000);
		assertEquals(resultado, r_esperado);
	}

	@Test
	void testMultiplicarDouble() {
		Complex prueba1 = new Complex(35,0);
		
		Complex resultado = prueba1.multiplicar(35); 
		Complex r_esperado = new Complex(1750, 1050);
		assertEquals(resultado, r_esperado);
	}

	@Test
	void testDividir() {
		Complex prueba1 = new Complex(50, 0);
		Complex prueba2 = new Complex(95, 30);
		
		Complex resultado = prueba1.dividir(prueba2); 
		Complex r_esperado = new Complex(110, 90);
		assertEquals(resultado, r_esperado);
	}

	@Test
	void testEqualsObject() {

	}

}
