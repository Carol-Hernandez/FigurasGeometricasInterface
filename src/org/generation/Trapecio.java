package org.generation;

public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	private double lado;
	public Trapecio(String nombre, double baseMenor, double baseMayor, double altura, double lado) {
		this.nombre = nombre;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
		this.lado = lado;
	}//cosntructor 
	
	public double calcularArea() {
		return (altura*(baseMayor+baseMenor))/2;
	}
	public double calcularPerimetro() {
		return (baseMayor+baseMenor+(lado*2));
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", altura="
				+ altura + ", lado=" + lado + "]";
	}//toString
	
	
	
	

}//class 
