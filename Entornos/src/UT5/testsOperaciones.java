package UT5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testsOperaciones {

	@Test
	@DisplayName("hola")
	void testSumar() {
		int suma = Operaciones.sumar(3, 4);
		assertEquals(suma, 7);
	}
	@Test
	void testSumar1() {
		int suma = Operaciones.sumar(5, 4);
		assertEquals(suma, 9);
	}
	@Test
	void testSumar2() {
		int suma = Operaciones.sumar(6, 4);
		assertEquals(suma, 10);
	}
	@Test
	void testSumar3() {
		int suma = Operaciones.sumar(-8, -4);
		assertEquals(suma, -12);
	}
	

	@Test
	void testRestar() {
		
		int resta = Operaciones.restar(40, 10);
		assertEquals(resta, 30);
	}
	@Test
	void testRestar1() {
		
		int resta = Operaciones.restar(50, 10);
		assertEquals(resta, 40);
	}
	@Test
	void testRestar2() {
		
		int resta = Operaciones.restar(50, 20);
		assertEquals(resta, 30);
	}
	@Test
	void testRestar3() {
		
		int resta = Operaciones.restar(-20, -20);
		assertEquals(resta, 0);
	}
	

}