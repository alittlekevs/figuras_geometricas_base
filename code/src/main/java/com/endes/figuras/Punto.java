package com.endes.figuras;

public class Punto {
	private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(Punto otro) {
        return Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
    }
    public void rotar(double angulo) {
        double nuevoX = x * Math.cos(angulo) - y * Math.sin(angulo);
        double nuevoY = x * Math.sin(angulo) + y * Math.cos(angulo);
        this.x = nuevoX;
        this.y = nuevoY;
    }

    public void trasladar(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}
