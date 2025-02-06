package com.endes.figuras;

public class Circulo extends FiguraGeometrica{

	protected Punto centro;
	protected double radio;
	
	public Circulo(String nombre, String color, Punto centro, double radio) {
		super.nombre = this.nombre;
		super.color = this.color;
		this.radio = radio;
		this.centro = centro;
		Circulo circulo = new Circulo(nombre, color, centro, radio);
	}
	
	public double area() {
		return Math.PI * Math.sqrt(this.radio) ;
	}
	
	public double perimetro() {
		return Math.PI * (this.radio * 2);
	}
	
	public void rotar(double angulo) {
		System.out.println("Rotando la figura " + nombre + " en " + angulo + " grados.");
	}
	
	public void trasladar(double dx, double dy) {
		System.out.println("Trasladando la figura " + nombre + " en (" + dx + ", " + dy + ").");
	}
	
	
}
