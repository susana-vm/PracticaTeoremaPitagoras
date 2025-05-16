package clases;

/**
 * Clase para crear TriangulosRectangulos
 */

public class TrianguloRectangulo {
	int a;
	int b; 
	double c; 
	
	/**
	 * COnstructor sin parametros se inicializa a 1 los catetos
	 */
	public TrianguloRectangulo() {
		this.a=1;
		this.b=1;
	}
	
	/**
	 * Crea un triangulo rectangulo con los parametros pasados
	 * @param a el cateto 1 del triangulo rectangulo
	 * @param b el cateto 2 dle triangulo rectangulo
	 */
	public TrianguloRectangulo(int a, int b) {
		if((a<=0)||(b<=0)) {
			throw new IllegalArgumentException("Los catetos deben ser mayores que cero");
		}
		this.a=a;
		this.b=b;
	}
	
	/**
	 * Metodo para calcular el area del triangulo rectangulo creado
	 * @return el area calculado
	 */
	public double area() {
		double area=(this.a*this.b)/2;
		return area;
	}
	
	/**
	 * Metodo para calcular la hipotenusa segun los catetos dados
	 * @return valor de la hipotenusa
	 */
	public double hipotenusa() {
		int c2= ((this.a*this.a)+(this.b*this.b));
		this.c=(Math.sqrt(c2));
		return this.c;
	}
	
	/**
	 * Metodo para calcular permitro una vez calculada la hipotenusa
	 * @return perimetro del triangulo rectangulo
	 */
	public double perimetro() {
		double perimetro= (this.a+this.b) + this.c;
		return perimetro;
	}
	
	public int getA() {
		return this.a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return this.b;
	}
	public void setb(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Triangulo Rectangulo [cateto 1=" + this.a + ", cateto 2=" + this.b + ", hipotenusa =" + this.c +"]";
	}
	

}
