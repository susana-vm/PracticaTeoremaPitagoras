package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		

		TrianguloRectangulo t1 = new TrianguloRectangulo(2,4);
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		
		t1.area();
		t1.hipotenusa();
		t1.perimetro();
		
		t2.area();
		t2.hipotenusa();
		t2.perimetro();
		

	}

}
