package UT5.actividad_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComplexTest {

	@Test
	@DisplayName ("Suma 1")
	//sumar dos números complejos: (a, b) + (c, d) = (a + c, b + d)
	void testSumar() {								//a, b
		Complex prueba1 = new Complex(15, 60);
																//c, d
		Complex prueba2 = new Complex(95, 30);
		Complex resultado = prueba1.sumar(prueba2);
		
		double real =15+95;
		double imag = 60+30;
		Complex r_esperado = new Complex(real, imag);
		assertEquals(resultado, r_esperado);
	}

	@Test
	@DisplayName ("Multiplicacion con numeros complejos 1")
	//multiplicar dos números complejos: (a, b) * (c, d) = (a*c - b*d, a*d + b*c)
	void testMultiplicarComplex() {			//a, b
		Complex prueba1 = new Complex(52, 9);
																//c, d
		Complex prueba2 = new Complex(30, 6);
		Complex resultado = prueba1.multiplicar(prueba2); 
		
		double real = 52*30 - 9*6;
		double imag = 52*6 + 9*30;
		Complex r_esperado = new Complex(real, imag);
		assertEquals(resultado, r_esperado);
	}

	@Test
	@DisplayName (" Multiplicacion con numeros dobles 1")
	//multiplicar dos números complejos: (a, b) * n =  (a * n, b * n)
	void testMultiplicarDouble() {
		Complex prueba1 = new Complex(95, 30);
		Complex resultado = prueba1.multiplicar(35); 
		
		double real = 95*35;
		double imag = 30*35;
		Complex r_esperado = new Complex(real, imag);
		assertEquals(resultado, r_esperado);
	}

	@Test
	@DisplayName ("Division 1")
	//(a, b) / (c, d) = ((a*c + b*d) / c^2 + d^2) , (b*c - a*d) / (c^2 + d^2))
	void testDividir1() {								//a, b
		Complex prueba1 = new Complex(52, 9);
																//c, d
		Complex prueba2 = new Complex(30, 6);
		Complex resultado = prueba1.dividir(prueba2); 
		
		double divisor = 30*30 + 6*6;
		double real = 52*30 + 9*6;
		double imag = 9*30 - 52*6;
		
		Complex r_esperado = new Complex((double)real/(double)divisor, (double)imag/(double)divisor);
		assertEquals(resultado, r_esperado);
	}
	@Test
	@DisplayName ("Division 2")
	void testDividir2() {
		Complex prueba1 = new Complex(4, 5);
		Complex prueba2 = new Complex(2, 2);
		Complex resultado = prueba1.dividir(prueba2); 
		
		double divisor = 2*2 + 2*2;
		double real = 4*2 + 5*2;
		double imag = 5*2 - 4*2;
		
		Complex r_esperado = new Complex((double)real/(double)divisor, (double)imag/(double)divisor);
		assertEquals(resultado, r_esperado);
	}
	@Test
	@DisplayName ("Division 3")
	void testDividir3() {
		Complex prueba1 = new Complex(0, 2);
		Complex prueba2 = new Complex(1, 0);
		Complex resultado = prueba1.dividir(prueba2);
		
		double divisor = 1*1 + 0*0;
		double real = 0*1 + 2*0;
		double imag = 0*0 - 2*1;
		Complex r_esperado = new Complex((double)real/(double)divisor, (double)imag/(double)divisor);
		assertEquals(resultado, r_esperado);
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
