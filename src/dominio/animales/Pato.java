package dominio.animales;

/**
 * Clase que demuestra herencia simple de clase y múltiple de interfaces.
 * Un Pato 'es un' Animal y además 'implementa' IVolador e INadador.
 */
public class Pato extends Animal implements IVolador, INadador {

    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: Cuac Cuac!");
    }

    // Obligado a implementar por interfaz IVolador
    @Override
    public void volar() {
        System.out.println(nombre + " está volando por los aires.");
    }

    // Obligado a implementar por interfaz INadador (Método 1)
    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando en el lago.");
    }

    // Implementación de Sobrecarga 1
    @Override
    public void nadar(int distancia) {
        System.out.println(nombre + " nadó una distancia de " + distancia + " metros.");
    }

    // Implementación de Sobrecarga 2
    @Override
    public void nadar(int distancia, String estilo) {
        System.out.println(nombre + " nadó " + distancia + " metros usando el estilo " + estilo + ".");
    }
}
