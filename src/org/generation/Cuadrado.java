package org.generation;

public class Cuadrado implements FiguraGeometrica{
	private String nombre;
	private double lado;
	public Cuadrado(String nombre, double lado) {
		this.nombre = nombre;
		this.lado = lado;
	}//cosntructor
	
	public double calcularArea() {
		return 4*lado;
	}
	public double calcularPerimetro() {
		return (lado+lado+lado+lado);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}
	
	
	

}
