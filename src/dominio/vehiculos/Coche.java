package dominio.vehiculos;

/**
 * Clase Hija (Subclase)
 * Utiliza la palabra reservada 'extends' para heredar de Vehiculo.
 */
public class Coche extends Vehiculo {
    private int numeroPuertas;

    // Constructor de la subclase
    public Coche(String marca, String modelo, int ano, int numeroPuertas) {
        // La palabra reservada 'super' se usa para llamar al constructor de la
        // superclase.
        // Debe ser la primera instrucción en el constructor de la subclase.
        super(marca, modelo, ano);
        this.numeroPuertas = numeroPuertas;
        System.out.println("Coche: Constructor invocado.");
    }

    // Overriding (Sobreescritura de métodos)
    // Se usa la anotación @Override para indicar que estamos redefiniendo un método
    // de la superclase
    @Override
    public void arrancar() {
        // Podemos usar super.arrancar() para llamar también a la lógica del padre
        super.arrancar();
        System.out.println("El coche tiene " + numeroPuertas + " puertas y está listo para circular.");
    }

    public void activarAireAcondicionado() {
        System.out.println("Aire acondicionado activado en el coche.");
    }
}
