package cl.awakelab.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElectrodomesticoTest {
	Electrodomestico e= new Electrodomestico(150, "Azul", 'A', 20);
	
	@Test
	void testGetPrecioBase() {
		
		assertEquals(150, e.getPrecioBase());
	}
	
	@Test
	void testGetColor() {
		assertEquals("Azul", e.getColor());
	}
	
	@Test
	void testGetConsumo() {
		assertEquals('A', e.getConsumoEnergetico());
	}
	
	@Test
	void testGetPeso() {
		assertEquals(20, e.getPeso());
	}
	
	@Test
	void testPrecioFinal() {
		assertEquals(300, e.precioFinal());
	}

}
