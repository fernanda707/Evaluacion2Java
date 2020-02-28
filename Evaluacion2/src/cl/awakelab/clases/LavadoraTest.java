package cl.awakelab.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LavadoraTest {
	Lavadora l= new Lavadora(150, "Azul", 'A', 20, 35);
	
	@Test
	void testGetCarga() {
		
		assertEquals(35, l.getCarga());
		
	}
	
	@Test
	void testPrecioFinal() {
		assertEquals(350, l.precioFinal());
	}

}
