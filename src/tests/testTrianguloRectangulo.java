package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	
	static TrianguloRectangulo a;
	static TrianguloRectangulo b;
	static TrianguloRectangulo c;
	
	
	@BeforeAll
	static void setup() {
		a =  new TrianguloRectangulo(2,2) {};
		b =  new TrianguloRectangulo() {};
	}
	
	/**
	 * TESTS con triangulo parametros esperados
	 */
	@Test
	void testArea() {
		int areaEsperado = 2;
		int areaObtenido = (int) a.area();
		assertEquals(areaEsperado, areaObtenido);
	}
	
	@Test
	void testHipotenusa() {
		double hipoEsperado = 2.82842712;
		double hipoObtenido = a.hipotenusa();
		assertEquals(hipoEsperado, hipoObtenido);
	}
	
	@Test
	void testPerimetro() {
		double periEsperado = 6.82842712;
		double periObtenido = a.perimetro();
		assertEquals(periEsperado, periObtenido);
	}
	/**
	 * TEST triangulo con valores por defecto
	 */
	@Test
	void testAreaDefecto() {
		double areaEsperado = 0.5;
		double areaObtenido = b.area();
		assertEquals(areaEsperado, areaObtenido);
	}
	
	@Test
	void testHipotenusaDefecto() {
		double hipoEsperado = 1.41421356;
		double hipoObtenido = b.hipotenusa();
		assertEquals(hipoEsperado, hipoObtenido);
	}
	
	@Test
	void testPerimetroDefecto() {
		double periEsperado = 3.41421356;
		double periObtenido = b.perimetro();
		assertEquals(periEsperado, periObtenido);
	}
	
	@Test
	void testTrianguloNoValido() {
		c =  new TrianguloRectangulo(0,2) {};
		assertThrows(IllegalArgumentException.class,() -> {c.area();});
	}

}
