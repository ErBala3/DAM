package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {

	@Test
	void testMain() {
		assertEquals("aloh", StringUtil.invertirCadena("hola"), "Error al invertir la cadena");
	}

	@Test
	void testInvertirCadena() {
		assertEquals("aloh", StringUtil.invertirCadena("hola"), "Error al invertir la cadena");
	}

	@Test
	void testEsPalindromo() {
		assertTrue( StringUtil.esPalindromo("ana"), "Error al verificar palindromo");
	}

	@Test
	void testContarPalabras() {
		assertEquals(2, StringUtil.contarPalabras("hola mundo"), "Error al contar palabras");
	}

	@Test
	void testConcatenar() {
		assertEquals("hola mundo", StringUtil.concatenar("hola", " mundo"), "Error al concatenar");
	}

}
