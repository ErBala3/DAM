package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidadorClaveTest {

	@Test
	void testEsClaveValida() {
		assertTrue(ValidadorClave.esClaveValida("Sergio789"));
	}
	@Test
	void testEsClaveValida2() {
		assertTrue(ValidadorClave.esClaveValida("Sergio587910"), "Error");
	}

	@Test
	void testFortaleza() {
		assertEquals("DEBIL", ValidadorClave.fortaleza("Sergio789"), "Error");
	}
	@Test
	void testFortaleza2() {
		assertEquals("MEDIA", ValidadorClave.fortaleza("Sergio78910"), "Error");
	}

	@Test
	void testOcultar() {
			assertEquals("*********10", ValidadorClave.ocultar("Sergio78910"), "Error");
	}
	@Test
	void testOcultar2() {
			assertEquals("*******89", ValidadorClave.ocultar("Sergio789"), "Error");
	}

}
