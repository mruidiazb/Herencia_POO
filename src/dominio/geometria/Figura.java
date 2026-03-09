package dominio.geometria;

/**
 * Clase Abstracta: No puede ser instanciada con 'new'.
 * Sirve como modelo base estricto para otras clases.
 */
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    // Método abstracto: No tiene cuerpo en la clase base.
    // Todas las subclases DEBEN implementar este método.
    public abstract double calcularArea();

    // Método concreto (no abstracto) que las subclases heredan tal cual
    public void mostrarColor() {
        System.out.println("El color de la figura es: " + color);
    }
}
