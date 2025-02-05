package com.endes.figuras;

public class Triangulo_2 {
    /** Vértice 1 del triángulo */
    private Punto vertice1;
    /** Vértice 2 del triángulo */
    private Punto vertice2;
    /** Vértice 3 del triángulo */
    private Punto vertice3;

    /**
     * Constructor del triángulo.
     * @param nombre Nombre de la figura
     * @param color Color de la figura
     * @param v1 Vértice 1 del triángulo
     * @param v2 Vértice 2 del triángulo
     * @param v3 Vértice 3 del triángulo
     */
    public Triangulo_2(String nombre, String color, Punto v1, Punto v2, Punto v3) {
        super(nombre, color);
        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
    }

    /**
     * Calcula el área del triángulo usando la fórmula de Herón.
     * @return Área del triángulo
     */
    @Override
    public double area() {
        double a = vertice1.distancia(vertice2);
        double b = vertice2.distancia(vertice3);
        double c = vertice3.distancia(vertice1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Calcula el perímetro del triángulo.
     * @return Perímetro del triángulo
     */
    @Override
    public double perimetro() {
        return vertice1.distancia(vertice2) + 
               vertice2.distancia(vertice3) + 
               vertice3.distancia(vertice1);
    }

    /**
     * Rota el triángulo alrededor de su centro.
     * @param angulo Ángulo de rotación en grados
     */
    public void rotar(double angulo) {
        Punto centro = calcularCentro();
        vertice1 = vertice1.rotar(centro, angulo);
        vertice2 = vertice2.rotar(centro, angulo);
        vertice3 = vertice3.rotar(centro, angulo);
        System.out.println("Triángulo rotado " + angulo + " grados");
    }

    /**
     * Traslada el triángulo en el plano.
     * @param dx Desplazamiento en el eje x
     * @param dy Desplazamiento en el eje y
     */
    public void trasladar(double dx, double dy) {
        vertice1 = vertice1.trasladar(dx, dy);
        vertice2 = vertice2.trasladar(dx, dy);
        vertice3 = vertice3.trasladar(dx, dy);
        System.out.println("Triángulo trasladado");
    }

    /**
     * Calcula el centro del triángulo.
     * @return Punto que representa el centro del triángulo
     */
    private Punto calcularCentro() {
        double cx = (vertice1.getX() + vertice2.getX() + vertice3.getX()) / 3;
        double cy = (vertice1.getY() + vertice2.getY() + vertice3.getY()) / 3;
        return new Punto(cx, cy);
    }

    /**
     * Obtiene el vértice 1 del triángulo.
     * @return El vértice 1
     */
    public Punto getVertice1() {
        return vertice1;
    }

    /**
     * Establece el vértice 1 del triángulo.
     * @param vertice1 El nuevo vértice 1
     */
    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    /**
     * Obtiene el vértice 2 del triángulo.
     * @return El vértice 2
     */
    public Punto getVertice2() {
        return vertice2;
    }

    /**
     * Establece el vértice 2 del triángulo.
     * @param vertice2 El nuevo vértice 2
     */
    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    /**
     * Obtiene el vértice 3 del triángulo.
     * @return El vértice 3
     */
    public Punto getVertice3() {
        return vertice3;
    }

    /**
     * Establece el vértice 3 del triángulo.
     * @param vertice3 El nuevo vértice 3
     */
    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }
}

