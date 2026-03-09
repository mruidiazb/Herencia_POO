package dominio.animales;

/**
 * Subclase de Animal.
 */
public class Perro extends Animal implements INadador {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Guau Guau!");
    }

    // Método propio de Perro
    public void ladrarFuerte() {
        System.out.println("¡WOOF WOOF!");
    }

    // Obligado a implementar por interfaz INadador (Método 1)
    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando con estilo perrito.");
    }

    // Implementación de Sobrecarga 1
    @Override
    public void nadar(int distancia) {
        System.out.println(nombre + " nadó una distancia de " + distancia + " metros rápidamente.");
    }

    // Implementación de Sobrecarga 2
    @Override
    public void nadar(int distancia, String estilo) {
        System.out.println(nombre + " nadó " + distancia + " metros intentando el estilo " + estilo
                + ", pero prefirió el estilo perrito.");
    }
}
