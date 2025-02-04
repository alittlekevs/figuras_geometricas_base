
class Cuadrado extends FiguraGeometrica {
    private Punto esquina;
    private double lado;

  
  
    public Cuadrado(String nombre, String color, Punto esquina, double lado) {
        super(nombre, color);
        this.esquina = esquina;
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void rotar(double angulo) {
        System.out.println("Cuadrado rotado en " + angulo + " grados alrededor de la esquina " + esquina.x + ", " + esquina.y);
    }

    @Override
    public void trasladar(double dx, double dy) {
        esquina.x += dx;
        esquina.y += dy;
        System.out.println("Cuadrado trasladado a nueva posición: (" + esquina.x + ", " + esquina.y + ")");
    }
}
