package dominio.geometria;

/**
 * Subclase que hereda de una clase abstracta
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Es OBLIGATORIO implementar (sobreescribir) los métodos abstractos heredados
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
