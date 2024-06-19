package org.generation;

public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo ("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo ("TrianguloTE", 250, 175, 145);
		Cuadrado cuadrado1 = new Cuadrado ("cuadrado1 ", 20);
		Rectangulo rectangulo1 = new Rectangulo ("rectangulo1 ", 20, 30);
		Rombo rombo1 = new Rombo ("rombo1", 30,  20, 30);
		Romboide romboide1 = new Romboide ("romboide1",  40,  55);
		Trapecio trapecio1 = new Trapecio ("trapecio1 ",  40,  55, 60, 30);//checar si el caluclo es correcto 
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(cuadrado1);
		imprimirCalculo(rectangulo1);
		imprimirCalculo(rombo1);
		imprimirCalculo(romboide1);
		imprimirCalculo(trapecio1 );
		
		
		
	}//main
	public static void imprimirCalculo(FiguraGeometrica fig) {
		System.out.println(fig.toString());
		System.out.println("+==============================================+");
		System.out.println(" | El area de ["+ fig.getNombre()
		+ "] es : " + fig.calcularArea() );
		System.out.println(" | El area de ["+ fig.getNombre()
		+ "] es : " + fig.calcularPerimetro() );
		System.out.println("+===============================================+");
		System.out.println();
		
	}
}//classMain
