package dominio.animales;

/**
 * Clase para demostrar Polimorfismo.
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método genérico que será sobreescrito por las subclases
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo. Zzz...");
    }
}
