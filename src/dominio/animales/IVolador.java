package dominio.animales;

/**
 * Interfaz en Java.
 * Como Java no soporta herencia múltiple de clases, utilizamos interfaces
 * para implementar 'herencia múltiple de tipos'
 */
public interface IVolador {
    // Por defecto, los atributos en interfaces son 'public static final'
    int ALTITUD_MAXIMA = 10000;

    // Por defecto, los métodos son 'public abstract' (hasta Java 8)
    void volar();

    // Desde Java 8, se pueden incluir métodos 'default' con implementación
    default void aterrizar() {
        System.out.println("Aterrizando de forma genérica...");
    }
}
