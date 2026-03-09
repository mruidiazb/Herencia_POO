package dominio.utilidades;

/**
 * El modificador 'final' en clases previene la herencia.
 * Ninguna otra clase puede usar 'extends ConstanteClase'.
 */
public final class ConstanteClase {

    // 'final' en variables previene la modificación de su valor (Constantes)
    public static final double GRAVEDAD = 9.81;

    // 'final' en métodos previene que sean sobreescritos (overridden) por subclases
    // (Aun si la clase no fuera final, este método no podría ser modificado por
    // herencia)
    public final void mostrarMensajeFijo() {
        System.out.println("Este método no puede ser sobreescrito.");
    }
}
