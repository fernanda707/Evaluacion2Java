package cl.awakelab.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelevisrionTest {
	Television t= new Television(150, "Azul", 'A', 20, 40, true);
	@Test
	void testGetResolucion() {
		
		assertEquals(40, t.getResolucion());
		
	}
	
	@Test
	void testGetSintonizador() {
		
		assertEquals(true, t.getSintonizadorTDT());
		
	}
	
	@Test
	void testPrecioFinal() {
		assertEquals(350, t.precioFinal());
	}

}
